package Entradas;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class CellRender extends DefaultTableCellRenderer {
   
    public CellRender(){
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
    
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        /*if(String.valueOf(table.getValueAt(row, 1)).equals("1")){
          component.setBackground(new java.awt.Color(42, 202, 52));
          setForeground(Color.white);*/
        
        if(  (Integer.parseInt(table.getValueAt(row, 1).toString()) >= 1) && 
             (Integer.parseInt(table.getValueAt(row, 1).toString()) <= 5)   ){
                      
            component.setBackground(new java.awt.Color(42, 202, 52));
            setForeground(Color.white);
          
        }else{
          component.setBackground(Color.white);
          setForeground(Color.black);
        
        }
        
        setHorizontalAlignment(SwingConstants.CENTER);
        
        if(isSelected){
          component.setBackground(new java.awt.Color(0, 102, 204));
          setForeground(Color.white);
        }        
        
        return component;
    }

}
