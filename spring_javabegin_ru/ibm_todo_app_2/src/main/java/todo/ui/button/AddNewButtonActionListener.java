package todo.ui.button;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.List;

@Configuration
public class AddNewButtonActionListener extends ListTableActionListener {

    @Autowired
    @Qualifier(value = "itemList")
    private List items;

    @Autowired
    @Qualifier(value = "itemTable")
    private JTable jTable;

    public AddNewButtonActionListener() {
    }

    public AddNewButtonActionListener(List items, JTable jTable) {
        this.items = items;
        this.jTable = jTable;
    }

    @Bean
    public AddNewButtonActionListener addNewButtonActionListener() {
        return new AddNewButtonActionListener(list, jTable);
    }


    public void actionPerformed(ActionEvent e) {
        list.add("New Item");
        table.revalidate();
    }

}