package com.everson.estruturadados.pilha;
import com.everson.estruturadados.base.EstruturaEstatica;
/**
 *
 * @author everson.menezes
 */
public class Pilha <T> extends EstruturaEstatica<T> {
    
    public Pilha(){
        super();
    }
    
    public Pilha(int capacidade){
        super(capacidade);
    }
    
    public void empilhar(T conteudo){
        super.adiciona(conteudo);
    }
    
    public boolean estaVazia(){
        return tamanho == 0;
    }
}
