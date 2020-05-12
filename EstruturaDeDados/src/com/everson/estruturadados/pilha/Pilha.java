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
    
    public T topo(){
        if(this.estaVazia()){
            return null;
        }
        return this.elementos[tamanho-1];
    }
    
    public T desempilhar(){
        if(this.estaVazia()){
            return null;
        }
        T conteudo = this.elementos[tamanho-1];
        tamanho--;
        return conteudo;
    }
}
