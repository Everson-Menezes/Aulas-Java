package com.everson.estruturadados.pilha.teste;

import com.everson.estruturadados.pilha.Pilha;

/**
 *
 * @author everson.menezes
 */
public class Aula14 {
    public static void main(String[] args) {
         Pilha<Integer> p = new Pilha<Integer>(5);
         for(int i = 1; i<= 10; i++){
             p.empilhar(i);
         }
         System.out.println(p);
         System.out.println(p.tamanho());
    }
}
