package ss14_sorting_algorithms.bai_tap;

public class InsertionSort {
    static int[] list1 = {91,12,15,27,07,05,22};
    public static void insertionSort(int[] list){
        for (int i = 1 ; i < list.length; i++){
            int currentElement = list [i];
            int k;
            for (k= i - 1;k >= 0 && list[k] > currentElement; k--){
                list[k+1]=list[k];
            }
        list[k+1] = currentElement;
        }

    }

    public static void main(String[] args) {
        insertionSort(list1);
        for (int i = 0; i < list1.length; i++)
            System.out.print(list1[i] + " ");
    }

}
