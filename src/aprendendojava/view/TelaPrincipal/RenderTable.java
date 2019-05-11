/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendendojava.view.TelaPrincipal;

import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Laryssa
 */
public class RenderTable implements TableCellRenderer{

            
    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean focus, int row, int col) {
        JPanel p = new JPanel();
        JLabel l = new JLabel((o).toString());
        //l.setBorder(new EmptyBorder(new Insets(0, 10, 0, 10)));
        if(row%2 == 0)
            p.setBackground(Color.GRAY);
        else
            p.setBackground(Color.WHITE);
        l.setForeground(Color.LIGHT_GRAY);
         p.add(l);
         return p;
    } 
}
