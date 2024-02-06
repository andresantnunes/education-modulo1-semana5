public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro(); // Instanciação
        // livro é um objeto do tipo Livro

        livro.titulo = "O Leopardo";
        livro.autor = "Lampedusa";
        livro.anoPublicacao = 2002;

        livro.exibeInformacoes(); // executando o método dentro do objeto
        // retornar para cá após a execução do método
//
//        System.out.println(livro);
//
//
//        System.out.println("--------------");
//
//        Livro livroComplementar = new Livro();
//        livroComplementar.titulo = "O Codigo Davince";
//        livroComplementar.autor = "Rafael de Mileto";
//        livroComplementar.anoPublicacao = 1555;
//
//        livroComplementar.exibeInformacoes();
//        System.out.println(livroComplementar);

        System.out.println("--------------");

        Livro livroCopia = new Livro();

        //Funciona uma unica vez
        livroCopia.titulo = livro.titulo;
        livroCopia.autor = livro.autor;
        livroCopia.anoPublicacao = livro.anoPublicacao;
        System.out.println("Livro Copia:" + livroCopia);

        livroCopia = livro.clone(); // o método pode ser reutilizado em qualquer lugar do código

        System.out.println("Livro: " + livro);
        System.out.println("Livro Copia: " + livroCopia);

    }
}