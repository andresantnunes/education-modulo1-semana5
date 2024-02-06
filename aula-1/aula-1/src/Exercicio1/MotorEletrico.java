package Exercicio1;

// PascalCase -> primeira letra maiuscula, palavras com primeira letra maiuscula
public class MotorEletrico {

    //atributos
    double temperatura = 1; //modificador default
    double velocidade = 100;
    double tensaoAplicada = 1000;

    //métodos
    public void alteraVelocidade(double velocidade){
        this.velocidade = velocidade;
    }

    public double lerTemperatura(){
        return this.temperatura;
    }

}
