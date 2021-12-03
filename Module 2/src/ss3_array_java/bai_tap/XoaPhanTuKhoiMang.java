package ss3_array_java.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int array[] = {10,4,6,7,8,6};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so muon tim");
        int input = scanner.nextInt();

        for (int i = 0 ; i < array.length; i++){
            if (input == array[i]){
                System.out.println("Vi tri can xoa la:" + i);
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
            }
        }
        array[array.length - 1] = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

