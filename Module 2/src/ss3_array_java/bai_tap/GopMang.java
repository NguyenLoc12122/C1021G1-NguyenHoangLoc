package ss3_array_java.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int array1[] = new int[5];
        int array2[] = new int[4];
        int array3[] = new int[9];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i < array1.length ; i++){
            System.out.println("Nhap vao phan tu thu " + i + " cua mang");
            array1[i] = scanner.nextInt();
            array3[i] = array1 [i];
        }
        for (int j = 0 ; j < array2.length ; j++){
            System.out.println("Nhap vao phan tu thu " + j + " cua mang 2");
            array2[j] = scanner.nextInt();
            array3[array3.length + j - 4] = array2[j];
        }
        System.out.print("Cac phan tu cua mang thu ba la : ");
        for (int array : array3){
            System.out.print(array);
        }
    }
}
