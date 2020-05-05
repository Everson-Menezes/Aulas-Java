package com.everson.vetor;

import com.everson.estruturadados.base.EstruturaEstatica;


/**
 *
 * @author everson.menezes
 */
public class Lista2 <T> extends EstruturaEstatica <T>{
    public Lista2(){
        super();
    }
    
    public Lista2(int capacidade){
        super(capacidade);
    }
    
    public boolean adiciona(int posicao, T conteudo){
        return super.adiciona(posicao, conteudo);
    }
    
    
}
