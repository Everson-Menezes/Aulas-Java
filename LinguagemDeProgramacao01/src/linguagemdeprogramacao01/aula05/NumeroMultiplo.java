package linguagemdeprogramacao01.aula05;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class NumeroMultiplo {

    Scanner teclado = new Scanner(System.in);

    public int n1, n2, mult2, mult3;

    public void Verificar() {

        System.out.println("Digite o primeiro número: ");
        n1 = teclado.nextByte();
        System.out.println("Digite o segundo número: ");
        n2 = teclado.nextByte();

        if (n1 % 2 == 0) {
            System.out.println("O número: " + n1 + " é multiplo de dois!");
        } else {
            System.out.println("O número: " + n1 + " não é multiplo de dois!");
        }
        if (n1 % 3 == 0) {
            System.out.println("O número: " + n1 + " é multiplo de três!");
        } else {
            System.out.println("O número: " + n1 + " , porém não é multiplo de três!");
        }

        if (n2 % 2 == 0) {
            System.out.println("O número: " + n2 + " é multiplo de dois!");
        } else {
            System.out.println("O número: " + n2 + " não é multiplo de dois!");
        }
        if (n2 % 3 == 0) {
            System.out.println("O número: " + n2 + " é multiplo de três!");
        } else {
            System.out.println("O número: " + n2 + " , porém não é multiplo de três!");
        }
    }

}
