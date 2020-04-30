package linguagemdeprogramacao01.aula03;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class Modulo {
    
    private int a;
    
    Scanner teclado = new Scanner(System.in);
    
    public void modulo(){
        System.out.println("Digite um número: ");
        a = teclado.nextInt();
        if(a>0){
            System.out.println("O modulo do número digitado é: " + a);
        }else{
            a = a*(-1);
            System.out.println("O modulo do número digitado é: " + a);
        }
    }
    
}
