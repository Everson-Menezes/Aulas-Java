package linguagemdeprogramacao01.aula02;
import javax.swing.JOptionPane;


/**
 *
 * @author everson.menezes
 */

public class Eleitor {
//Atributos
private int idade;
private String cEle;

//Métodos
public void ler(){
  //idade = int.parseInteger(JOptionPane.showInputDialog(null, "Digite um número (INTEIRO)", "titulo", WARNING_MESSAGE););
  idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número (INTEIRO)","Leitura",JOptionPane.WARNING_MESSAGE));
}
public void exibir(){
  if (idade >= 18 && idade <=65){
    cEle = "Com a idade de: " + idade + " anos o voto é obrigatório";
  }else if (idade >= 16 || idade > 65){
    cEle = "Com a idade de: " + idade + " anos o voto é facultativo";
  }  else  {
    cEle = "Com a idade de: " + idade + " anos não pode votar";
    }
  JOptionPane.showMessageDialog(null, cEle, "Verificador eleitoral", JOptionPane.INFORMATION_MESSAGE);
}
}
