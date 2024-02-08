public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Animal animal = new Animal();

        Cachorro cachorro = new Cachorro();

        cachorro.setCorCorpo("Rosado");
        // herança me permite acessar, métodos do Pai pelo Filho

        animal.setCorCorpo("Tangerina Marcia");

//        System.out.println(animal.getClass()); // getClass() é um método do Object, a classe Pai de Todas as Classes
//        System.out.println(animal.toString()); // toString() é um método do Object, a classe Pai de Todas as Classes
//        System.out.println(cachorro.toString()); // o Cachorro herda o método to String de animal, mesmo sendo um método sobreescrito

        animal.pensa();
        cachorro.pensa();


    }
}