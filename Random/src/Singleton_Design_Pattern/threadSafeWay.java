package Singleton_Design_Pattern;


class Abcde{
    static Abcde obj = null;
    private Abcde(){
        System.out.println("Instance created");
    }
    public static synchronized Abcde  getInstance(){     // synchronized keyword used to make the getInstance method synchronized for all threads.
        if(obj == null){
            obj = new Abcde();
        }
        return obj;
    }
}

public class threadSafeWay {
    public static  void main(String[] args){
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                Abcde ob = Abcde.getInstance();
            }
        });

        Thread t2 = new Thread(new Runnable(){
            public void run(){
                Abcde ob = Abcde.getInstance();
            }
        });

        t1.start();
        t2.start();
    }
}
