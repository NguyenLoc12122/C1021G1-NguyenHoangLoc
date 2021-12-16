package ss11_stack_queue.bai_tap.su_dung_ds_lien_ket_vong;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class QueueStaff {
    public static void main(String[] args) {
        Queue<Staff> personnel = new LinkedList<>();
        {
            personnel.add(new Staff("Son", "Nam", "01/07/1994"));
            personnel.add(new Staff("Ngoc", "Nu", "29/02/1997"));
            personnel.add(new Staff("Linh", "Nam", "03/11/1993"));
            personnel.add(new Staff("Hien", "Nu", "25/05/1996"));
            personnel.add(new Staff("Dong", "Nam", "16/10/1995"));
            personnel.add(new Staff("Ly", "Nu", "24/06/1994"));
        }
        Queue<Staff> nu = new LinkedList<>();
        Queue<Staff> nam = new LinkedList<>();
        for (Staff ele : personnel) {
            if (ele.getGender().equals("Nu")) {
                nu.add(ele);
            } else {
                nam.add(ele);
            }
        }
        Collections.sort((LinkedList<Staff>) nu);
        Collections.sort((LinkedList<Staff>) nam);
        for (Staff ele : nu) {
            System.out.println(ele);
        }
        for (Staff ele : nam) {
            System.out.println(ele);
        }
    }
}
