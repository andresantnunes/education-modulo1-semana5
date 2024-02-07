public class Pessoa {

    private String nome;
    private int idade;

    private void aniversario(){
        this.idade ++;
    }

    public void comemorarAniversario(){
        this.aniversario();//this é opcional, pois não há forma de errar a o que aniversario() se refere
        System.out.println(this.idade); // dentro do contexto do método existe apenas uma 'idade'

    }

    public Pessoa retornaPessoa(){
        return this;
    }


    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(){
        this("Bill"); // me permite usar um construtor em outro, tem que ser a primeira linha do construtor
        this.idade = 20;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
