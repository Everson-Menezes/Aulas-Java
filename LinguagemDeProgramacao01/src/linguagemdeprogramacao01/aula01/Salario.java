package linguagemdeprogramacao01.aula01;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class Salario {

// Atributos
    public double sal_mini;
    public double sal_equi;
    final double sal = 1039;

// Métodos
    public void lerSal() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário: ");
        sal_mini = leitura.nextDouble();
    }

    public void calcSal() {
        sal_equi = sal_mini / sal;
    }

    public void mostrarSal() {
        System.out.print("O seu salário atual é equivalente a " + this.sal_equi + " salários mínimos");

        System.out.println();
    }
}
