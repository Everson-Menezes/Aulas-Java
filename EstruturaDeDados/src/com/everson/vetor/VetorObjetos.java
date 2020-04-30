/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.everson.vetor;

/**
 *
 * @author note
 */
public class VetorObjetos {
    
    //Atributos do vetor
    protected Object[] elementos;
    protected int tamanho;

    public VetorObjetos(int capacidade){
            this.elementos = new Object [capacidade];
            this.tamanho = 0;
    }

    //Metodos especificos
    public void adc(Object conteudo) throws Exception {
        /*for (int i = 0; i < this.elementos.length; i++){
        if (this.elementos[i] == null){
        this.elementos[i] = conteudo;
        break;*/
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = conteudo;
            this.tamanho++;
        } else {
            throw new Exception("Vetor já está cheio, não é possível adicionar conteudo");
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(",");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");
        return s.toString();
    }

    public Object buscar(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    //Retorna se o conteudo é igual
    /*public boolean buscar(String conteudo){
    for (int i = 0; i < this.tamanho; i++){
    if (this.elementos[i].equals(conteudo)){
    return true;
    }
    }
    return false;
    }*/
    //retorna a posição do vetor
    public int buscar(Object conteudo) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(conteudo)) {
                return i;
            }
        }
        return -1;
    }

    public boolean adc(int posicao, Object conteudo) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        this.aumentaCapacidade();
        //move todos os elementos
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = conteudo;
        this.tamanho++;
        return false;
    }

    protected void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            Object[] elementosNovos = new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
        // Fim metodos especiais
    }

    public void remover(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        //move todos os elementos
        for (int i = posicao; i < this.tamanho; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }
    
}
