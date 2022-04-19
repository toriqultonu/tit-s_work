package AlgoProbs;

import java.util.ArrayList;

class Solution{
    public static int CalPoints(String[] ops){

        int result  = 0;

        ArrayList<Integer> r = new ArrayList<>();
        int a=0, b = 0;
        for(int i=0;i<ops.length;i++){

            switch (ops[i]){
                case "+":
                    r.add(Integer.parseInt(ops[i-2]) + Integer.parseInt(ops[i-1]));
                case "D":
                    r.add(Integer.parseInt(ops[i-1])*2);
                    break;
                case "C":
                    r.remove(r.size() - 1);
                    break;
                default:
                    r.add(Integer.parseInt(ops[i-1]));
            }
        }

        for(int j =0 ;j<r.size();j++){
            result += r.get(j);
        }
        return result;
    }

    public static void main(String[] args){

        String[] array = {"5", "3", "D", "C", "+"};
        System.out.println(CalPoints(array));
    }
}