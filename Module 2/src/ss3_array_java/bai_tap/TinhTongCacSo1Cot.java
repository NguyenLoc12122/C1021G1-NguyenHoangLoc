package ss3_array_java.bai_tap;

import java.util.Scanner;

public class TinhTongCacSo1Cot {
    public static void main(String[] args) {
        int height ;
        int width ;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập i");
            height = sc.nextInt();
            System.out.println("Nhập j");
            width = sc.nextInt();
            if (height > 10 || width > 10){
                System.out.println("bạn nhập sai rồi !!");
            }
        }while (height > 10 || width > 10);
        int array[][] = new int [height][width];

        for (int i = 0 ; i < height ; i++){
            for (int j = 0 ; j < width ; j++){
                System.out.println("Nhập phần tử thứ [" + i + "]" + "[" + j + "]" );
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ma Trận [i][j]");
        for (int i = 0 ; i < height ; i++){
            for (int j = 0 ; j < width ; j++){
                System.out.print(array[i][j] +"\t");

            }
            System.out.println("\n");
        }
        System.out.println("Nhập cột cần tính tổng");
        int cotJ = sc.nextInt();
        int sum = 0 ;
        for (int i = 0 ; i < height ; i++){
            sum += array[i][cotJ];
        }
        System.out.println(" Tổng Cột " + cotJ + "  là bằng " + sum);
    }
}
