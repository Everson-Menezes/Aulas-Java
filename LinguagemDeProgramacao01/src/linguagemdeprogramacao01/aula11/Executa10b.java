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
public class Executa10b extends Classe10b {

    public double saldo, media;
    public int qtpress;

    public String exibir() {
        
        saldo = 422.26;
        qtpress = 4;
        media = 105.56;
        return "saldo: " + saldo + "\nQuantidades de parcelas: " + qtpress
                + "\n média: " + media;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Executa10b e = new Executa10b();

        int tecla = 0;
        while (tecla != 4) {
            System.out.println("\nmenu\n1 Ler\n2 Calcular\n3 Exibir\n4 Sair\nItem:");
            tecla = leitor.nextInt();
            if (tecla == 1) {
                e.ler();
            } else if (tecla == 2) {
                e.calcular();
            } else if (tecla == 3) {
                System.out.println(e.exibir());
            }
        }
        System.out.println("\nPrograma finalizado!");
        System.exit(0);
    }
}
