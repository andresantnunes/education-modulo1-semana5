public class ExercicioConfiguracao {

    private static String config;

    static {
        config = "inicializada";
    }

    public static void exibeConfig(){
        System.out.println("Configuração esta :" + config);
    }
}
