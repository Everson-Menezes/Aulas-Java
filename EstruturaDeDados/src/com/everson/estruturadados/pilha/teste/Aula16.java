package com.everson.estruturadados.pilha.teste;

import com.everson.estruturadados.pilha.Pilha;

/**
 *
 * @author everson.menezes
 */
public class Aula16 {
    public static void main(String[] args) {
        Pilha<Integer> p = new Pilha<Integer>();
        System.out.println(p.topo());
        System.out.println(p);
        p.empilhar(1);
        p.empilhar(2);
        System.out.println(p.topo());
        System.out.println(p);
    }
}
