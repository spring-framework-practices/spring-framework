package todo.ui;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;
import java.awt.*;

@Configuration
public class MainFrame extends JFrame implements InitializingBean {

    @Autowired
    @Qualifier(value = "boxLayoutPanel")
    private BoxLayoutPanel boxLayoutPanel;

    private String title;

    public MainFrame(){ }

    public MainFrame(BoxLayoutPanel boxLayoutPanel, String title){
        this.boxLayoutPanel = boxLayoutPanel;
        this.title = title;
    }

    @Bean
    public MainFrame mainFrame(){
        return new MainFrame(boxLayoutPanel, "My To Do List");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new Dimension(600, 400));

        setVisible(true);
        setState(Frame.NORMAL);
        show();

    }

}