public class Main {
    public static void main(String[] args) {
        Livro livroVazio = new Livro(); // crio um objeto livro utilizando um construtor vazio
        Livro livro = new Livro("Autor","Titulo", 2000); // crio um objeto livro utilizando um construtor com parametros

        //livro -> this -> referencia a si mesmo
        //livroVazio -> this

        livro.setAutor("Marcos Lucado");

//        livro.exibir();
//        System.out.println(livro.getAutor());
//        System.out.println(livro.getAnoPublicacao());

        Livro livroClone = livro.clone();
//        System.out.println("Livro Original: " + livro);
//        System.out.println("Livro Clone: " + livroClone);

        Livro livroAutor = new Livro("Autor"); // crio um objeto livro utilizando um construtor com parametros

        livroVazio.exibir();
        System.out.println("Livro Vazio: " + livroVazio);
        System.out.println("=====");
        livro.exibir();
        System.out.println("Livro: " + livro);
        System.out.println("=====");
        livroClone.exibir();
        System.out.println("Livro Clone: " + livroClone);
        System.out.println("=====");
        livroAutor.exibir();
        System.out.println("Livro Autor: " + livroAutor);


    }
}