package AlgoProbs;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

    static List<List<Integer>> powerSet(int[] array){
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());

        for(Integer element : array){
            int len = subsets.size();

            for(int i = 0; i<len; i++){
                List<Integer> currentSubset = new ArrayList<>(subsets.get(i));
                currentSubset.add(element);
                subsets.add(currentSubset);
            }
        }
        return subsets;
    }

    public static void main(String[] args){

        int[] arr = {1,2,3};

        System.out.println(powerSet(arr));
    }
}
