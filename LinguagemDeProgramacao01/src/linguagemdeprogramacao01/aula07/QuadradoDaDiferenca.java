package linguagemdeprogramacao01.aula07;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class QuadradoDaDiferenca {

    public int A, B;

    public void ler() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        A = teclado.nextInt();

        System.out.println("Digite outro número inteiro: ");
        B = teclado.nextInt();
    }

    public double calcular() {

        return Math.pow((A - B), 2);
    }

    public void exibir() {
        System.out.println("O resultado do quadrado da diferença do primeiro valor pelo segundo é: " + calcular());
    }

    public static void main(String[] args) {
        QuadradoDaDiferenca q = new QuadradoDaDiferenca();
        q.ler();
        q.calcular();
        q.exibir();
    }
}
