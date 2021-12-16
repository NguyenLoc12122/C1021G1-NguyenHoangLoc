package ss11_stack_queue.bai_tap.su_dung_ds_lien_ket_vong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Staff implements Comparable<Staff>{
    String name;
    String gender;
    String date;

    public Staff() {
    }

    public Staff(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.date = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + date + '\'' +
                '}';
    }

    @Override
    public int compareTo(Staff o) {
        Date date1 = null;
        try {
            date1 = new SimpleDateFormat("dd/MM/yyyy").parse(o.date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date date2 = null;
        try {
            date2 = new SimpleDateFormat("dd/MM/yyyy").parse(this.date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date2.compareTo(date1);
    }
}
