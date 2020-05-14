package linguagemdeprogramacao01.aula06;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class MiniPrograma {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;
        do{
        int menu;
        System.out.println("Digite 1: Peso Ideal \n Digite 2: Polígonos \n Digite 3: Maior \n Digite 4: Triangulos");

        menu = teclado.nextInt();

        switch (menu) {
            case 1: {
                PesoIdeal p = new PesoIdeal();
                p.ler();
                p.calcular();
                p.exibir();
            } break;
            case 2: {
                Poligono p = new Poligono();
        p.ler();
        p.calcular();
        p.exibir();
            }break;
            case 3: {
                 Maior m = new Maior();
        m.ler();
        m.verificar();
        m.exibir();
            }break;
            case 4: {
                Triangulo t = new Triangulo();
                t.ler();
                t.verificar();
                t.exibir();
            }break;
        }
            System.out.println("Deseja continuar true/false");
            continuar = teclado.nextBoolean();
        }while(continuar == true);
    }
}
