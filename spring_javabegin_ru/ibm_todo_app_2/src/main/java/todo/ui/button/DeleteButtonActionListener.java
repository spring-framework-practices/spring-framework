package todo.ui.button;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.List;

@Configuration
public class DeleteButtonActionListener extends ListTableActionListener {

    @Autowired
    @Qualifier(value = "itemList")
    private List items;

    @Autowired
    @Qualifier(value = "itemTable")
    private JTable jTable;

    public DeleteButtonActionListener(){}

    public DeleteButtonActionListener(List items, JTable jTable){
        this.items = items;
        this.jTable = jTable;
    }

    @Bean
    public DeleteButtonActionListener deleteButtonActionListener(){
        return new DeleteButtonActionListener(items, jTable);
    }

    public void actionPerformed(ActionEvent e) {
        int selectedRow = table.getSelectedRow();

        if (selectedRow == -1) {
            // if there is no selected row, don't do anything
            return;
        }

        if (table.isEditing()) {
            // if we are editing the table, don't do anything
            return;
        }

        list.remove(selectedRow);
        table.revalidate();
    }

}