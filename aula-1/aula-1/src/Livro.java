public class Livro {

    // camelCase
    String autor;
    String titulo;
    int anoPublicacao;

    // camelCase seguido de (), e { codigo }
    // retorno void é nada, ele não retorna nada, não pode fazer atribuição
    public void exibeInformacoes(){
        System.out.println("Autor: " + autor);
        System.out.println("Titulo: " + titulo);
        System.out.println("Ano da Publicação: " + anoPublicacao);
    }


    // modificador-de-acesso Tipo-de-retorno nome-do-metodo (parametros)
    // tem retorno, pode fazer atribuição
       public                Livro          clone          (){
        Livro livro = new Livro();
        livro.autor = autor;
        livro.titulo = titulo;
        livro.anoPublicacao = anoPublicacao;

        return livro;
    }

    // parametro String é necessário para executar esse código
    public String alterarAutor(String novoAutor){
        autor = novoAutor;
        return autor;
    }
}
