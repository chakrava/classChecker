/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classschedule;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Chaos
 */
public class CRender extends DefaultTableCellRenderer{  
    public CRender()
    {  
        super();  
        setOpaque(true);  
    }   
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,   
            boolean isSelected, boolean hasFocus, int row, int column)   
    {   
        if(table.getRowCount()>0)
            switch((int)table.getValueAt(row,table.getColumnCount()-1)){//look at the last column of the table, color row based off # found
                case 0:
                    //System.out.println("0");
                    setBackground(Color.white);
                    setForeground(Color.black);
                    break;
                case 1:
                    //System.out.println("1");
                    setBackground(Color.white);
                    setForeground(Color.red);
                    break;
                case 2:
                    //System.out.println("2");
                    setBackground(Color.white);
                    setForeground(Color.orange);
                    break;
                default:
                    //System.out.println("D");
                    setBackground(Color.white);
                    setForeground(Color.black);
                    break;
            }
        
        setText(value !=null ? value.toString() : "");
        return this;
    }
}