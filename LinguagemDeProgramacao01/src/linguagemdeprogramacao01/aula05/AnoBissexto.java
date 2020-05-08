/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linguagemdeprogramacao01.aula05;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class AnoBissexto {

    Scanner teclado = new Scanner(System.in);
    public int ano;
    public String msg;

    public void exibir() {
        System.out.println("Digite um ano qualquer: ");
        ano = teclado.nextInt();
        
        if (ano % 4 == 0) {
            if (ano % 100 == 0 && ano % 400 != 0) {
                msg = "O ano: " + ano + " não é bissexto!";
            }else{
            msg = "O ano: " + ano + " é bissexto!";
            }
        }

        System.out.println(msg);
    }
}
