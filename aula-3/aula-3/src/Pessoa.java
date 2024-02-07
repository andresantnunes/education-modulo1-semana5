
public class Pessoa {

    private String nome;
    private Integer idade;
    private static int contadorPessoas;
    private Endereco endereco;

    static class Endereco {
        private String logradouro;
        private int numero;
    }



    // executa antes do construtor
    // executa apenas uma vez por classe, apenas no primerio 'new'
    static {
        System.out.println("Static block iniciado.");
        contadorPessoas = 0;
    }

    public Pessoa() {
        System.out.println("Construtor iniciado.");
        contadorPessoas++;
    }

    //para usar atributos static, preciso de um método static
    public static int getContadorPessoas() {
        return contadorPessoas;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public static void setContadorPessoas(int contadorPessoas) {
        Pessoa.contadorPessoas = contadorPessoas;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
