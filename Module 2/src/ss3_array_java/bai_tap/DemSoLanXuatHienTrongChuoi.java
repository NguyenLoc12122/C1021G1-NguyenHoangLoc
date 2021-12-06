package ss3_array_java.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi ");
        String chain = scanner.nextLine();
        char kiTu;
        System.out.println("nhập kí tự cần đếm");
        kiTu = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < chain.length(); i++) {
            if (chain.charAt(i) == kiTu) {
                count++;
            }
        }
        System.out.println(count);
    }
}
