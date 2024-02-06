package modificadore.paralelo;

//import modificadores.Pessoa;

import modificadores.PessoaProtected;
import modificadores.PessoaPublic;

public class MainModificadorParalelo {
    public static void main(String[] args) {
//        Pessoa pessoa = new Pessoa(); // Pessoa não existe fora do pacote modificadores
        // Modificador de Acesso Default
//        pessoa.nome = "Andre";
//        System.out.println(pessoa);

//        PessoaPublic pessoaPublic = new PessoaPublic(); // consigo acessar a classe public
//
//        pessoaPublic.idade = 122; // não consigo acessar o atributo default
//
//        System.out.println(pessoaPublic.idade);


        PessoaProtected pessoaProtected = new PessoaProtected();

//        pessoaProtected.idade = 100; // idade e nome não são acessiveis fora do pacote modificares
//        pessoaProtected.nome = "Roberto";
//        System.out.println(pessoaProtected);

        PessoaProtectedFilho pessoaProtectedFilho = new PessoaProtectedFilho();
        pessoaProtectedFilho.dados();
    }
}
