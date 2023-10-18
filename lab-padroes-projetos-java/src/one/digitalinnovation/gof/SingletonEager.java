package one.digitalinnovation.gof;

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {

        return instancia;
    }
}
