package com.everson.vetor.teste;

/**
 *
 * @author everson.menezes
 */
import com.everson.vetor.Vetor;

public class Aula05 {

    public static void main(String[] args) throws Exception {
        Vetor v1 = new Vetor(5);
        v1.adc("conteudo 1");
        v1.adc("conteudo 2");
        v1.adc("Everson");
        v1.adc("conteudo 4");
        v1.adc("conteudo 5");
        v1.adc("Claudio");
        System.out.println(v1.buscar(6));

    }

}
