package patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        SingleClass instance1 = SingleClass.getInstance();
        SingleClass instance2 = SingleClass.getInstance();

        System.out.println(instance1 == instance2);

    }
}
