/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendendojava.DAO;

import aprendendojava.model.Alunos;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Laryssa
 */
public class AlunoDAO {


    public List<Alunos> listAlunos(){
      
          
        List<Alunos> listaAlunos = new ArrayList<Alunos>();
      
        
        Alunos al1 = new Alunos();
        al1.setCodigo(1);
        al1.setNome("Welton Silva");
        Calendar cal = Calendar.getInstance();
        cal.set(2001, 01, 03);
        al1.setNascimento(cal.getTime());
        listaAlunos.add(al1);
  
        
        
        Alunos al2 = new Alunos();
        al2.setCodigo(2);
        al2.setNome("José Silva");
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2000, 04, 03);
        al2.setNascimento(cal2.getTime());
        listaAlunos.add(al2);
       
        
        Alunos al3 = new Alunos();
        al3.setCodigo(3);
        al3.setNome("Marcio Silva");
        Calendar cal3 = Calendar.getInstance();
        cal3.set(2000, 04, 03);
        al3.setNascimento(cal3.getTime());
        listaAlunos.add(al3);
       
        Alunos al4 = new Alunos();
        al4.setCodigo(2);
        al4.setNome("Romeu Silva");
        Calendar cal4 = Calendar.getInstance();
        cal4.set(2000, 04, 03);
        al4.setNascimento(cal4.getTime());
        listaAlunos.add(al4);
       
        
        return listaAlunos;
    }
    
}
