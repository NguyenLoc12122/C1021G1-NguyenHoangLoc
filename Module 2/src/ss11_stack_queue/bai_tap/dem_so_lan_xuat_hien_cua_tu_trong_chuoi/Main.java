package ss11_stack_queue.bai_tap.dem_so_lan_xuat_hien_cua_tu_trong_chuoi;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi");
        String str = scanner.nextLine();

        Map<String , Integer> treeMap = new TreeMap<>();
        String character;
        for (int i = 0 ; i < str.length();i++){
            character = String.valueOf(str.charAt(i));
            //Nếu kí tự đã xuất hiện tăng thêm 1 đơn vị
            if (treeMap.containsKey(character)){
                int currentValue = treeMap.get(character);
                treeMap.put(character,currentValue + 1);
//                treeMap.replace(character,currentValue + 1);
            }else {
                treeMap.put(character,1);
            }
        }
        System.out.println(treeMap);
    }

}
