package ss1_introdution_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        int vnd;
        int usd;
        int result;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số USD cần đổi : ");
        usd = scanner.nextInt();
        result = usd*23000;
        System.out.println(result + "VND");
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Nhập số VND cần đổi : ");
        vnd = scanner1.nextInt();
        result = vnd/23000;
        System.out.println(result + "USD");
    }
}
