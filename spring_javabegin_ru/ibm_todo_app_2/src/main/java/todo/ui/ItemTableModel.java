package todo.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.table.AbstractTableModel;
import java.util.List;

@Configuration
public class ItemTableModel extends AbstractTableModel {

    @Autowired
    @Qualifier(value = "itemList")
    private List itemList;

    public ItemTableModel(){ }

    public ItemTableModel(List itemList){
        this.itemList = itemList;
    }

    @Bean
    public ItemTableModel itemTableModel(){
        return new ItemTableModel(itemList);
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    public int getColumnCount() {
        return 1;
    }

    public String getColumnName(int column) {
        return "Items";
    }

    public void setItemList(List itemList) {
        this.itemList = itemList;
    }

    public int getRowCount() {
        return itemList.size();
    }

    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        itemList.set(rowIndex, value);
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        return itemList.get(rowIndex);
    }
}