package ss11_stack_queue.bai_tap.dao_nguoc_mang_so_nguyen;

import java.util.Scanner;
import java.util.Stack;

public class ArrayInterger {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng số nguyên :");
        int number = scanner.nextInt();
        int array[] = new int[number];
        System.out.println("Nhập phần tử của mảng : ");
        for (int i = 0 ; i < array.length ; i++){
            array[i]=scanner.nextInt();
            stack.push(array[i]);
        }
        System.out.println("Mảng có các phần tử là : ");
        for (int i=0 ; i < array.length ; i++){
            System.out.println(array[i]);
        }
        System.out.println("Mảng sau khi đảo ngược là : ");
        for (int i = 0 ; i < array.length ; i++){
            System.out.println(stack.pop());
        }
    }
}
