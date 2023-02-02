public class Teste {

    private static Teste instance;

    private Teste(){}

    public static Teste getInstance() {
        if(instance == null) {
            instance = new Teste();
        }
        return instance;
    }
}
