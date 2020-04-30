package calculadora;

import java.util.Scanner;

/*
 *
 * @author everson.menezes
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float n;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        n = teclado.nextFloat();
        System.out.println(n);
        

    }

}
