package Singleton_Design_Pattern;

class Abcd
{
    static Abcd obj = null;
    private Abcd(){
        System.out.println("Instance created");
    }
    public static Abcd getInstance(){
        if(obj == null){                        // Creating singleton in lazyway to prevent auto creating of instance.
            obj = new Abcd();
        }
        return obj;
    }
}

public class lazyWay {
    public static void main(String[] args){

        Abcd ob1 = Abcd.getInstance();
        Abcd ob2 = Abcd.getInstance();
    }
}
