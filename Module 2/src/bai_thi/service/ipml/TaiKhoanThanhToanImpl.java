package bai_thi.service.ipml;

import bai_thi.model.TaiKhoanThanhToan;
import bai_thi.service.Service;
import bai_thi.until.NotFoundBankAccountException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TaiKhoanThanhToanImpl implements Service {
    public static final String TAI_KHOAN_THANH_TOAN_CSV = "D:\\codegym\\C1021G1-NguyenHoangLoc\\Module 2\\src\\bai_thi\\data\\TaiKhoanThanhToan.csv";
    static Scanner scanner = new Scanner(System.in);
    static List<TaiKhoanThanhToan> taiKhoanThanhToanList = new ArrayList<>();

    public TaiKhoanThanhToanImpl() {
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
        String soThe = null;
        int accountMoney = 0;
        boolean check;


        System.out.println("Nhập Mã Ngân Hàng");
        bankCode = scanner.nextLine();
        System.out.println("Nhập Tên Tài Khoản");
        nameAccount = scanner.nextLine();
        System.out.println("Nhập ngày mở tài khoản");
        dateOpenAccount = scanner.nextLine();
        System.out.println("Nhập số thẻ");
        soThe = scanner.nextLine();
        do {
            check = false;
            try {
                check = false;
                System.out.println("Nhập số tiền trong tài khoản");
                accountMoney = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Hãy nhập số");
                check = true;
                continue;
            }
            if (accountMoney < 0) {
                System.out.println("Số tiền phải lớn hơn 0");
                check = true;
                continue;
            }
            TaiKhoanThanhToan taiKhoanThanhToan = new TaiKhoanThanhToan("003" + randomCode(), nameAccount, dateOpenAccount, soThe, accountMoney);
            taiKhoanThanhToanList.add(taiKhoanThanhToan);
            writeFile();


        }while (check);
    }

    @Override
    public void delete() {
        System.out.println("Nhập mã tài khoản mà bạn muốn xóa.");
        String bankCode = scanner.nextLine();
        for (int i=0 ; i< taiKhoanThanhToanList.size() ; i++){
            if (taiKhoanThanhToanList.get(i).getBankCode().equals(bankCode)){
                System.out.println("Yes or No");
                String check = scanner.nextLine();
                if (check.equals("yes")){
                    taiKhoanThanhToanList.remove(i);
                    writeFile();
                    System.out.println("Xóa thành công");
                }
            }
        }

    }

    @Override
    public void display() {
        for (TaiKhoanThanhToan taiKhoanThanhToan : taiKhoanThanhToanList){
        System.out.println(taiKhoanThanhToan);

    }

    }

    @Override
    public void search() throws NotFoundBankAccountException {

        System.out.println("Nhập tên sản phẩm bạn muốn tìm.");
        String nameAccount = scanner.nextLine();
        for (int i=0 ; i<taiKhoanThanhToanList.size() ; i++) {
            if (taiKhoanThanhToanList.get(i).getNameAccount().contains(nameAccount)) {
                System.out.println(taiKhoanThanhToanList.get(i));
            }else {
                throw new NotFoundBankAccountException("khong tìm thấy");
            }
        }

    }
    public static void writeFile(){
        try {
            FileWriter fileWriter = new FileWriter(TAI_KHOAN_THANH_TOAN_CSV);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (TaiKhoanThanhToan taiKhoanThanhToan : taiKhoanThanhToanList){
                bufferedWriter.write(taiKhoanThanhToan.getId()+","+taiKhoanThanhToan.getBankCode()
                        +","+taiKhoanThanhToan.getNameAccount()+","+taiKhoanThanhToan.getDateOpenAccount()
                        +","+taiKhoanThanhToan.getSoThe()+","+taiKhoanThanhToan.getAccountMoney());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFile(){
        taiKhoanThanhToanList.clear();
        try {
            FileReader fileReader = new FileReader(TAI_KHOAN_THANH_TOAN_CSV);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine())!=null){
                String[] newData = data.split(",");
                TaiKhoanThanhToan taiKhoanThanhToan = new TaiKhoanThanhToan(newData[1],newData[2],
                        newData[3],newData[4], Integer.parseInt(newData[5])
                        );
                taiKhoanThanhToanList.add(taiKhoanThanhToan);

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
