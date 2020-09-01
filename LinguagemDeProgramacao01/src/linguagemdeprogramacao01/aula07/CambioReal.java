package linguagemdeprogramacao01.aula07;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class CambioReal {

    public double dolar, cot;

    public void ler() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a cotação do dolar: ");
        cot = teclado.nextDouble();

        System.out.println("Digite quantos doláres você possui: ");
        dolar = teclado.nextDouble();
    }

    public double calcular() {

        return dolar * cot;
    }

    public void exibir() {
        System.out.println("$" + dolar + " doláres equivale a: R$" + calcular());
    }

    public static void main(String[] args) {

        CambioReal c = new CambioReal();
        c.ler();
        c.calcular();
        c.exibir();
    }
}
