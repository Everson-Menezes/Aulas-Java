package linguagemdeprogramacao01.aula09;
/**
 *
 * @author everson.menezes
 */
public class Pessoa {

//Atributos da Classe
    private String nome, sexo, endereco, email;
    private int idade;
    private long telefone;
 
//Construtor com parâmetros/argumentos

    public Pessoa(String nome, String sexo, String endereco, String email, int idade, long telefone) {
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
        this.email = email;
        this.idade = idade;
        this.telefone = telefone;
    }
//Metodo para exibir as informações
    public String exibirInformacoes() {
        return 
                "Pessoa{" + "nome = " + nome + ", sexo = " + sexo + 
                ", endereço = " + endereco + ", email = " + email +
                ", idade = " + idade + ", telefone=" + telefone + '}';
    }
    
    
}
