package ss1_introdution_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        int VND;
        int USD;
        int result;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số USD cần đổi : ");
        USD = scanner.nextInt();
        result = USD*23000;
        System.out.println(result + "VND");
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Nhập số VND cần đổi : ");
        VND = scanner1.nextInt();
        result = VND/23000;
        System.out.println(result + "USD");
    }
}
