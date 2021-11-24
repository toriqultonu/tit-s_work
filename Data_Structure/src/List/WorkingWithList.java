package List;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithList {
    public static void main(String[] args){
        List<String> colors = new ArrayList<>();

        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");

        System.out.println(colors.contains("purple"));
        System.out.println(colors.size());
    }
}
