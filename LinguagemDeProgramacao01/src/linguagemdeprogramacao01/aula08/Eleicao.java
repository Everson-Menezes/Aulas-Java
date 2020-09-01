package linguagemdeprogramacao01.aula08;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class Eleicao {

    public int a, b, c, votosValidos, votosNulos, votosBrancos, eleitores;
    public double pctV, pctVA, pctVB, pctVC, pctN, pctB;
    Scanner teclado = new Scanner(System.in);

    public void ler() {
        System.out.println("Digite a quatidade de votos Nulos: ");
        votosNulos = teclado.nextInt();
        System.out.println("Digite a quatidade de votos Brancos: ");
        votosBrancos = teclado.nextInt();
        System.out.println("Digite a quatidade de votos do candidato A: ");
        a = teclado.nextInt();
        System.out.println("Digite a quatidade de votos do candidato B: ");
        b = teclado.nextInt();
        System.out.println("Digite a quatidade de votos do candidato C: ");
        c = teclado.nextInt();
    }

    public boolean calcular() {
        votosValidos = a + b + c;
        eleitores = votosValidos + votosBrancos + votosNulos;
        pctV = (votosValidos / (double) eleitores) * 100;
        pctVA = (a / (double)eleitores) * 100;
        pctVB = (b / (double) eleitores) * 100;
        pctVC = (c / (double) eleitores) * 100;
        pctN = (votosNulos / (double) eleitores) * 100;
        pctB = (votosBrancos / (double) eleitores) * 100;
        return true;
    }

    public void exibir() {
        System.out.println("o número total de eleitores é: " + eleitores);
        System.out.println("O percentual de votos válidos é: " + pctV + "%");
        System.out.println("O percentual de votos válidos do Candidato A é: " + pctVA + "%");
        System.out.println("O percentual de votos válidos do Candidato B é: " + pctVB + "%");
        System.out.println("O percentual de votos válidos do Candidato C é: " + pctVC + "%");
        System.out.println("O percentual de votos nulos é: " + pctN + "%");
        System.out.println("O percentual de votos branco é: " + pctB + "%");

    }

    public static void main(String[] args) {

        Eleicao e = new Eleicao();
        e.ler();
        e.calcular();
        e.exibir();
    }
}
