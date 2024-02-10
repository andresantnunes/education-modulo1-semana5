public class Minion extends Pessoa{

    public Minion(String nome, int idade) {
        super(nome, idade);
    }

    @Override //Sobreecrita
    public void testExterno(){
        System.out.println("Teste");
    }

    public void testExternoSuper(){
        super.testExterno(); // burlando a sobreescrita
    }

    //sobrecarga da sobreecrita ou da herança
    public void testExterno(String t){
        System.out.println(t);
    }
}
