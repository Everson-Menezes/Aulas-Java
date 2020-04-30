package linguagemdeprogramacao01.aula03;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class Bhaskara {

    Scanner teclado = new Scanner(System.in);

    public void bhaskara() {
        double a, b, c, d, x1, x2;
        do {
            System.out.println("Digite o valor de A diferente de zero: ");
            a = teclado.nextDouble();
        } while (a == 0);
        System.out.println("Digite o valor de B: ");
        b = teclado.nextDouble();
        System.out.println("Digite o valor de C: ");
        c = teclado.nextDouble();

        d = Math.pow(b, 2) - 4 * a * c;
        System.out.println("O valor de DELTA é: " + d);
        if (d < 0) {
            System.out.println("A equação não possui resultados reais para X ");

        } else if (d == 0) {
            x1 = (-b + Math.sqrt(d)) / 2 * a;
            System.out.println("A equação possui apenas um resultado real" + x1);
        } else {
            x1 = (-b + Math.sqrt(d)) / 2 * a;
            x2 = (-b - Math.sqrt(d)) / 2 * a;
            System.out.println("O valor de X1 é: " + x1 + " e o valor de X2 é: " + x2);
        }
    }
}
