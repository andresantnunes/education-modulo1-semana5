package heranca;

// herança
// Carro é a SubClasse(filho) e Veiculo é a SuperClasse(pai)
public class Carro extends Veiculo{

    private String cor;

    //Se temos apenas um construtor em Veiculo somos obrigados a
    // ter um construtor em Carro
    // esse recebe os atributos de Veiculo
    public Carro(String marca, int ano, String cor) {

        //Constroi um novo Veiculo
        super(marca, ano); // super é o this da Classe Pai

        System.out.println("Construtor Carro");
        this.cor = cor; // atributo exclusivo do filho
    }

    public Carro(){
        System.out.println("Construtor Carro Vazio");

    }

    public void abrirPortas(){
        System.out.println("Portas Abertas");
    }

    @Override // usado apenas para sobreescrever um método da classe Pai
    // esse tem o mesmo nome da classe pai, porém código diferente
    public void parar(){
        System.out.println("Parada Imediata");
    }
}
