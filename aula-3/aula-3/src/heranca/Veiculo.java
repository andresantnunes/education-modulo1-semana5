package heranca;

public class Veiculo {

    private String marca;
    private int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;

        System.out.println("Construtor Veiculo");

    }

    public Veiculo(){
        System.out.println("Construtor Veiculo Vazio");

    }

    public void acelerar(){
        System.out.println("Acelere");
    }

    public void parar(){
        System.out.println("Parando");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
