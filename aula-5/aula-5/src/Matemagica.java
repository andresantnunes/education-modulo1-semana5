public class Matemagica {



    public long calculoFatorial(int numero){

        //caso base
        if(numero <= 1){
            System.out.println("Caso Base: " + numero);
            return 1;
        }
        System.out.println("Chamada Recursiva: " + numero);

        // chamada recursiva
        return numero * calculoFatorial(numero-1);

        // 5 * ( 4 * ( 3 * ( 2 * ( 1 * 1)
        // 5 * ( 4 * ( 3 * 2 )
        // 5 * ( 4 * 6 )
        // 5 * 24
        // 120
    }

    //sobrecarga
    // mesmo nome de método, porém parametros diferentes
    // podem ter um retorno diferente
    public double calculoFatorial(double numero){

        //caso base
        if(numero <= 1){
            System.out.println("Caso Base: " + numero);
            return 1;
        }
        System.out.println("Chamada Recursiva: " + numero);

        // chamada recursiva
        return numero * calculoFatorial(numero-1);

        // 5 * ( 4 * ( 3 * ( 2 * ( 1 * 1)
        // 5 * ( 4 * ( 3 * 2 )
        // 5 * ( 4 * 6 )
        // 5 * 24
        // 120
    }

}
