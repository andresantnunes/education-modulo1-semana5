package erros;

public class TesteErros {

    // <editor-fold desc="métodos"> -> usado para separa uma quantidade de código

    /**
     * Método de erro -> descrição que irá aparecer para um método na chamada dele
     */
    public void erroAritimetico(){
        extracted();
    }

    private static void extracted() {
        int resultado = 10 / 0;
    }

    // </editor-fold>
}
