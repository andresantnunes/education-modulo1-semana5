package erros;

import java.util.Arrays;
import java.util.Scanner;

public class MainErros {

    public static void main(String[] args) {
        try { // bloco try, onde colocamos o nosso código normal
            // código que pode dar erro


            TesteErros testeErros = new TesteErros();
            testeErros.erroAritimetico();

//            int[] nums = {1,2,3};

//            System.out.println(nums[4]);

        // pegar os erros
        // Exception -> erro genérico, Exception é o Pai de todos as Exceptions
        // Exceptions específicas -> ArithmeticException é uma excessão de cálculos,
            // vai acontecer quando tivermos um erro atrelado a operações matematicas
        } catch (ArithmeticException ex){

            //por ser especifico pode ter algum erro que irá passar reto pelo ArithmeticException
            System.out.println(ex.getMessage());
            System.out.println(Arrays.toString(ex.getStackTrace())); //StackTrace é uma lista de execução

            throw ex; // erro completo

        } catch (Exception exception){ // podemos ter multiplos catchs, e eles são validados na ordem que são colocados
            // Exception é como um default do switch case, ele vai pegar qualquer erro
            System.out.println("Exception");

            throw exception; // joga/lança a excessão no terminal
            // para a execução do programa, lança a mensagem de erro completa no terminal
            // ele precisa receber uma Exception
        }

    }
}
