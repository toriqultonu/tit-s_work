public class BubbleSort {

    void Bubble(int a[]) {
        int i, j;
        for (i = 0; i < a.length - 1; i++) {
            for (j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

            }
        }
    }

    void display(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int A[] = {2, 3, 6, 2, 7, 97, 5, 3, 5};

        BubbleSort ob = new BubbleSort();
        ob.Bubble(A);
        ob.display(A);

    }

}
