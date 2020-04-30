package calculadora;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class Kaprekar {

    private int num, num2, num3, num4;
    private String valor;

    Scanner teclado = new Scanner(System.in);

    public void kaprekar() {
        System.out.println("Digite um nuúmero");
        num = teclado.nextInt();
        System.out.println("Digite um nuúmero");
        num2 = teclado.nextInt();

        num3 = num + num2;
        valor = num + "" + num2;
        num4 = num3 * num3;

        if (Integer.valueOf(valor) == num4) {
            System.out.println("É um número KAPREKAR");
            System.out.println(num4);
            System.out.println(valor);
        } else {
            System.out.println("Não é um número KAPREKAR");
            System.out.println(num4);
            System.out.println(valor);
        }
    }

}
