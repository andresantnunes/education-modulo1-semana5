package Exercicio1;

public class MainExercicio1 {
    public static void main(String[] args) {
        MotorEletrico motorEletrico = new MotorEletrico();

        motorEletrico.temperatura = 10;
        motorEletrico.tensaoAplicada = 10;
        motorEletrico.velocidade = 10;

        motorEletrico.alteraVelocidade(20);
        System.out.println(motorEletrico.lerTemperatura());
        System.out.println(motorEletrico.velocidade);

    }
}
