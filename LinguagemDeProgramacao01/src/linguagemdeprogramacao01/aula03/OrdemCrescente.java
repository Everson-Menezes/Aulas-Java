package linguagemdeprogramacao01.aula03;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class OrdemCrescente {

    private double a, b, c, aux;
    Scanner teclado = new Scanner(System.in);

    public void exibir() {

        System.out.println("Digite três números separados por ENTER: ");
        a = teclado.nextDouble();//3
        b = teclado.nextDouble();//2
        c = teclado.nextDouble();//1     

        if (a >= c) {
            if (c > b) {
                aux = c;
                c = b;
                b = aux;
            } else if (c > b) {
                aux = b;
                b = c;
                a = aux;
            } else if (b > a) {
                aux = b;
                b = a;
                a = aux;
            }
        } else {
            aux = c;
            c = a;
            a = aux;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
