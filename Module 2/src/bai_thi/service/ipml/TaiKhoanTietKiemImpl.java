package bai_thi.service.ipml;

import bai_thi.model.TaiKhoanThanhToan;
import bai_thi.model.TaiKhoanTietKiem;
import bai_thi.service.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TaiKhoanTietKiemImpl implements Service {
    public static final String TAI_KHOAN_TIET_KIEM_CSV="D:\\codegym\\C1021G1-NguyenHoangLoc\\Module 2\\src\\bai_thi\\data\\TaiKhoanTietKiem.csv";
    static Scanner scanner = new Scanner(System.in);
    static List<TaiKhoanTietKiem> taiKhoanTietKiemList = new ArrayList<>();
    public TaiKhoanTietKiemImpl() {
        readFile();
    }
    public static int random() {
        Random random = new Random();
        int bankCode = 0;
        bankCode = random.nextInt(10);
        return bankCode;
    }

    public static String randomCode() {
        String result = "";
        for (int i = 0; i < 2; i++) {
            result += random() + "";
        }
        return result;
    }
    @Override
    public void addNew() {
        String bankCode = null;
        String nameAccount = null;
        String dateOpenAccount = null;
        int tienGui = 0;
        String ngayGui = null;
        double laiSuat = 0.0;
        String kiHan = null;

        boolean check;


        System.out.println("Nhập Mã Ngân Hàng");
        bankCode = scanner.nextLine();
        System.out.println("Nhập Tên Tài Khoản");
        nameAccount = scanner.nextLine();
        System.out.println("Nhập ngày mở tài khoản");
        dateOpenAccount = scanner.nextLine();
        do {
            check = false;
            try {
                check = false;
                System.out.println("Nhập số tiền trong tài khoản");
                tienGui = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Hãy nhập số");
                check = true;
                continue;
            }
            if (tienGui < 0) {
                System.out.println("Số tiền phải lớn hơn 0");
                check = true;
                continue;
            }
            } while (check) ;

            System.out.println("Nhập ngày gửi tiền vào tài khoản");
            ngayGui = scanner.nextLine();
            do {
                check = false;
                try {
                    check = false;
                    System.out.println("Nhập Lãi suất");
                    laiSuat = Double.parseDouble(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Hãy nhập số");
                    check = true;
                    continue;
                }
                if (laiSuat < 0) {
                    System.out.println("Phải nhập số lớn hơn 0 nha !!!");
                    check = true;
                    continue;
                }
            } while (check);
            System.out.println("Nhập Kì hạn");
            kiHan = scanner.nextLine();
            TaiKhoanTietKiem taiKhoanTietKiem = new TaiKhoanTietKiem("003" + randomCode(), nameAccount, dateOpenAccount,
                    tienGui, ngayGui, laiSuat, kiHan);
            taiKhoanTietKiemList.add(taiKhoanTietKiem);
            writeFile();

    }
    @Override
    public void delete() {
        System.out.println("Nhập mã tài khoản mà bạn muốn xóa.");
        String bankCode = scanner.nextLine();
        for (int i=0 ; i< taiKhoanTietKiemList.size() ; i++){
            if (taiKhoanTietKiemList.get(i).getBankCode().equals(bankCode)){
                System.out.println("Yes or No");
                String check = scanner.nextLine();
                if (check.equals("yes")){
                    taiKhoanTietKiemList.remove(i);
                    writeFile();
                    System.out.println("Xóa thành công");
                }
            }
        }
    }

    @Override
    public void display() {
        for (TaiKhoanTietKiem taiKhoanTietKiem : taiKhoanTietKiemList){
            System.out.println(taiKhoanTietKiem);

        }
    }
    @Override
    public void search() {
        System.out.println("Nhập tên sản phẩm bạn muốn tìm.");
        String nameAccount = scanner.nextLine();
        for (int i=0 ; i<taiKhoanTietKiemList.size() ; i++) {
            if (taiKhoanTietKiemList.get(i).getNameAccount().contains(nameAccount)) {
                System.out.println(taiKhoanTietKiemList.get(i));
            }
        }

    }
    public static void writeFile(){
        try {
            FileWriter fileWriter = new FileWriter(TAI_KHOAN_TIET_KIEM_CSV);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (TaiKhoanTietKiem taiKhoanTietKiem : taiKhoanTietKiemList){
                bufferedWriter.write(taiKhoanTietKiem.getId()+","+taiKhoanTietKiem.getBankCode()
                        +","+taiKhoanTietKiem.getNameAccount()+","+taiKhoanTietKiem.getDateOpenAccount()
                        +","+taiKhoanTietKiem.getTienGui()+","+taiKhoanTietKiem.getNgayGui()+","+
                        taiKhoanTietKiem.getLaiSuat()+","+taiKhoanTietKiem.getKiHan());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFile(){
        taiKhoanTietKiemList.clear();
        try {
            FileReader fileReader = new FileReader(TAI_KHOAN_TIET_KIEM_CSV);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine())!=null){
                String[] newData = data.split(",");
                TaiKhoanTietKiem taiKhoanTietKiem = new TaiKhoanTietKiem(newData[1],newData[2],
                        newData[3], Integer.parseInt(newData[4]),newData[5],Double.parseDouble(newData[6]),newData[7]);
                taiKhoanTietKiemList.add(taiKhoanTietKiem);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
