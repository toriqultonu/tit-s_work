public class SelectionSort {

    void swap(int a, int b){
        int temp = a;
        a = b;
        b = a;
    }

    void sort(int[] arr){

        int k;
        for(int i=0;i<arr.length-1;i++){
            k = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[j]<arr[k]){
                    k = j;
                }
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
            }
        }
    }
    void display(int[] arr){
        for(int a:arr){
            System.out.print(a+"  ");
        }
    }

    public static void main(String[] args){
        int arr[] = {5,2,7,43,7,46,8};
        SelectionSort ob = new SelectionSort();
        ob.sort(arr);
        ob.display(arr);
    }
}
