package bai_thi.service;

import bai_thi.until.NotFoundBankAccountException;

public interface Service {
    void addNew();
    void delete();
    void display();
    void search() throws NotFoundBankAccountException;
}
