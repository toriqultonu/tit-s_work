import java.util.Scanner;

public class VowelFinder {

    static String VowelOnly(String str){
        String vowel = "aeiou";
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (vowel.contains(String.valueOf(c).toLowerCase())) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(VowelOnly(str));
    }
}
