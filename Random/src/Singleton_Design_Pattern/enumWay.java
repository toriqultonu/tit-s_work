package Singleton_Design_Pattern;

enum Abd{
    INSTANCE;
    int i;
    public void show(){
        System.out.println(i);
    }
}

public class enumWay {
    public static void main(String[] args){
        Abd ob = Abd.INSTANCE;
        ob.i = 5;
        ob.show();

        Abd ob2 = Abd.INSTANCE;
        ob2.i = 6;
        ob2.show();
    }
}
