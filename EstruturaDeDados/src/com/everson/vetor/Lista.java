/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.everson.vetor;
import java.lang.reflect.Array;
/**
 *
 * @author note
 */
public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }
    public Lista(int capacidade, Class<T> tipoClasse){
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public boolean adc(T conteudo) throws Exception {
        this.aumentaCapacidade();
if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = conteudo;
            this.tamanho++;
        } else {
            throw new Exception("Vetor já está cheio, não é possível adicionar conteudo");
        }
        return false;
    }
   
    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[])new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
}
