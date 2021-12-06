package ss3_array_java.bai_tap;

import java.util.Scanner;

public class TimGTNNTrongMang {
    public static void main(String[] args) {
        int array[] = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i < array.length ; i++){
            System.out.println("Moi nhap vao phan tu thu " + i + " cua mang");
            array[i] = scanner.nextInt();
        }
        int min = array [0];
        for (int j = 1 ; j < array.length ; j++){
            if (array[j] < min){
                min = array[j];
            }
        }
        System.out.println("Gia tri nho nhat trong mang la : " + min);
    }
}
