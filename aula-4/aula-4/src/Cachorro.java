public class Cachorro extends Animal {

     private String corPelo;
     private String raca;
     private String porte;
     private String nome = "Caramelo";
     private boolean temPedigri;

     public void latir(){
         System.out.println("AU! AU!");
     }

//     @Override // override é opcional
     public void pensa(){
         super.pensa();//extensão proposital
         System.out.println("Cachorro pensa");
     }

     public void exibirInformacoes(){

         System.out.println("Animal:"); // super se refere ao dados da classe Pai/Superclasse
         System.out.println("numeroPatas "+ super.numeroPatas); // posso acessar numero de patas pois é protected, defaul também funciona
         System.out.println("paisOrigem "+ super.getPaisOrigem());
         System.out.println("tamanho "+ super.getTamanho());
         System.out.println("corCorpo "+ super.getCorCorpo());

         System.out.println("Cachorro:");
         System.out.println("corPelo " + corPelo);
         System.out.println("raca " + raca);
         System.out.println("porte " + porte);
         System.out.println("nome " + nome);
         System.out.println("temPedigri " + temPedigri);
     }


}
