package AlgoProbs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrIdx = 0;
        int seqIdx = 0;
        while (arrIdx < array.size() && seqIdx < sequence.size()) {
            if (array.get(arrIdx) == sequence.get(seqIdx)) {
                seqIdx++;
            }
            arrIdx++;
        }
        return seqIdx == sequence.size();
    }

    public static void main(String[] args){

        Integer[] array = {5,1,22,25,6,-1,8,10,11,7};
        Integer[] sequence = {1,6,1,10};

        List<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
        List<Integer> sequenceList = new ArrayList<>(Arrays.asList(sequence));

        if(isValidSubsequence(arrayList, sequenceList)){
            System.out.println("This is a valid subsequence");
        }
        else {
            System.out.println("This is not a valid subsequence");
        }
    }
}
