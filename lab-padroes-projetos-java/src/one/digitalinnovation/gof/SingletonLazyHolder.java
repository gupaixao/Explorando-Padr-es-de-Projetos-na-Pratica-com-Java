package one.digitalinnovation.gof;

public class SingletonLazyHolder {
    private static class InstanceHolder {
        public static SingletonEager instancia = new SingletonEager();
    }

    private SingletonLazyHolder () {
        super();
    }

    public static SingletonEager getInstancia() {
        return InstanceHolder.instancia;
    }
}
