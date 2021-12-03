package ss2_loop_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1 ;
        Scanner input = new Scanner(System.in);
        while (choice != 0){
            System.out.println("menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            choice = input.nextInt();
            switch (choice){
                case 1 :
                    System.out.println(" Print the rectangle");
                    for (int i = 1; i <= 3 ; i++){
                        for (int j = 1 ; j <= 7 ; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2 :
                    System.out.println("Print the square triangle : botton-left");
                    for (int i = 1;i <= 6;i++){
                        for (int j = 1 ; j < i ; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("Print the square triangle :top-left ");
                    for (int i = 5 ; i >= 1;i--){
                        for (int j = 1 ; j <= i; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3 :
                    System.out.println("Print isosceles triangle");
                    for (int i = 0; i <= 6; i++) {
                        for (int j = 6; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i * 2 -1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("no choice");
            }
        }
    }
}
