package linguagemdeprogramacao01.aula05;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class TrocaDeValores {

    public int x, y, aux;
    Scanner teclado = new Scanner(System.in);

    public void trocar() {
        System.out.println("Digite o valor de X: ");
        x = teclado.nextInt();
        System.out.println("Digite o valor de y: ");
        y = teclado.nextInt();

        System.out.println("valor de X é: " + x);
        System.out.println("valor de Y é: " + y);
        
        aux = x;
        x = y;
        y = aux;
        
        System.out.println("valor de X é: " + x);
        System.out.println("valor de Y é: " + y);
    }
}
