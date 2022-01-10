package thi_thu.controller;


import thi_thu.service.StudentService;
import thi_thu.service.TeacherService;
import thi_thu.service.impl.StudentImpl;
import thi_thu.service.impl.TeacherImpl;

import java.util.Scanner;

public class QuanLySinhVien {
    public static void main(String[] args) {
        TeacherService teacherService = new TeacherImpl();
        StudentService studentService = new StudentImpl();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("1.Teacher");
            System.out.println("2.Students");
            System.out.println("3.Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            int choose1;
            int choose2;
            switch (choose){
                case 1:
                    do {
                        System.out.println("1\tAdd new teacher\n" +
                                "2\tDelete teacher\n" +
                                "3\tDisplay list teacher\n" +
                                "4\tSearch teacher\n" +
                                "5\tReturn main menu\n");
                        choose1 = Integer.parseInt(scanner.nextLine());
                        switch (choose1) {
                            case 1:
                                teacherService.addNew();
                                break;
                            case 2:
                                teacherService.delete();
                                break;
                            case 3:
                                teacherService.display();
                                break;
                            case 4:
                                teacherService.search();
                                break;
                        }
                    } while (choose1 != 5);
                    break;

                case 2:
                    do {
                        System.out.println("1\tAdd new student\n" +
                                "2\tDelete student\n" +
                                "3\tDisplay list student\n" +
                                "4\tSearch student\n" +
                                "5\tReturn main menu\n");
                        choose2 = Integer.parseInt(scanner.nextLine());
                        switch (choose2) {
                            case 1:
                                studentService.addNew();
                                break;
                            case 2:
                                studentService.delete();
                                break;
                            case 3:
                                studentService.display();
                                break;
                            case 4:
                                studentService.search();
                                break;
                        }
                    } while (choose2 != 5);
                    break;

                case 3:System.exit(0);
                break;
            }

        }while (true);
    }



}
