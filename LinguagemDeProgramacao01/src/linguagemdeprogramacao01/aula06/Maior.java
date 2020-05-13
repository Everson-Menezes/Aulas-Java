package linguagemdeprogramacao01.aula06;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class Maior {

    public int a, b, c, maior;

    Scanner teclado = new Scanner(System.in);

    public void verificar() {
        if (a == b || a == c || b == c) {
            System.out.println("Valores iguais não são permitidos!");
        } else {
            if (a > b) {
                if (b > c) {
                    maior = a;
                } else {
                    if (a < c) {
                        maior = c;
                    }else{
                        maior = a;
                    }
                }
            } else {
                if (b > c) {
                    maior = b;
                } else {
                    maior = c;
                }
            }
        }
    }

    public void exibir() {
        System.out.println("O maior valor é: " + this.maior);
    }

    public void ler() {
        System.out.println("Digite A: ");
        a = teclado.nextInt();
        System.out.println("Digite B: ");
        b = teclado.nextInt();
        System.out.println("Digite C: ");
        c = teclado.nextInt();
    }

    public static void main(String[] args) {
        Maior m = new Maior();
        m.ler();
        m.verificar();
        m.exibir();
    }
}
