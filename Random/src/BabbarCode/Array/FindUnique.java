package BabbarCode.Array;

import java.util.*;
import java.io.*;

class FindUnique{

    public static String SearchingChallenge(String str) {
        char a = str.charAt(str.length() - 1);
        if(a == '_'){
            return "false";
        }
        else return "true";
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SearchingChallenge(s.nextLine()));
    }

}