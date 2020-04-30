package linguagemdeprogramacao01.aula01;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class Media {

//Atributos
    public float valor1;
    public float valor2;
    public float media;

//Métodos
    public void entrada() {
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite um número:");
        valor1 = dados.nextFloat();
        System.out.println("Digite um segundo número:");
        valor2 = dados.nextFloat();
    }

    public void calcM() {
        media = (valor1 + valor2) / 2;

    }

    public void show() {
        System.out.println("A média entre: " + this.valor1 + "e" + this.valor2 + "é: " + this.media);
    }
}
