public class Main2 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Jão", 23);

        pessoa.comemorarAniversario();

        Pessoa pessoa1 = new Pessoa();
//        System.out.println(pessoa1.getNome());
//        System.out.println(pessoa1.getIdade());

        Pessoa pessoa2 = pessoa.retornaPessoa();
        System.out.println("Pessoa - "+pessoa);
        System.out.println("Pessoa2 - "+pessoa2);
    }
}
