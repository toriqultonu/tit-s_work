package Singleton_Design_Pattern;

class abc{
    public static abc obj;
    private abc(){
        System.out.println("Instance created");
    }
    public static abc getInstance(){
        if(obj == null){
            synchronized (abc.class){              // In this way we can avoid time lacking in singleton of multi thread.
                obj = new abc();
            }
        }
        return obj;
    }
}

public class doubleCheckedWay {
    public static void main(String[] args){
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                abc ob = abc.getInstance();
            }
        });

        Thread t2 = new Thread(new Runnable(){
            public void run(){
                abc ob = abc.getInstance();
            }
        });

        t1.start();
        t2.start();
    }
}
