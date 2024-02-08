package heranca;

public class Main {

    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo("Ford", 1994);

        System.out.println("Carro -----");
        Carro carro = new Carro("Ford", 1994, "Preto");

        System.out.println("Veiculo V -----");
        Veiculo veiculo1 = new Veiculo();

        System.out.println("Carro V -----");
        Carro carro1 = new Carro();

//        System.out.println("Ano Veiculo: "+veiculo.getAno());
//        System.out.println("Ano Carro: "+carro.getAno());

        System.out.println("-----------------------");
        veiculo.acelerar();
        veiculo.parar();

        System.out.println("-----------------------");
        carro.acelerar();// método herdado da super classe, tem o mesmo comportamento que veículo
        carro.parar();// método herdado da super classe, foi sobreescrito pela Classe Carro

        carro.abrirPortas();
    }
}
