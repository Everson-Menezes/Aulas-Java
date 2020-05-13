package linguagemdeprogramacao01.aula06;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class Poligono {

    public int lados;
    public String figura;
    public float a, b, c;
    Scanner teclado = new Scanner(System.in);

    public void ler() {

        System.out.println("Digite quantos lados tem o polígono: ");
        this.lados = teclado.nextInt();
        if (this.lados <= 2) {
            System.out.println("Não é um polígono!");
            System.exit(0);
        } else if (this.lados > 5) {
            System.out.println("Poligono não identificado!");
            System.exit(0);
        }
        if (this.lados == 3) {
            this.figura = "Triângulo";
            System.out.println("Digite as medidas do lado A: ");
            a = teclado.nextFloat();
            System.out.println("Digite as medidas do lado B: ");
            b = teclado.nextFloat();
            System.out.println("Digite as medidas do lado C: ");
            c = teclado.nextFloat();
        } else if (this.lados == 4) {
            this.figura = "Quadrado";
            System.out.println("Digite o valor de um dos lados pentágono: ");
            a = teclado.nextFloat();

        } else {
            this.figura = "Pentágono";
            System.out.println("Digite o valor de um dos lados pentágono: ");
            a = teclado.nextFloat();

        }
    }

    public double calcular() {
        double area = 0;
        if (this.lados == 3) {
            double p = (a + b + c) / 2;
            area = Math.sqrt(p * (p - a) * p * (p - b) * p * (p - c));
        } else if (this.lados == 4) {
            area = Math.pow(a, 2);
            //Crrigir aqui 
        } else {
            /*int somaAnguloInterno = (5 - 2) * 180;
            int angulo = somaAnguloInterno / 5;
            int anguloBase = angulo / 2;
            double apotema = Math.sin(anguloBase) * a;
            double p = a * 5;
            area = (p * apotema) / 2;
            double BT = a / 2;
            int anguloT = 36;
            double altura = BT / (Math.tan(anguloT));
            double apotema = altura;
            double p = a * 5;
            area = (p * apotema) / 2;*/
            area = ((5*Math.pow(a,2))/4 * Math.tan(36))/5.6310;
          
        }
        return area;
    }

    public void exibir() {
        System.out.println("O polígono é um: " + this.figura + " com a area de : " + calcular());
    }

    public static void main(String[] args) {
        Poligono p = new Poligono();
        p.ler();
        p.calcular();
        p.exibir();
    }
}
