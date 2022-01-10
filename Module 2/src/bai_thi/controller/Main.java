package bai_thi.controller;
import bai_thi.service.ipml.TaiKhoanThanhToanImpl;
import bai_thi.service.ipml.TaiKhoanTietKiemImpl;
import bai_thi.until.NotFoundBankAccountException;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, NotFoundBankAccountException {
        displayMenu();
    }
    public static void displayMenu() throws IOException, NotFoundBankAccountException {
        Scanner scanner = new Scanner(System.in);
        int chosse = 0;
        do {
            System.out.println("-----CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOẢN NGÂN HÀNG-----");
            System.out.println("1.Tài Khoản Thanh Toán");
            System.out.println("2.Tài Khoản Tiết Kiệm");
            System.out.println("3.Exit.....");
            try {
                chosse = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Hãy nhập số");
            }
            switch (chosse){
                case 1:
                    taiKhoanThanhToan();
                    break;
                case 2:
                    taiKhoanTietKiem();
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình ,xin cảm ơn !!");
                    System.exit(0);
                    break;
            }
        }while (true);
    }
    public  static void taiKhoanThanhToan() throws IOException, NotFoundBankAccountException {
        Scanner scanner = new Scanner(System.in);
        TaiKhoanThanhToanImpl taiKhoanThanhToanImpl = new TaiKhoanThanhToanImpl();
        int chosse = 0;
        do {
            System.out.println("1.Thêm mới tài khoản thanh toán.");
            System.out.println("2.Xóa tài khoản thanh toán.");
            System.out.println("3.Xem danh sách tài khoản thanh toán.");
            System.out.println("4.Tìm kiếm tài khoản thanh toán.");
            System.out.println("5.Quay lại menu chính.");
            try {
                chosse = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Hãy nhập số");
            }
            switch (chosse){
                case 1:
                    taiKhoanThanhToanImpl.addNew();
                    break;
                case 2:
                    taiKhoanThanhToanImpl.delete();
                    break;
                case 3:
                    taiKhoanThanhToanImpl.display();
                    break;
                case 4:
                    taiKhoanThanhToanImpl.search();
                    break;
                case 5:
                    displayMenu();
                    break;

            }
        }while (true);
    }
    public  static void taiKhoanTietKiem() throws IOException, NotFoundBankAccountException {
        Scanner scanner = new Scanner(System.in);
        TaiKhoanTietKiemImpl taiKhoanTietKiemImpl = new TaiKhoanTietKiemImpl();
        int chosse = 0;
        do {
            System.out.println("1.Thêm mới tài khoản tiết kiệm.");
            System.out.println("2.Xóa tài khoản tiết kiệm.");
            System.out.println("3.Xem danh sách tài khoản tiết kiệm.");
            System.out.println("4.Tìm kiếm tài khoản tiết kiệm.");
            System.out.println("5.Quay lại menu chính.");
            try {
                chosse = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Hãy nhập số");
            }
            switch (chosse){
                case 1:
                    taiKhoanTietKiemImpl.addNew();
                    break;
                case 2:
                    taiKhoanTietKiemImpl.delete();
                    break;
                case 3:
                    taiKhoanTietKiemImpl.display();
                    break;
                case 4:
                    taiKhoanTietKiemImpl.search();
                    break;
                case 5:
                    displayMenu();
                    break;

            }
        }while (true);
    }

}
