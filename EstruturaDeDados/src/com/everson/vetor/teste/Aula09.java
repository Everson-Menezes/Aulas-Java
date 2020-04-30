/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.everson.vetor.teste;

import com.everson.vetor.Vetor;

/**
 *
 * @author note
 */
public class Aula09 {
    
    public static void main(String[] args) throws Exception {
        Vetor v1 = new Vetor(3);
        v1.adc("B");
        v1.adc("G");
        v1.adc("D");
        v1.adc("E");
        v1.adc("F");
        System.out.println(v1);
        
        v1.remover(1);
        System.out.println(v1);
        
    }
}
