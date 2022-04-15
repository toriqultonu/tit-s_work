package AlgoProbs;

public class LongestPeak {

    static int longestPeak(int[] array){

        int longestPeak = 0;

        for(int i=1; i<array.length-1; i++){
            boolean isPeak = array[i-1] < array[i] && array[i] > array[i+1];

            if(!isPeak)
                continue;

            int leftCount = i-2;
            for(; leftCount >=0 && array[leftCount] < array[leftCount+1]; leftCount--){}

            int rightCount = i+2;
            for(; rightCount<array.length && array[rightCount] < array[rightCount-1]; rightCount++){}

            int currentPeak = rightCount-leftCount-1;

            longestPeak = Math.max(longestPeak, currentPeak);

        }
        return longestPeak;
    }

    public static void main(String[] args){

        int[] array = {1,2,3,3,4,0,10,6,5,-1,-3,2,3};

        System.out.println(longestPeak(array));
    }
}
