package com.everson.vetor.teste;

/**
 *
 * @author everson.menezes
 */
import com.everson.vetor.Vetor;

public class Aula04 {

    public static void main(String[] args) throws Exception {
        Vetor v1 = new Vetor(10);
        v1.adc("conteudo 1");
        v1.adc("conteudo 2");
        v1.adc("conteudo 3");
        v1.adc("conteudo 4");
        v1.adc("conteudo 5");
        v1.adc("conteudo 6");
        System.out.println(v1.tamanho());
        System.out.println(v1.toString());
    }
}
