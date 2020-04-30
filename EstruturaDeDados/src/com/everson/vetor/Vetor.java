package com.everson.vetor;

public class Vetor {

    //Atributos do vetor
    private String[] elementos;
    private int tamanho;

    //Metodo construtor
    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void adc(String conteudo) throws Exception {
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

    public String buscar(int posicao) {
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
    public int buscar(String conteudo) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(conteudo)) {
                return i;
            }
        }
        return -1;
    }

    public boolean adc(int posicao, String conteudo) {
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

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }

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
