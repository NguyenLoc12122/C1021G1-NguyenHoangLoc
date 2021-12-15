package bai_tap_tutor.bai2.model;

public class Student {
    private int idStudent;
    private String name;
    private String dayOfBirth;
    private String gender;
    private String className;
    private String grade;

    public Student() {
    }

    public Student(int idStudent, String name, String dayOfBirth, String gender, String className, String grade) {
        this.idStudent = idStudent;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.className = className;
        this.grade = grade;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", className='" + className + '\'' +
                ", course=" + grade +
                '}';
    }
}
