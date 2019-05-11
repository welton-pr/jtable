package aprendendojava.view.TelaPrincipal;

import aprendendojava.DAO.AlunoDAO;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Welton Silva
 */
public class TelaPrincipal extends JFrame{
    
    public TelaPrincipal(){
        initComponents();
    }
    
    private void initComponents(){
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  
        JTable tbAlunos = new JTable();
        JScrollPane sp = new JScrollPane(tbAlunos);
   
        tbAlunos.setModel(new AbstractTableAluno(new AlunoDAO().listAlunos()));
        tbAlunos.setDefaultRenderer(Object.class, new RenderTable());
        tbAlunos.setRowHeight(30);
        
        this.add(sp);
    }       
}
