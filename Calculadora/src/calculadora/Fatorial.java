package calculadora;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class Fatorial {

    //Atributos
    private int num, aux, fat, total;
    //fim atributos

    Scanner teclado = new Scanner(System.in);

    public void fat() {
        System.out.println("Digite o número: ");
        num = teclado.nextInt();
        if (num == 1 || num == 0) {

        } else {

            fat = num;
            for (aux = 1; aux < num; aux++) {

                total = fat * (num - aux);
                fat = total;
            }
        }
        System.out.println("O fatorial de " + num + " é: " + total);

    }

}
