package linguagemdeprogramacao01.aula01;

/**
 *
 * @author everson.menezes
 */
import java.util.Scanner;

public class Desconto {
// Atributos

    private String nomeProd;
    private double valorUn;
    private double valorDes;
    final double desconto = 0.09;

//métodos
    public void ler() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o produto:");
        nomeProd = teclado.next();
        System.out.println("Digite o valor unitário do produto:");
        valorUn = teclado.nextDouble();
    }

    public void Calcular() {
        valorDes = this.valorUn - (this.valorUn * this.desconto);
    }

    public void exibir() {
        System.out.print("O preço do " + this.nomeProd + " com desconto de 9% é: " + this.valorDes);

        System.out.println();
    }
}
