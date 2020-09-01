package linguagemdeprogramacao01.aula08;
import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class Menu {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;
        do {
            int menu;
            System.out.println("Digite 1: ResultadoDoProduto \n Digite 2: Salário \n Digite 3: Eleição \n Digite 4: Sair");
            
            menu = teclado.nextInt();
            
            switch (menu) {
                case 1: {
                    ResultadoDoProduto rp = new ResultadoDoProduto();
                    rp.ler();
                    rp.calcular();
                    rp.exibir();
                }
                break;
                case 2: {
                    Salario s = new Salario();
                    s.ler();
                    s.calcular();
                    s.exibir();
                }
                break;
                case 3: {
                    Eleicao e = new Eleicao();
                    e.ler();
                    e.calcular();
                    e.exibir();
                }
                break;
                case 4: {
                    System.exit(0);
                }
                break;
            }
            System.out.println("Deseja continuar true/false");
            continuar = teclado.nextBoolean();
        } while (continuar == true);
    }
}
