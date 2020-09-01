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
public class Classe10b {
    public double valor, juros, valorApagar;
    public int dias;
    final float multa = 0.02f, taxa = 0.01f;
    
    public double calcular(){
        juros = valor * (taxa * dias);
        valorApagar = valor + juros + (valor * multa);
        return valorApagar;
    }
    public void ler(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        valor = leitor.nextDouble();
         System.out.println("Digite os dias em atraso: ");
         dias = leitor.nextInt();
    }
    
}
