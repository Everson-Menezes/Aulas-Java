package linguagemdeprogramacao01.aula08;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class ResultadoDoProduto {

    public int a, b, c, d, p, s;

    Scanner teclado = new Scanner(System.in);

    public void ler() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        a = teclado.nextInt();

        System.out.println("Digite outro número: ");
        b = teclado.nextInt();

        System.out.println("Digite outro número: ");
        c = teclado.nextInt();

        System.out.println("Digite outro número: ");
        d = teclado.nextInt();
    }

    public boolean calcular() {
        p = a * c;
        s = b + d;
        return true;
    }

    public void exibir() {
        System.out.println("o resultado do produto do primeiro com o terceiro é: " + p);
        System.out.println("e o resultado da soma do segundo com o quarto valor é: " + s);
    }

    public static void main(String[] args) {
        ResultadoDoProduto rp = new ResultadoDoProduto();
        rp.ler();
        rp.calcular();
        rp.exibir();
    }
}
