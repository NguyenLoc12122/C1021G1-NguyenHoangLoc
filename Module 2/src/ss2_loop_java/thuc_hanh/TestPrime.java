package ss2_loop_java.thuc_hanh;

import java.util.Scanner;

public class TestPrime {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scr.nextInt();
        if (num < 2){
            System.out.println("Is not a prime");
        }
        else {
            int i = 2;
            boolean check = true;
            for (;i < num ; i++){
                if (num % i == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(num + " is a prime ");
            }else {
                System.out.println(num + " is not a prime");
            }


        }

    }
}
