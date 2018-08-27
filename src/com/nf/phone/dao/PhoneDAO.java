package com.nf.phone.dao;

import com.nf.phone.entity.Phone;

import java.util.List;

public interface PhoneDAO {
    List<Phone> listAll();
    Phone getPhoneById(int id);
    List<Phone> getPhoneByName(String name);
    boolean update(Phone phone);
    boolean delete(int id);
    Phone add(Phone phone);
}
