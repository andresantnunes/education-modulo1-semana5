import javax.xml.xpath.XPathExpressionException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainExercicio {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>(); //agregar dados de um tipo

        //adição de dados a lista
        pessoas.add(new Pessoa("Leo",24));
        pessoas.add(new Pessoa("Daniel",26));
        pessoas.add(new Pessoa("Gustavo",33));

        // ordenação da lista usando sort->ordenar/organizar
        // sort necessita de um Comparator
        // Comparator -> classe utilitaria de comparação
        pessoas.sort(Comparator.comparingInt(Pessoa::getIdade)); // ordem crescente
        pessoas.forEach(System.out::println); // executa um comando para cada item de uma lista
        // System.out::println => System.out.println(pessoa) -> executa isso para cada pessoa

        System.out.println("Lista invertida");
        pessoas.sort(Comparator.comparingInt(Pessoa::getIdade).reversed()); // ordem descrescente
        pessoas.forEach(System.out::println);

    }
}
