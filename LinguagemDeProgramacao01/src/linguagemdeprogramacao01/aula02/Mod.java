package linguagemdeprogramacao01.aula02;
import javax.swing.JOptionPane;

/**
 *
 * @author everson.menezes
 */
public class Mod {
//Atributos
public int n;
public String msg;
final int d = 3;
//Métodos
public void ler(){
  n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número (INTEIRO)", "Caluladora", JOptionPane.WARNING_MESSAGE));
}
public void exibir(){
  if (n%d == 0){
    msg = "O número: " + n + " é completamente divisível por 3";
  }else {
    msg = "O número: " + n + " não é completamente divisível por 3";
  }
  JOptionPane.showMessageDialog(null, msg, "Cálculo do MOD 3", JOptionPane.INFORMATION_MESSAGE);
}
}