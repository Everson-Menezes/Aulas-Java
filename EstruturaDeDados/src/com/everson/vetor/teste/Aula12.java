/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.everson.vetor.teste;

import com.everson.vetor.Lista;
import com.everson.vetor.VetorObjetos;
import java.util.ArrayList;

/**
 *
 * @author note
 */
public class Aula12 {

    public static void main(String[] args) {
        ArrayList<String> v1 = new ArrayList<String>();
        v1.add("A");
        v1.add("C");

        System.out.println(v1);

        v1.add(1, "B");
        System.out.println(v1);

        boolean existe = v1.contains("A");
        if (existe) {
            System.out.println("Conteudo existe no array");
        } else {
            System.out.println("Conteudo não existe no array");
        }
        int pos = v1.indexOf("D");
        if (pos > -1) {
            System.out.println("Conteudo existe no array");

        } else {
            System.out.println("Conteudo não existe no array");
        }
        System.out.println(v1.get(2));
        v1.remove(0);
        v1.remove("B");
        System.out.println(v1);
        System.out.println(v1.size());
    }
}
