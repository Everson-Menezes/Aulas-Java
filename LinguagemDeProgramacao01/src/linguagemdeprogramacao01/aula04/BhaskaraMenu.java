package linguagemdeprogramacao01.aula04;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class BhaskaraMenu {

    Scanner teclado = new Scanner(System.in);
    double a, b, c, d, x1, x2;
    

    /*    do {
      *      System.out.println("Digite o valor de A diferente de zero: ");
      *       a = teclado.nextDouble();
      *   } while (a == 0 );
     */
    public void ler() {
        System.out.println("Digite o valor de A, B, C separados por ENTER: ");
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        if (a == 0) {
            System.out.println("Por favor digite um valor diferente de zero.");
            a = teclado.nextDouble();
        } else if (b == 0) {
            System.out.println("Por favor digite um valor diferente de zero.");
            b = teclado.nextDouble();
        } else if (c == 0) {
            System.out.println("Por favor digite um valor diferente de zero.");
            c = teclado.nextDouble();
        }
    }//Fim ler

    public void calcular() {
        d = Math.pow(b, 2) - 4 * a * c;
        System.out.println("O valor de DELTA é: " + d);
        if (d < 0) {
            System.out.println("A equação não possui resultados reais para X ");
        } else if (d == 0) {
            x1 = (-b + Math.sqrt(d)) / 2 * a;
            System.out.println("A equação possui apenas um resultado real " + x1);
        } else {
            x1 = (-b + Math.sqrt(d)) / 2 * a;
            x2 = (-b - Math.sqrt(d)) / 2 * a;
            System.out.println("O valor de X1 é: " + x1);
            System.out.println(" e o valor de X2 é: " + x2);
        }
    }//Fim calcular

    public static void main(String[] args) {
        
        int menu;
        Scanner teclado = new Scanner(System.in);
        BhaskaraMenu b1 = new BhaskaraMenu();
        System.out.println("Digite 1 para inserir, calcular e exibir os dados");
        System.out.println("Digite 2 para  para sair");

        menu = teclado.nextInt();

        switch (menu) {
            case 1: {

                b1.ler();
                b1.calcular();
            }
            break;
            case 2: {
                System.out.println("Até mais!");
                System.exit(0);

            }
            break;
        }
    }
}
