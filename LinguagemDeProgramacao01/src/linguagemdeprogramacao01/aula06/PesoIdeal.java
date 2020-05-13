package linguagemdeprogramacao01.aula06;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class PesoIdeal {

    public float altura;
    public String sexo;

    Scanner teclado = new Scanner(System.in);

    public void ler() {
        System.out.println("Digite sua altua: ");
        this.altura = teclado.nextInt();
        System.out.println("Qual seu sexo digite 1 para feminino e 2 para masculino");
        int menu = teclado.nextInt();
        switch (menu) {
            case 1: {
                this.sexo = "feminino";
            }
            break;
            case 2: {
                this.sexo = "masculino";
            }
            break;

        }

    }

    public double calcular() {
        double pesoIdeal = 0;

        if (this.sexo.equals("feminino")) {
            pesoIdeal = (62.1 * this.altura) - 44.7;
        } else if (this.sexo.equals("masculino")) {
            pesoIdeal = (72.7 * this.altura) - 58;
        }
        return pesoIdeal;
    }

    public void exibir() {
        System.out.println("O peso ideal para uma pessoa do sexo: " + this.sexo + " é de : " + calcular());
    }

    public static void main(String[] args) {
        PesoIdeal p = new PesoIdeal();
        p.ler();
        p.calcular();
        p.exibir();
    }
}
