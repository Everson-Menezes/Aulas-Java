package linguagemdeprogramacao01.aula03;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class MaiorPeloMenor {
    private int a, b, dif;
    
    Scanner teclado = new Scanner(System.in);
    
    public void diferenca(){
        System.out.println("Digite um número: ");
        a = teclado.nextInt();
        System.out.println("Digite outro número: ");
        b = teclado.nextInt();
        if(a>b){
            dif = a-b;
            }else{
            dif = b-a;
        }System.out.println("A diferença do maior para o menor é: " + dif);
    }
}
