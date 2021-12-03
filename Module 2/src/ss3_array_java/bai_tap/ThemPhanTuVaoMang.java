package ss3_array_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int array[] = {10,4,6,7,8,0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can them");
        int addNum = scanner.nextInt();
        System.out.println("Nhap vi tri muon chen");
        int indexArr = scanner.nextInt();
        int count = 0;
        int newArr[] = new int[array.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i == indexArr) {
                newArr[i] = addNum;
            } else {
                newArr[i] = array[count];
                count++;
            }
            newArr[indexArr] = addNum;
        }
        System.out.println("Mảng sau khi được thêm : " + Arrays.toString(newArr));
    }
}
