package ss3_array_java.bai_tap;

import java.util.Scanner;

public class TinhTongSoDuongCheoChinhMaTranVuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("nhập kích thước mảng :");
            n = scanner.nextInt();
        } while (n > 10);
        int arrays[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("nhập phần tử thứ " + i + " - " + j);
                arrays[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrays[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int sum =0;
        for ( int i=0;i<arrays.length;i++) {
            sum+= arrays[i][i];
        }
        System.out.println("tổng đường chéo ma trận vuông là :" + sum);
    }
}

