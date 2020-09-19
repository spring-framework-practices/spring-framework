package todo.ui.button;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;
import java.awt.event.ActionListener;

@Configuration
public class ActionListenerButton extends JButton implements InitializingBean {

    private ActionListener actionListener;

    @Autowired
    @Qualifier(value = "addNewButtonActionListener")
    private AddNewButtonActionListener addNewButton;

    private String text;

    @Autowired
    @Qualifier(value = "deleteButtonActionListener")
    private DeleteButtonActionListener deleteButton;

    public ActionListenerButton(){ }

    public ActionListenerButton(AddNewButtonActionListener addNewButton, String text){
        this.addNewButton = addNewButton;
        this.text = text;
    }

    public ActionListenerButton(DeleteButtonActionListener deleteButton, String text){
        this.deleteButton = deleteButton;
        this.text = text;
    }

    @Bean
    public ActionListenerButton addNewButton (){
        return new ActionListenerButton(addNewButton, "Add New");
    }

    @Bean
    public ActionListenerButton deleteButton(){
        return new ActionListenerButton(deleteButton, "Delete");
    }

    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.addActionListener(actionListener);
    }

}