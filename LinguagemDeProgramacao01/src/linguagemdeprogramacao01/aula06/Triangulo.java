package linguagemdeprogramacao01.aula06;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class Triangulo {

    public int anguloA, anguloB, anguloC;
    public String triangulo;

    Scanner teclado = new Scanner(System.in);

    public void ler() {
        System.out.println("Digite o valor do angulo A: ");
        this.anguloA = teclado.nextInt();
        System.out.println("Digite o valor do angulo B: ");
        this.anguloB = teclado.nextInt();
        System.out.println("Digite o valor do angulo C: ");
        this.anguloC = teclado.nextInt();

    }

    public String verificar() {
        if (this.anguloA < 90 && this.anguloB < 90 && this.anguloC < 90) {
            this.triangulo = "Triângulo Acutângulo";
        }
        if (this.anguloA == 90 || this.anguloB == 90 || this.anguloC == 90) {
            this.triangulo = "Triângulo Retângulo";
        } else if (this.anguloA > 90 || this.anguloB > 90 || this.anguloC > 90) {
            this.triangulo = "Triângulo Obtusângulo";
        }

        return this.triangulo;
    }

    public void exibir() {
        System.out.println("É um  triângulo: " + this.triangulo);
    }

}
