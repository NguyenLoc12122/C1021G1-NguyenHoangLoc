package thi_thu.service.impl;

import thi_thu.model.Student;

import thi_thu.service.StudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentImpl implements StudentService {
    public List<Student> studentList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Student student : studentList){
            System.out.println(student);
        }

    }

    @Override
    public void addNew() {
        System.out.println("nhap id");
        int id = scanner.nextInt();
        System.out.println("nhap ten");
        String name = scanner.nextLine();
        System.out.println("nhap ngay sinh");
        String date = scanner.nextLine();
        System.out.println("nhap gioi tinh");
        System.out.println("1. Nam.");
        System.out.println("2. Nữ");
        String gender = "";
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                gender = "Nam";
                break;
            case 2:
                gender = "Nữ";
                break;

        }
    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {
        System.out.println("nhap ten can tim");
        String name=scanner.nextLine();
        ArrayList<Student> arrayList = new ArrayList<>();
        for (int i=0; i<studentList.size();i++){
            if(studentList.get(i).getName().toLowerCase().contains(name.toLowerCase())){
                arrayList.add(studentList.get(i));
            }
        }
        if(arrayList.size()==0){
            System.out.println("khong co ten nay");
        }else{
            for(Student student : arrayList){
                System.out.println(student);
            }
        }

    }


}
