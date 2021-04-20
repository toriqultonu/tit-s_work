
class conlog{
    public void log(String msg){
        System.out.println("Log saved in text file: "+msg);
    }
}

public class DependencyInjection {

    public static void main(String[] args){
        conlog logc = new conlog();
        try{
            throw new Exception("Test exception");
        }
        catch (Exception e){
            logc.log(e.getMessage());

        }
    }
}
