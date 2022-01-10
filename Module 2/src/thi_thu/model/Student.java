package thi_thu.model;

public class Student extends Person{
    private String grade;
    private int point;

    public Student(String grade, int point) {
        this.grade = grade;
        this.point = point;
    }

    public Student(int id, String name, String date, String gender, String grade, int point) {
        super(id, name, date, gender);
        this.grade = grade;
        this.point = point;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +"id=" + getId() +
                ", name='" + getName() + '\'' +
                ", date='" + getDate() + '\'' +
                ", gender='" + getGender() + '\'' +
                "grade='" + grade + '\'' +
                ", point=" + point + '\'' +
                '}';
    }
    
}
