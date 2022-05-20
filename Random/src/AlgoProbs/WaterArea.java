package AlgoProbs;

public class WaterArea {

    static int waterArea(int[] heights){

        int total = 0;

        int[] leftMaxes = new int[heights.length];

        int left = 0;

        for(int i =0;i<heights.length;i++){
            leftMaxes[i] = left;
            left = Math.max(heights[i], left);
        }

        int[] rightMaxes = new int[heights.length];

        int right = 0;

        for(int i = heights.length-1;i>=0;i--){
            rightMaxes[i] = right;
            right = Math.max(heights[i], right);
        }

        int[] resultArray = new int[heights.length];

        int minHeight = 0;

        for(int i = 0;i<heights.length; i++){
            minHeight = Math.min(leftMaxes[i], rightMaxes[i]);
            if(heights[i] < minHeight){
                resultArray[i] = minHeight - heights[i];
            }
            else
                resultArray[i] = 0;
            total += resultArray[i];
        }
        return total;
    }

    public static void main(String[] args){

        int[] heights = {0,8,0,0,5,0,0,10,0,0,1,1,0,3};

        System.out.println(waterArea(heights));
    }
}
