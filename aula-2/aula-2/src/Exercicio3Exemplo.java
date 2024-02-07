import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercicio3Exemplo {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("C",3));
        pessoas.add(new Pessoa("A",1));
        pessoas.add(new Pessoa("B",2));
        pessoas.forEach(pessoa -> System.out.println(pessoa.getNome() + " - "+pessoa.getIdade()));


        pessoas.sort(Comparator.comparingInt(Pessoa::getIdade));

        pessoas.forEach(pessoa -> System.out.println(pessoa.getNome() + " - "+pessoa.getIdade()));

    }
}
