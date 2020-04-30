package calculadora;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class OperacoesBasicas {

//Atributos
    private double num1, num2, total, div, mult, sub, soma;
    private String continuar;
    private int mode;
//fim atributos

//instanciando classe Scanner
    Scanner teclado = new Scanner(System.in);
//Fim instancia scanner

//método continuar
    public void Continuar() {
        System.out.println("Deseja continuar com outra operação(SIM OU NÃO)");
        continuar = teclado.next();
        switch (continuar) {
            case "sim": {
                Escolha();
            }
            case "nao": {
                Sair();
            }
        }

    }//Fim continuar

//método sair
    public void Sair() {
        System.out.println("Até mais!");
        System.exit(0);
    }

    public void Escolha() {
        System.out.println("Digite 1 para: Adição");
        System.out.println("Digite 2 para: Subtração");
        System.out.println("Digite 3 para: Divisão");
        System.out.println("Digite 4 para: Multiplicação");
        mode = teclado.nextInt();

        switch (mode) {
            case 1: {
                Adicao();
            }
            case 2: {
                Subtracao();
            }
            case 3: {
                Divisao();
            }
            case 4: {
                Multiplicar();
            }
        }

    }

//método adição
    public void Adicao() {
        System.out.println("Adição");
        System.out.println("Digite o valor do primeiro número: ");
        num1 = teclado.nextDouble();
        System.out.println("Digite o valor do segundo número: ");
        num2 = teclado.nextDouble();
        soma = num1 + num2;
        System.out.println(" A soma dos valores digitados é: " + soma);
        System.out.println("Deseja continuar somando (Sim ou não?)");
        continuar = teclado.next();
//tratar condição
        if (continuar.equals("sim")) {
            do {
                total = soma;
                System.out.println("Digite o próximo número: ");
                num1 = teclado.nextDouble();
                soma = total + num1;
                System.out.println(" A soma dos valores digitados é: " + soma);
                System.out.println("Deseja continuar somando (Sim ou não?)");
                continuar = teclado.next();
            } while (continuar.equals("sim"));
        } else {
            Continuar();
        }
        
        

    }//Fim adição
    
    
    public double somoar(double num1, double num2, double total){
        return (total = num1 + num2);
    }

    public void Subtracao() {
        System.out.println("Subtração");
        System.out.println("Digite o valor do primeiro número: ");
        num1 = teclado.nextDouble();
        System.out.println("Digiste o valor do segundo número: ");
        num2 = teclado.nextDouble();
        sub = num1 - num2;
        System.out.println(" A diferença entre os números digitados é: " + sub);
        System.out.println("Deseja continuar subtraindo(Sim ou não?)");
        continuar = teclado.next();
//tratar condição
        if (continuar.equals("sim")) {
            do {
                total = sub;
                System.out.println("Digite o próximo número: ");
                num1 = teclado.nextDouble();
                sub = total - num1;
                System.out.println(" A diferença de todos os valores digitados é: " + sub);
                System.out.println("Deseja continuar subtraindo(Sim ou não?)");
                continuar = teclado.next();
            } while (continuar.equals("sim"));
        } else {
            Continuar();
        }

    }//Fim subtração

//método divisão
    public void Divisao() {
        System.out.println("Divisão");
        System.out.println("Digite o valor do primeiro número: ");
        num1 = teclado.nextDouble();
        System.out.println("Digite o valor do segundo número: ");
        num2 = teclado.nextDouble();
        div = num1 / num2;
        System.out.println(" O número " + num1 + "dividido pelo número " + num2 + "é: " + div);
        System.out.println("Deseja continuar dividindo(Sim ou não?)");
        continuar = teclado.next();
//tratar condição
        if (continuar.equals("sim")) {
            do {
                total = div;
                System.out.println("Digite outro número: ");
                num1 = teclado.nextDouble();
                div = total / num1;
                System.out.println(" O resultado de " + total + "dividido por " + num1 + "é: " + div);
                System.out.println("Deseja continuar dividindo(Sim ou não?)");
                continuar = teclado.next();
            } while (continuar.equals("sim"));
        } else {
            Continuar();
        }
    }//fim divisão

//Multiplicação
    public void Multiplicar() {
        System.out.println("Multiplicação");
        System.out.println("Digite o valor do primeiro número: ");
        num1 = teclado.nextDouble();
        System.out.println("Digite o valor do segundo número: ");
        num2 = teclado.nextDouble();
        mult = num1 * num2;
        System.out.println(" O resultado da multiplicação dos valores digitados é: " + mult);
        System.out.println("Deseja continuar dividindo(Sim ou não?)");
        continuar = teclado.next();
//tratar condição
        if (continuar.equals("sim")) {
            do {
                total = mult;
                System.out.println("Digite outro número: ");
                num1 = teclado.nextDouble();
                mult = total * num1;
                System.out.println(" O resultado da multiplicação dos valores digitados é: " + mult);
                System.out.println("Deseja continuar multiplicando(Sim ou não?)");
                continuar = teclado.next();
            } while (continuar.equals("sim"));
        } else {
            Continuar();
        }

    }//Fim mutiplicação

    //Bhaskara
    public void bhaskara() {
        double a, b, c, d, x1, x2;
        do{
        System.out.println("Digite o valor de A diferente de zero: ");
        a = teclado.nextDouble();
        }while(a == 0);
        System.out.println("Digite o valor de B: ");
        b = teclado.nextDouble();
        System.out.println("Digite o valor de C: ");
        c = teclado.nextDouble();
        
        d = Math.pow(b,2) - 4*a*c;
        System.out.println("O valor de DELTA é: " + d);
        if( d < 0){
            System.out.println("A equação não possui resultados reais para X ");
            
        }else if( d == 0){
            x1 = (-b+ Math.sqrt(d)) / 2*a;
            System.out.println("A equação possui apenas um resultado real" + x1);
        }else{
            x1 = (-b+ Math.sqrt(d)) / 2*a;
            x2 = (-b- Math.sqrt(d)) / 2*a;
            System.out.println("O valor de X1 é: "+ x1 + " e o valor de X2 é: " + x2);
        }
                
        

    }//Fim Bhaskara

}//Fim da classe 
