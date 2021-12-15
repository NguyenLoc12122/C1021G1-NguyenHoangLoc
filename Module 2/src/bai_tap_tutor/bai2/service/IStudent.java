package bai_tap_tutor.bai2.service;

import bai_tap_tutor.bai2.model.Student;

public interface IStudent {
    void addStudent();
    void removeidStudent();
    void removeP();
    Student searchStudent();
    Student[] printAll();
    void sort();
}
