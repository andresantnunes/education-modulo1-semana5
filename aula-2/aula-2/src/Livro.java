public class Livro {

    // Essa classe está encapsulada,
    // pois todos os atributos estão como private
    private String autor = "Um nome";
    private String titulo = ""; // o valor padrão de objetos é null
    private int anoPulicacao = 1000;


    //Construtor vazio
    // é o construtor padrão de qualquer classe
    // ele existe por padrão enquanto não houverem outros construtores na classe
    // se houverem construtores com paramentro e necessitarmos do costrutor padrão, teremos que declará-lo explicitamente
    // Livro() -> assinatura desse construtor
    public Livro(){
        //posso ter valores atribuidos aos atributos no construtor vazio
        autor = "Autor Vazio";
        titulo = "Titulo Vazio";
        anoPulicacao = 0;

    }

    // construtor criado explicitamente para essa classe
    // esse construtor substitui o construtor padrão (vazio)
    // enquanto eu tiver apenas um construtor, eu não vou ter uma objeto com atributos de valor default
    // ela sempre será preenchida no momento da criação de um novo objeto
    // Livro(string, string, int) -> assinatura desse construtor
    public Livro(
            String autor,
            String titulo,
            int anoPulicacao
    ){
        this.autor = autor; // this representa o objeto atual, em que o código foi executado
        this.titulo = titulo;
        extracted(anoPulicacao); // podemos chamar métodos diretamente no construtor
    }

    // new Livro(string, string) -> assinatura desse construtor
    public Livro(
            String autor,
            String titulo
    ){
        this.autor = autor;
        this.titulo = titulo;
    }

    // new Livro(string) -> assinatura desse construtor
    public Livro(
            String autor
    ){
        this.autor = autor;
        this.titulo = "Livro do " + autor;
    }




    // regras internas a classe, usamos métodos private
    private void extracted(int anoPulicacao) {
        if (anoPulicacao < 2024){
            this.anoPulicacao = 2020;
        }else {
            this.anoPulicacao = anoPulicacao;
        }
    }


    // Setter
    // Método voltado a colocar valores em um atributo, no caso autor
    // só posso alterar valores de atributos com setter
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPulicacao(int anoPulicacao) {
        extracted(anoPulicacao);
    }

    // Getter
    // Retorna o valor de um atributo
    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPulicacao + 1000;
    }


    public void exibir() {
        System.out.println("Autor: " + autor);
        System.out.println("Titulo: " + titulo);
        System.out.println("Ano Publicação: " + anoPulicacao);
        System.out.println("This: " + this);
    }

    public Livro clone() { // criar um novo objeto do tipo Livro na memória
        Livro livroNovo = new Livro();

        livroNovo.autor = autor; // inferencia, o Java adivinha que é o atributo do objeto
        livroNovo.titulo = this.titulo;
        livroNovo.anoPulicacao = this.anoPulicacao;

        return livroNovo;
    }


}
