package modificadores;

public class PessoaPrivate {

    private String nome;
    private int idade;

    public void dados(){
        nome = "Uriel";
        idade = 33;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
