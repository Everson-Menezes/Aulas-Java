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
public class Aula11 {
    
    public static void main(String[] args) throws Exception {
        VetorObjetos v1 = new VetorObjetos(2);
        
        v1.adc(1);
        v1.adc("Conteudo do tipo string");
        System.out.println(v1);
    }
    
}
