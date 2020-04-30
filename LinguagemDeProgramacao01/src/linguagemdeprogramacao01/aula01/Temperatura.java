package linguagemdeprogramacao01.aula01;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class Temperatura {
//Atributos

    public float Celsius;
    public float Fahrenheit;

// Métodos
    public void lerC() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a temperatura do dia: ");
        Celsius = teclado.nextFloat();
    }

    public void converter() {
        Fahrenheit = (9 * this.Celsius + 160) / 5;
    }

    public void mostrarConv() {
        System.out.print(this.Celsius + "Graus celsius é equivalente a: " + this.Fahrenheit + "graus fahrenheit");
    }

}
