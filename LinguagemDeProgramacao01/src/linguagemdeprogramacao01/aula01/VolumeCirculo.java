package linguagemdeprogramacao01.aula01;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class VolumeCirculo {
// Atributos

    final double PI = 3.14159;
    public double r;
    public double altura;
    public double volume;

//Métodos
    public void ler() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o raio da circunferência: ");
        r = teclado.nextDouble();
        System.out.print("Digite a altura da circunferência: ");
        altura = teclado.nextDouble();

    }

    public void calcV() {
        volume = PI * r * r * altura;
    }

    public void exibir() {
        System.out.print("O volume da lata de óleo é: " + this.volume);
    }
}
