package com.everson.estruturadados.pilha.teste;

import com.everson.estruturadados.pilha.Pilha;

/**
 *
 * @author everson.menezes
 */
public class Aula15 {
    public static void main(String[] args) {
         Pilha<Integer> p = new Pilha<Integer>(5);
        
         System.out.println(p.estaVazia());
         
         p.empilhar(1);
         
         System.out.println(p.estaVazia());
    }
     
}
