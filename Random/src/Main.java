public class Main {

    public static void main(String[] args){

        double a, b, c, d;

        a = 69.9;
        b = 0.0;
        try {
            c = a / b;
            d = a - b;
            System.out.println("The value of 1st operation is: "+ c);
            System.out.println("The value of 2nd operation is: "+ d);
        }
        catch (Exception e){
            System.out.println("Exception happened! The exception is: "+e);
        }
        System.out.println("Tonu");


    }
}
