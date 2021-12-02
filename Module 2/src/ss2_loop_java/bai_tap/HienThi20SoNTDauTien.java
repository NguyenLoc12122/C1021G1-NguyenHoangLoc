package ss2_loop_java.bai_tap;

import java.util.Scanner;

public class HienThi20SoNTDauTien {
    public static void main(String[] args) {
        System.out.println("20 số nguyên tố đầu tiên là : ");
        int count = 0;

        for (int i = 2; i < 1000; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i + " ");
                count++;
                if (count == 20){
                    break;
                }
            }
        }
    }
    public  static boolean isPrimeNumber(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    }

