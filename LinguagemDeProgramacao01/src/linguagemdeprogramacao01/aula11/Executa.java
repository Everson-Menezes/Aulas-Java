/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linguagemdeprogramacao01.aula11;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class Executa extends Triangulo {

    public double hipotenusa;
    public double media;

    public void setMedia(double saldo, int contador) {

        media += area / contador;
        System.out.println("Média = " + media);

    }

    public void exibirHipotenusa() {
        super.exibir(); // chama void exibir() da classe mãe    
        hipotenusa = Math.sqrt(base * base + altura * altura);
        System.out.println("\nHipotenusa" + this.hipotenusa);
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Executa e1 = new Executa();
        int contador = 1;
        double saldo = 0;
        int tecla = 0;
        while (tecla != 4) {
            System.out.println("\nmenu\n1 Ler\n2 Calcular\n3 Exibir\n4 Sair\nItem:");
            tecla = leitor.nextInt();
            if (tecla == 1) {
                e1.set_base(leitor);
                e1.set_altura(leitor);
            } else if (tecla == 2) {
                e1.set_area();
                saldo += e1.area;
                contador ++;
            } else if (tecla == 3) {
                e1.setMedia(saldo, contador);
                e1.exibirHipotenusa();

            }
        }
        System.out.println("\nPrograma finalizado!");
        System.exit(0);
    }
}
