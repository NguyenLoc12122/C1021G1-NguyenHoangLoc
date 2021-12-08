package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = scanner.nextInt();
        String string[] = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        int number [] = {0,1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < number.length; i++) {
            if (num == number[i]) {
                System.out.println(string[i]);
            } else if (num < 20) {
                if (num % 10 == 0) {
                    System.out.println("mười ");
                    break;
                } else if (num % 10 == number[i]) {
                    System.out.println("mười " + string[i]);
                    break;
                }
            } else if (num < 100) {
                if (num / 10 == number[i] && num % 10 == 0) {
                    System.out.println(string[i] + " mươi");
                } else if (num / 10 == number[i] && num % 10 != 0) {
                    System.out.println(string[num / 10] + " mươi " + string[num % 10]);
                }
            } else if (num < 1000) {
                if (num / 100 == number[i] && (num / 10) % 10 == 0 && num % 10 == 0) {
                    System.out.println(string[num / 100] + " trăm");
                } else if (num / 100 == number[i] && (num / 10) % 10 != 0 && num % 10 == 0) {
                    System.out.println(string[num / 100] + " trăm " + string[(num / 10) % 10] + " mươi ");
                } else if (num / 100 == number[i] && (num / 10) % 10 == 0 && num % 10 != 0) {
                    System.out.println(string[num / 100] + " trăm " + " lẻ " + string[num % 10]);
                } else if (num / 100 == number[i]) {
                    System.out.println(string[num / 100] + " trăm " + string[(num / 10) % 10] + " mươi " + string[num % 10]);
                }
            }
        }

    }
}
