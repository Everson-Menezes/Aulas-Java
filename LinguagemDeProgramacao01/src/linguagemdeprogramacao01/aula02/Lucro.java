package linguagemdeprogramacao01.aula02;
import javax.swing.JOptionPane;

/**
 *
 * @author everson.menezes
 */
public class Lucro {
//Atributos
private double vComp;
private double vVend;

//Métodos
public void ler(){
  vComp = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de compra do produto(Subistitua virgula por ponto)", "titulo", JOptionPane.WARNING_MESSAGE));
}
public void calcular(){
  if (vComp < 20){
      vVend = vComp * 1.45;//ponto ou vírgula
  }
  else {vVend = vComp * 1.3;//ponto ou vírgula
  }
  }
  public void exibir(){
  JOptionPane.showMessageDialog(null, vVend, " é o valor a ser vendido", JOptionPane.INFORMATION_MESSAGE);
}
}


