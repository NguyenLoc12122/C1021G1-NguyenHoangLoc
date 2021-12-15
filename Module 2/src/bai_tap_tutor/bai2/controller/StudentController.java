package bai_tap_tutor.bai2.controller;

import bai_tap_tutor.bai2.model.Student;
import bai_tap_tutor.bai2.service.StudentService;

import java.util.Scanner;

public class StudentController {
    public static void main(String[] args) {
        Student[] studentList = null;
        StudentService studentService = new StudentService();
        int select = 0;
        int value = 0;
        String string = "";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu" +
                    "\n 1 : Hiển thị danh sách sinh viên" +
                    "\n 2 : Thêm sinh viên" +
                    "\n 3 : Xóa sinh viên trong danh sách theo id sinh viên" +
                    "\n 4 : Xóa sinh viên theo số tự" +
                    "\n 5 : Tìm kiếm sinh viên trong danh sách" +
                    "\n 6 : Sắp xếp danh sách sinh viên" +
                    "\n 7 : Exit");
            System.out.print("Mời lựa chọn: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    System.out.println("Danh sách sinh viên ");
                    studentList = studentService.printAll();
                    for (Student student : studentList) {
                        System.out.println(student);
                    }
                    break;
                case 2:
                    studentService.addStudent();
                    break;
                case 3:

                    studentService.removeidStudent();
                    break;
                case 4:

                    studentService.removeP();
                    break;
                case 5:

                    System.out.println(studentService.searchStudent());
                    break;
                case 6:
                    studentService.sort();
                    break;
                case 7:
                    System.out.println("Cám ơn đã sử dụng chương trình của chúng tôi");
            }

        } while (select != 7);
    }
}
