package linguagemdeprogramacao01.aula07;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class SomaQuadrado {

    public double A, B, C;

    public void ler() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        A = teclado.nextInt();

        System.out.println("Digite outro número: ");
        B = teclado.nextInt();

        System.out.println("Digite outro número: ");
        C = teclado.nextInt();
    }

    public double calcular() {

        return Math.pow(A, 2) + Math.pow(B, 2) + Math.pow(C, 2);
    }

    public void exibir() {
        System.out.println("A soma dos quadrados dos três valores lidos é: " + calcular());
    }

    public static void main(String[] args) {

        SomaQuadrado sq = new SomaQuadrado();
        sq.ler();
        sq.calcular();
        sq.exibir();
    }
}
