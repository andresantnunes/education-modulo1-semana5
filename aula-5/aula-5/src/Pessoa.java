public class Pessoa {

    private String nome;
    private int idade; // valor do objeto pessoa, criado com o tipo Pessoa

    private static int numeroPessoas; // valor da Classe pessoa

    private Endereco endereco;


    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public void testExterno(){
        System.out.println("Teste Pai");
        //temos acesso aos métodos internos pela classe externa
    }

    public String getNome() {
        return this.nome;
    }

    public static int getNumeroPessoas(){
        return numeroPessoas; // numero pessoa não existe no this.
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void setNumeroPessoas(int numeroPessoas) {
        Pessoa.numeroPessoas = numeroPessoas;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    static class Endereco{ // Classes internas são static
        // pode ser acessadas por outras classes dependendo do modificador delas
        // elas tem método e atributos próprios
        // não tem acesso a classe externa

        private String cep;
        public void test(){

        }

    }
}
