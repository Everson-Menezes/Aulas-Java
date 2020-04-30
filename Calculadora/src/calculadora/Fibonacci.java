package calculadora;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class Fibonacci {

    //Atributos
    private int num, a = 0, b = 1, aux, fib;

    Scanner teclado = new Scanner(System.in);

    public void sequeciaFibonacci() {
        num = teclado.nextInt();

        /* fib = 0 + 0
          fib = 0 + 1
          fib = 1 + 1
          fib = 1 + 2
          fib = 2 + 3
          fib = 3 + 5
         */
        for (aux = 0; aux < num; aux++) {
            fib = a + b;
            a = b;
            b = fib;
        }
    }

}
