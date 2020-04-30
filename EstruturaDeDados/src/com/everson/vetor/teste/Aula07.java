/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.everson.vetor.teste;

import com.everson.vetor.Vetor;

/**
 *
 * @author aluno
 */
public class Aula07 {

    public static void main(String[] args) throws Exception {
        Vetor v1 = new Vetor(10);
        v1.adc("B");
        v1.adc("C");
        v1.adc("E");
        v1.adc("F");
        v1.adc("G");
        System.out.println(v1);
        v1.adc(0, "A");
        System.out.println(v1);
        v1.adc(3, "D");
        System.out.println(v1);
    }
}
