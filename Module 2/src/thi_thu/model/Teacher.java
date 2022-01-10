package thi_thu.model;

public class Teacher extends Person {
    private String chuyenMon;

    public Teacher() {
    }

    public Teacher(int id, String name, String date, String gender, String chuyenMon) {
        super(id, name, date, gender);
        this.chuyenMon = chuyenMon;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    @Override
    public String toString() {
        return  "Teacher{" +"id=" + getId() +
                ", name='" + getName() + '\'' +
                ", date='" + getDate() + '\'' +
                ", gender='" + getGender() + '\'' +
                "chuyenMon='" + chuyenMon + '\'' +
                '}';
    }

}
