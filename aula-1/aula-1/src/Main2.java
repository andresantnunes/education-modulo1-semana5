public class Main2 {
    public static void main(String[] args) {

        Livro livro = new Livro();

        Livro livroCopia = livro.clone();

        Livro livroNull = null; // Toda Classe pode ter o valor de null
        // Ou seja, não tem valor algum

        //codigo radom

        if(livroNull != null){ //sempre falso
            livroNull = livro.clone();
        }

//        System.out.println("Livro");
//        livro.exibeInformacoes();

//        System.out.println("Livro Null");
//        livroNull.exibeInformacoes(); // Erro -> "livroNull" is null


        String resultado = livro.alterarAutor("Andre");

        System.out.println(resultado);
        livro.exibeInformacoes();

    }
}
