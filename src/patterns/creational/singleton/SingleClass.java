package patterns.creational.singleton;

public class SingleClass {
    private static SingleClass instance;

    private SingleClass(){
        System.out.println("Constructor Called");
    }

    public static SingleClass getInstance(){
        if(instance == null){
            instance = new SingleClass();
            return instance;
        }
        else{
            return instance;
        }
    }


}
