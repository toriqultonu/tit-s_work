package Singleton_Design_Pattern;

class Abc{
    static Abc obj = new Abc();                 // 1. Create a static instance of the class
    private Abc(){ }                            // 2. Make the default constructor private to prevent default call
    public static Abc getInstance(){            // 3. Create a method to call the instance
        return obj;
    }
}

public class egerWay {
    public static void main(String[] args){

        Abc ob1 = Abc.getInstance();
        Abc ob2 = Abc.getInstance();
    }
}
