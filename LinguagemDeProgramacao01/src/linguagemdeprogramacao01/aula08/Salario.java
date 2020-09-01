package linguagemdeprogramacao01.aula08;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class Salario {

    public double sm, pr, ns;
    Scanner teclado = new Scanner(System.in);

    public void ler() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o salário mensal: ");
        sm = teclado.nextInt();

        System.out.println("Digite o percentual de reajuste: ");
        pr = teclado.nextInt();
    }

    public double calcular() {
        ns = sm + ((sm * pr)/100);
        return ns;
    }

    public void exibir() {
        System.out.println("O novo salário será de: " + ns);  
    }
    
    public static void main(String[] args) {   
        Salario s = new Salario();
        s.ler();
        s.calcular();
        s.exibir();
    }
}
