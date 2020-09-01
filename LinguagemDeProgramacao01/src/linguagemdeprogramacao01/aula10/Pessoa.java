/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linguagemdeprogramacao01.aula10;

/**
 *
 * @author everson.menezes
 */
public class Pessoa {

//Atributos da Classe
    private String CPF, RG;
    private int idade;
    private int salario;
   
 
//Construtor com parâmetros/argumentos
    public Pessoa(String CPF, String RG, int idade, int salario) {
        this.CPF = CPF;
        this.RG = RG;
        this.idade = idade;
        this.salario = salario;
    }

//Metodo para exibir as informações
    public String exibirInformacoes() {
        String msg = "CPF = " + CPF + "\nRG = " + RG + "\nIDADE = " + idade + "\nSALÁRIO = " + salario;
        return msg;
        
    }
    
    
}

