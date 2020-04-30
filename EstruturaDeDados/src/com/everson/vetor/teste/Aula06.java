package com.everson.vetor.teste;

import com.everson.vetor.Vetor;

/**
 *
 * @author aluno
 */
public class Aula06 {
     public static void main(String[] args) throws Exception {
        Vetor v1 = new Vetor(10);
        v1.adc("conteudo 1");
        v1.adc("conteudo 2");
        v1.adc("Everson");
        System.out.println(v1.buscar("Everson"));
}
}
