package bai_tap_tutor.bai2.service;

import bai_tap_tutor.bai2.model.Student;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentService extends Student implements IStudent,Comparable<StudentService> {
    Scanner scanner = new Scanner(System.in);
    private static Student[] studentsList = new Student[3];
    static {
        Student student = new StudentService(1, " Nguyễn Minh Đông", "30/01/1995", " Nam", "C10", "g1_21");
        Student student1 = new StudentService(4, " Nguyễn Minh Phúc", "12/12/1995", " Nam", "C10", "g1_21");
        Student student2 = new StudentService(2, " Nguyễn Minh Hoàng", "15/05/2003", " Nam", "C10", "g1_21");
        studentsList[0] = student;
        studentsList[1] = student1;
        studentsList[2] = student2;

    }
    public StudentService() {
    }

    public StudentService(int idStudent, String name, String dayOfBirth, String gender, String className, String grade) {
        super(idStudent, name, dayOfBirth, gender, className, grade);
    }

    @Override
    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời nhập thông tin sinh viên mới");

        System.out.print("Nhập mã số sinh viên: ");
        int mssv = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập tên sinh viên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập ngày sinh sinh viên: ");
        String dayOfbirth = scanner.nextLine();

        System.out.print("Nhập giới tính sinh viên: ");
        String gender = scanner.nextLine();

        System.out.print("Nhập lớp sinh viên: ");
        String ofClass = scanner.nextLine();

        System.out.print("Nhập khóa sinh viên: ");
        String grade = scanner.nextLine();
        Student student = new Student(mssv, name, dayOfbirth, gender, ofClass, grade);


        Student[] newStudentList = new Student[studentsList.length + 1];
        for (int i = 0; i < studentsList.length; i++) {
            newStudentList[i] = studentsList[i];
        }
        newStudentList[newStudentList.length - 1] = student;
        studentsList = newStudentList;
    }

    @Override
    public void removeidStudent() {
        System.out.print("Nhập id sinh viên cần xóa: ");
        int value = Integer.parseInt(scanner.nextLine());
        Student[] newStudentList = new Student[studentsList.length - 1];
        for (int i = 0; i < studentsList.length; i++) {
            if (value == studentsList[i].getIdStudent()) {
                for (int j = i; j < studentsList.length - 1; j++) {
                    studentsList[j] = studentsList[j + 1];
                }
            }
        }
        for (int i = 0; i < newStudentList.length; i++) {
            newStudentList[i] = studentsList[i];
        }

        studentsList = newStudentList;
    }

    @Override
    public void removeP() {
        System.out.print("Mời nhập STT sinh viên cần xóa: ");
        int value = Integer.parseInt(scanner.nextLine());
        Student[] newStudentList = new Student[studentsList.length - 1];
        for (int i = 0; i < studentsList.length; i++) {
            if (value == i + 1) {
                for (int j = i; j < studentsList.length - 1; j++) {
                    studentsList[j] = studentsList[j + 1];
                }
            }
        }
        for (int i = 0; i < newStudentList.length; i++) {
            newStudentList[i] = studentsList[i];
        }

        studentsList = newStudentList;
    }

    @Override
    public Student searchStudent() {
        System.out.println("Mời nhập MSSV hoặc tên sinh viên cần tìm: ");
        String string = scanner.nextLine();
        Student student = new StudentService();
        Pattern p = Pattern.compile("^[0-9]+$");
        for (int i = 0; i < studentsList.length; i++) {
            if (p.matcher(string).find()) {
                if (Integer.parseInt(string) == studentsList[i].getIdStudent()) {
                    student = studentsList[i];
                    break;
                }

            } else if (string.equals(studentsList[i].getName())) {
                student = studentsList[i];
                break;
            }
        }
        return student;
    }

    @Override
    public Student[] printAll() {
        return studentsList;
    }

    @Override
    public void sort() {
        Arrays.sort(studentsList);
    }

    @Override
    public int compareTo(StudentService o) {
        return this.getIdStudent() - o.getIdStudent();
    }
}
