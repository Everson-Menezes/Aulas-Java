/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.everson.vetor.teste;

import com.everson.vetor.VetorObjetos;

/**
 *
 * @author note
 */
public class Aula10 {

    public static void main(String[] args) throws Exception {
        VetorObjetos v1 = new VetorObjetos(3);

        
        Contato c1 = new Contato("Everson", "1234-5678", "everson@gmail.com");
        Contato c2 = new Contato("João", "4321-5678", "joao@gmail.com");
        Contato c3 = new Contato("Maria", "2314-8765", "maria@gmail.com");
        Contato c4 = new Contato("Jose", "9876 -5432", "jose@gmail.com");
        
        v1.adc(c1);
        v1.adc(c2);
        v1.adc(c3);

        System.out.println("Tamanho = " + v1.tamanho());

        System.out.println(v1);
        
        int pos = v1.buscar(c4);
        if (pos > -1){
            System.out.println("Elemento existe no vetor");
        }else{
            System.out.println("Elemento não existe no vetor");        }
    }
}
