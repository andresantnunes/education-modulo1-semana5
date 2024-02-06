package modificadore.paralelo;

import modificadores.PessoaProtected;

public class PessoaProtectedFilho extends PessoaProtected {

    public void dados(){
        super.idade = 10;
        super.nome = "Arlon";

        System.out.println(super.idade);
        System.out.println(super.nome);
    }
}
