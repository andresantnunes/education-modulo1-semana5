import java.util.Objects;

public class Animal {

    protected int numeroPatas;
    private String paisOrigem;
    private String tamanho;
    private String corCorpo;


    public void pensa(){
        System.out.println("Animal pensa");
    }

    @Override // substitui um método por outro
    public String toString() { // é uma representação da classe/objeto, apresentando os valores internos dela
        return "Animal{" +
                "numeroPatas=" + numeroPatas +
                ", paisOrigem='" + paisOrigem + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", corCorpo='" + corCorpo + '\'' +
                '}';
    }

    @Override // O override precisa ter tipos identicos nos parametros e no retorno
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o; //casting

        //comparação de cada atributo do objeto 'o' com o objeto atual (this)
        // == -> tipo primitivos (ex: int)
        // Objects.equals(objeto1, objeto2) -> Compara objetos de mesmo tipo; Objects é uma classe utilitária, e um método permite comparar objetos
        // Objects é diferente de Object
        return this.numeroPatas == animal.numeroPatas && Objects.equals(this.paisOrigem, animal.paisOrigem) && Objects.equals(this.tamanho, animal.tamanho) && Objects.equals(this.corCorpo, animal.corCorpo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroPatas, paisOrigem, tamanho, corCorpo);
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCorCorpo() {
        return corCorpo;
    }

    public void setCorCorpo(String corCorpo) {
        this.corCorpo = corCorpo;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
}
