/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linguagemdeprogramacao01.aula04;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class VerificadorTriangulo {

    double a, b, c;
    int tecla;
    boolean triangulo = false;

    Scanner teclado = new Scanner(System.in);

    public void iniciar() {
        System.out.println("Digite 1 para inserir dados");
        System.out.println("Digite 2 para sair");

    }

    public void ler() {
        System.out.println("Digite o valor de A, B, C separados por ENTER: ");
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
    }
    public void verificar(){
        if(a < b + c && b < a + c && c < a + b){
            triangulo = true;
        }else {
            triangulo = false;
        }
    }
    
    public void exibir (){
        if(triangulo == true){
            System.out.println("Trata-se de um Triangulo!");
            System.exit(0);
        }else {
            System.out.println("É uma figura qualquer de três lados!");
            System.exit(0);
        }
    }
    public void menu(){
        tecla = teclado.nextByte();
        switch(tecla){
            case 1:
            {
                ler();
                verificar();
                exibir();
            }
            case 2:
            {
                System.out.println("Até mais!");
                System.exit(0);
            }
        }
    }
    public static void main(String[] args) {
        VerificadorTriangulo vt = new VerificadorTriangulo();
        vt.iniciar();
        vt.menu();
    }
}
