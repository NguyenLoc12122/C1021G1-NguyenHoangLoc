package ss3_array_java.bai_tap;

import java.util.Scanner;

public class PhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        int height;
        int width;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so hang");
        height = scanner.nextInt();
        System.out.println("Nhap so cot");
        width = scanner.nextInt();
        int[][] arr = new int[height][width];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhap phan tu " + i + "." + j);
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Phan tu co GTLN la: " + max);
    }
}
