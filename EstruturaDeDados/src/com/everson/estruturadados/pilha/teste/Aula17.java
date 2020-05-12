package com.everson.estruturadados.pilha.teste;

import com.everson.estruturadados.pilha.Pilha;

/**
 *
 * @author everson.menezes
 */
public class Aula17 {

    public static void main(String[] args) {
        Pilha<Integer> p = new Pilha<Integer>();
        p.empilhar(1);
        p.empilhar(2);
        p.empilhar(3);
        System.out.println(p);
        System.out.println("Desempilhando conteudo " + p.desempilhar());
        System.out.println(p);
    }

}
