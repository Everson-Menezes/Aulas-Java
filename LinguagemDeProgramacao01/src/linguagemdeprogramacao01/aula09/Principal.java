package linguagemdeprogramacao01.aula09;

import java.util.Scanner;

/**
 *
 * @author everson.menezes
 */
public class Principal {

    static String n, s, end, email;
    static int idade;
    static long tel;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menu;

        System.out.println("Digite 1 para inserir e exibir os dados da pessoa. \nDigite 2 para sair do programa.");
        menu = teclado.nextInt();

        switch (menu) {
            case 1: {
                ler();
                Pessoa p = new Pessoa(n, s, end, email, idade, tel);
                System.out.println("INFORMAÇÕES");
                System.out.println("_______________________");
                System.out.println(p.exibirInformacoes());
            }
            break;
            case 2: {
                System.out.println("Até mais!");
                System.exit(0);
            }
            break;
        }

    }

    public static void ler() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome:");
        n = teclado.next();
        System.out.println("Digite o sexo:");
        s = teclado.next();
        System.out.println("Digite o endereço:");
        end = teclado.next();
        System.out.println("Digite o email:");
        email = teclado.next();
        System.out.println("Digite a idade:");
        idade = teclado.nextInt();
        System.out.println("Digite o telefone:");
        tel = teclado.nextLong();
    }
}
