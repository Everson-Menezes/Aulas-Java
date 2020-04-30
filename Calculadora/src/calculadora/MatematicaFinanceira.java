package calculadora;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class MatematicaFinanceira {
//Atributos

    private int mode;
    private double capital, juros, taxa, periodo, montante;
    private String escolha, continuar;

//instanciando classe Scanner
    Scanner teclado = new Scanner(System.in);
//Fim da instancia

//Metodo continuar
    public void Continuar() {
        System.out.println("Deseja continuar (SIM OU NÃO?)");

        continuar = teclado.next();
        switch (continuar) {
            case "sim": {
                Escolha();
            }
            case "nao": {
                Sair();
            }
        }
    }

//Fim continuar
//Metodo sair
    public void Sair() {
        System.out.println("Até mais!");
        System.exit(0);
    }

//Fim sair
//Metodo Escolha
    public void Escolha() {
        System.out.println("Digite o que deseja calcular (JUROS SIMPLES OU COMPOSTO?)");

        escolha = teclado.next();
        switch (escolha) {
            case "simples": {
                JurosSimples();
            }
            case "composto": {
                JurosComposto();
            }
        }
    }
//Fim do metodo escolha

//método juros simples
    public void JurosSimples() {

        System.out.println("Digite 1: para calcular o juros");
        System.out.println("Digite 2: para calcular o capital");
        System.out.println("Digite 3: para calcular a taxa");
        System.out.println("Digite 4: para calcular o período");

        mode = teclado.nextInt();
        switch (mode) {
            case 1: {
                System.out.println("Juros Simples");
                System.out.println("Digite o capital:");
                this.capital = teclado.nextDouble();
                System.out.println("Digite a taxa");
                this.taxa = teclado.nextDouble();
                System.out.println("Digite o período:");
                this.periodo = teclado.nextDouble();
                juros = capital * taxa * periodo;
                System.out.println("O juros é igual a: " + juros);
                Continuar();
                break;
            }

            case 2: {
                System.out.println("Capital");
                System.out.println("Digite o juros:");
                this.juros = teclado.nextDouble();
                System.out.println("Digite a taxa");
                this.taxa = teclado.nextDouble();
                System.out.println("Digite o período:");
                this.periodo = teclado.nextDouble();
                capital = juros / (taxa * periodo);
                System.out.println("O capital é igual a: " + capital);
                Continuar();
                break;
            }

            case 3: {
                System.out.println("Taxa");
                System.out.println("Digite o juros:");
                this.juros = teclado.nextDouble();
                System.out.println("Digite o capital");
                this.capital = teclado.nextDouble();
                System.out.println("Digite o período:");
                this.periodo = teclado.nextDouble();
                taxa = juros / (capital * periodo);
                System.out.println("A taxa é igual a: " + taxa);
                Continuar();
                break;
            }

            case 4: {
                System.out.println("Período");
                System.out.println("Digite o juros:");
                this.juros = teclado.nextDouble();
                System.out.println("Digite a taxa");
                this.taxa = teclado.nextDouble();
                System.out.println("Digite o capital: ");
                this.capital = teclado.nextDouble();
                periodo = juros / (taxa * capital);
                System.out.println("O período é igual a: " + periodo);
                Continuar();
                break;
            }
        }
    }//Fim método juros simples

//fim do método
//método juros composto
    public void JurosComposto() {

        System.out.println("Digite 1: para calcular o montante");
        System.out.println("Digite 2: para calcular o capital");
        System.out.println("Digite 3: para calcular a taxa");
        System.out.println("Digite 4: para calcular o período");
        mode = teclado.nextInt();

        switch (mode) {
            case 1: {
                System.out.println("Montante");
                System.out.println("Digite a taxa");
                this.taxa = teclado.nextDouble();
                System.out.println("Digite o capital: ");
                this.capital = teclado.nextDouble();
                System.out.println("Digite o período:");
                this.periodo = teclado.nextDouble();
                montante = capital * (Math.pow(1 + taxa, periodo));
                System.out.println(" O montante acumulado é de: " + montante);
                Continuar();
                break;
            }

            case 2: {
                System.out.println("Capital");
                System.out.println("Digite a taxa");
                this.taxa = teclado.nextDouble();
                System.out.println("Digite o montante: ");
                this.montante = teclado.nextDouble();
                System.out.println("Digite o período:");
                this.periodo = teclado.nextDouble();
                capital = montante / (Math.pow(1 + taxa, periodo));
                System.out.println(" O capital é de: " + capital);
                Continuar();
                break;
            }

            case 3: {
                System.out.println("Taxa");
                System.out.println("Digite o montante");
                this.montante = teclado.nextDouble();
                System.out.println("Digite o capital: ");
                this.capital = teclado.nextDouble();
                System.out.println("Digite o período:");
                this.periodo = teclado.nextDouble();
                taxa = Math.pow((montante / capital), (1 / periodo)) - 1;
                System.out.println(" A taxa é de: " + taxa);
                Continuar();
                break;
            }

            case 4: {
                System.out.println("Período");
                System.out.println("Digite o montante");
                this.montante = teclado.nextDouble();
                System.out.println("Digite o capital: ");
                this.capital = teclado.nextDouble();
                System.out.println("Digite a taxa: ");
                this.taxa = teclado.nextDouble();
                periodo = Math.log((montante / capital)) / Math.log(1 + taxa);
                System.out.println(" O período de aplicação é: " + periodo);
                Continuar();
                break;
            }

        }
    }//Fim metodo juros composto
}//Fim da classe
