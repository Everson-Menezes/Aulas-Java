package linguagemdeprogramacao01.aula02;
import javax.swing.JOptionPane;

/**
 *
 * @author everson.menezes
 */

public class PlanoDeSaude {
//Atributos
private String nome;
private int idade;
private double valor;

//Métodos
public void ler(){

nome = JOptionPane.showInputDialog(null,"Qual o nome: ", "Plano de Saude",JOptionPane.QUESTION_MESSAGE);
  
 idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Sua idade", "Plano de Saude", JOptionPane.WARNING_MESSAGE));
}
public void exibir(){
  if (idade <= 10){
    valor = 30;
  }else if(idade > 10 && idade <= 29){
      valor = 60;
  }else if (idade > 29 && idade <= 45){
        valor = 120;
  }else if (idade > 45 && idade <= 59){
          valor = 150;
  }else if(idade > 59 && idade <= 65){
            valor = 250;
          }else {
            valor = 400;
          }
         JOptionPane.showMessageDialog(null, valor, " É o valor do plano conforme sua idade", JOptionPane.INFORMATION_MESSAGE);
        }
      }

