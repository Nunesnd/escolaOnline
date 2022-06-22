/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package escola_online;

import Models.Aluno;
import Models.Professor;
import javax.swing.JOptionPane;

/**
 *
 * @author nunes
 */
public class Escola_online {

    public static void main(String[] args) {
        
        
        // INICIO DE CÓDIGOS DE TESTE DE FUNCIONAMENTO
        Aluno aluno1 = new Aluno(876, "João", "29/12/1900", 122, 'M', 3, 6);
        
        Professor prof = new Professor(234, "Tião", "01/01/2020", 'F', "Bio", 45);
        
        JOptionPane.showMessageDialog(null,"Nome do aluno: "+aluno1.getNome()+"\nturma: "+aluno1.getTurma());
        JOptionPane.showMessageDialog(null,"Professor: "+prof.getNome());
        //FIM DOS TESTES DE FUNCIONAMENTO
        
    }
}
