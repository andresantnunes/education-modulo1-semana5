
public class Calculadora {

    private static int contadorOperacoesStatic = 0; // agrega todos os objetos de uma classe
    // é o mesmo atributo para todos os objetos de Calculadora,
    // é compartilhado entre todas as instancias

    private int contadorOperacoes = 0;


    public Calculadora() {
        contadorOperacoesStatic++;
        contadorOperacoes++;
    }

    // Sobrecarga tem que ter o mesmo nome
    // Podem ou não ter retornos diferetes, o retorno não difere métodos,
    // Apenas parametros diferem métodos
    public int soma(int n1, int n2){ // soma(int, int)
        contadorOperacoesStatic++;
        contadorOperacoes++;
        return n1 + n2;
    }

    public int soma(int n1, int n2, int n3){ // soma(int, int, int) -> sobrecarga de soma, numero de parametros
        contadorOperacoesStatic++;
        contadorOperacoes++;
        return n1 + n2 + n3;
    }

    public double soma(double n1, double n2){ // soma(double, double) -> sobrecarga de soma, tipo dos parametros
        contadorOperacoesStatic++;
        contadorOperacoes++;

        return n1 + n2;
    }

    public int multicacao(int n1, int n2){ // novo método
        contadorOperacoesStatic++;
        contadorOperacoes++;

        return n1*n2;
    }

    @Override
    public String toString(){
        return "Contador Static :" + contadorOperacoesStatic + ", Contador: " + contadorOperacoes ;
    }

}
