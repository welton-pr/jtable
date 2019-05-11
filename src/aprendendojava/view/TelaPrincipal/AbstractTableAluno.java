/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendendojava.view.TelaPrincipal;

import aprendendojava.model.Alunos;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Laryssa
 */
public class AbstractTableAluno extends AbstractTableModel{
    
    String[] colunas = {"Código", "Nome", "Nascimento"};
    List<Alunos> listaAlunos = null;
    
    public AbstractTableAluno(List<Alunos> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
 
    
    @Override
    public int getRowCount() {
        return listaAlunos.size();
    }

     @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public String getColumnName(int num){
        return this.colunas[num];
    }
    
   

    @Override
    public Object getValueAt(int row, int col) {
        switch(col){
            case 0: return listaAlunos.get(row).getCodigo();
            case 1: return listaAlunos.get(row).getNome();
            case 2: return listaAlunos.get(row).getNascimento();
        }
        return null;
    }
    
}
