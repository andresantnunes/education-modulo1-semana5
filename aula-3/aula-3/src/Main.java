public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        Calculadora calculadora2 = new Calculadora();

//        System.out.println(calculadora.toString());
//        System.out.println(calculadora2.toString());


//        System.out.println(calculadora.soma(1.1,2.2));
//        System.out.println(calculadora2.soma(1,2));
//        System.out.println(calculadora2.soma(1,2));
//        System.out.println(calculadora2.soma(1,2));
//
//        System.out.println(calculadora.toString());


        Pessoa pessoa = new Pessoa();

//        System.out.println(Pessoa.getContadorPessoas()); //o método static precisa ser chamado através da Classe, não do objeto
//        System.out.println("Pessoa 2 --------");

        Pessoa pessoa2 = new Pessoa();
//        System.out.println(Pessoa.getContadorPessoas()); //o método static precisa ser chamado através da Classe, não do objeto

        pessoa2.setEndereco(new Pessoa.Endereco());
        Pessoa.Endereco endereco = pessoa2.getEndereco(); // Classe estatica acessivel através de outra

//        System.out.println(endereco);

        //Métodos Static podem ser usados para classes de utilidades,
        //são utilizadas me vários lugares do código e não tem um contexto específico
        System.out.println(Utilitarios.removePontoFinal("Textinho. cheio. de pontos.!"));
    }
}