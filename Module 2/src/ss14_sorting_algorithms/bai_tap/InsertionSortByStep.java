package ss14_sorting_algorithms.bai_tap;

import java.util.Scanner;

public class InsertionSortByStep extends InsertionSort{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang");
        int size = scanner.nextInt();
        int [] list2 = new int[size];

        System.out.println("Nhap " + list2.length + " phan tu:");
        for (int i = 0; i < list2.length; i++) {
            list2[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list2.length; i++) {
            System.out.print(list2[i] + "\t");
        }
        insertionSort(list2);
        System.out.println("\n Mang sau khi chen :");
        for (int i = 0; i < list2.length; i++) {
            System.out.print(list2[i] + " ");
        }
    }

}
