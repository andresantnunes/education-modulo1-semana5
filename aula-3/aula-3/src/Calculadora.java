public class Calculadora {

    // Sobrecarga tem que ter o mesmo nome
    // Podem ou não ter retornos diferetes, o retorno não difere métodos,
    // Apenas parametros diferem métodos
    public int soma(int n1, int n2){ // soma(int, int)
        return n1 + n2;
    }

    public int soma(int n1, int n2, int n3){ // soma(int, int, int) -> sobrecarga de soma, numero de parametros
        return n1 + n2 + n3;
    }

    public double soma(double n1, double n2){ // soma(double, double) -> sobrecarga de soma, tipo dos parametros
        return n1 + n2;
    }

    public int multicacao(int n1, int n2){ // novo método
        return n1*n2;
    }
}
