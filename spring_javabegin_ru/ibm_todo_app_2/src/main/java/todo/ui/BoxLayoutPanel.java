package todo.ui;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;
import java.awt.*;
import java.util.Iterator;
import java.util.List;

@Configuration
public class BoxLayoutPanel extends JPanel implements InitializingBean {

    private int axis;
    private List panelComponents;

    @Autowired
    @Qualifier(value = "panelComponentsListBean_First")
    private List panelComponentsList_First;

    @Autowired
    @Qualifier(value = "panelComponentsListBean_Two")
    private List panelComponentsList_Two;

    /*@Autowired
    @Qualifier(value = "itemScrollPane")
    private JScrollPane jScrollPane;*/

    public BoxLayoutPanel() {
    }

    public BoxLayoutPanel(int axis, List panelComponents) {
        this.axis = axis;
        this.panelComponents = panelComponents;
    }

    @Bean
    public BoxLayoutPanel buttonPanel(){
        return new BoxLayoutPanel(0, panelComponentsList_First);
    }

    @Bean
    public BoxLayoutPanel mainPanel(){
        return new BoxLayoutPanel(1, panelComponentsList_Two);
    }

    public void setAxis(int axis) {
        this.axis = axis;
    }

    public void setPanelComponents(List panelComponents) {
        this.panelComponents = panelComponents;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        setLayout(new BoxLayout(this, axis));

        for (Iterator iter = panelComponentsList_First.iterator(); iter.hasNext(); ) {
            Component component = (Component) iter.next();
            add(component);
        }
    }

}