public class InsertionSort {

    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void display(int arr[]) {
        for (int a : arr) {
            System.out.print(a + ", ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {13, 4, 64, 6, 23, 6, 5};

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        ob.display(arr);
    }
}
