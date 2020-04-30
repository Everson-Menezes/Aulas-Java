package linguagemdeprogramacao01.aula04;
import javax.swing.JOptionPane;


/**
 *
 * @author everson.menezes
 */
public class Triangulos {
    private double a, b, c, ar, s;
    private String tipo;
        
    public void ler(){

        a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de A: ","Leitura",JOptionPane.WARNING_MESSAGE));
        b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de B: ","Leitura",JOptionPane.WARNING_MESSAGE));
        c = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de C: ","Leitura",JOptionPane.WARNING_MESSAGE));
        if (a == b && b == c){
            tipo = "Equilatero!";
        }else if (a != b && b != c){
            tipo = "Escaleno!";
        }else{
            tipo = "Isósceles!";
        }
}//Fim ler
    public void calcular(){
        
        s = (a + b + c)/2;
        ar = Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }

   
    
    public static void main(String[] args) {
        
        int menu;
        Triangulos t = new Triangulos();
        menu = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite 1 para ler, calcular e exibir ou 2 para sair)","Leitura",JOptionPane.WARNING_MESSAGE));

        switch (menu) {
            case 1: {

                t.ler();
                t.calcular();
                t.exibir();
            }
            break;
            case 2: {
                System.out.println("Até mais!");
                System.exit(0);

            }
            break;
        }
    }

    private void exibir() {
        JOptionPane.showMessageDialog(null,"A: " + a, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "B: " + b, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"C: " + c, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"TIPO: " + tipo, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"s: " + s, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "AR: " + ar, "Resultado", JOptionPane.INFORMATION_MESSAGE);
      
        
    }
}

