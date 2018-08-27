package com.nf.phone.dao;

import com.nf.phone.entity.Phone;

import java.util.ArrayList;
import java.util.List;

public class PhoneInDao implements PhoneDAO {
    private static List<Phone> phoneDB = new ArrayList<>();

    static {
        Phone p1 = new Phone(1, "OnePuss", "OnePuss 5T", 2999.00f, "8+64GB");
        Phone p2 = new Phone(2, "OnePuss", "OnePuss 5T", 3499.00f, "8+128GB");
        Phone p3 = new Phone(3, "OnePuss", "OnePuss 6", 3599.00f, "8+128GB");
        Phone p4 = new Phone(4, "努比亚", "z17 minis", 1299.00f, "6+64GB");
        Phone p5 = new Phone(5, "努比亚", "z18 mini", 1799.00f, "6+64GB");
        Phone p6 = new Phone(6, "三星", "Note 9", 6999.00f, "6+128GB");
        Phone p7 = new Phone(7, "三星", "S9", 6699.00f, "6+64GB");

        phoneDB.add(p1);
        phoneDB.add(p2);
        phoneDB.add(p3);
        phoneDB.add(p4);
        phoneDB.add(p5);
        phoneDB.add(p6);
        phoneDB.add(p7);

    }

    @Override
    public List<Phone> listAll() {
        return phoneDB;
    }

    @Override
    public Phone getPhoneById(int id) {
        for (Phone phone : phoneDB) {
            if (phone.getId() == id) {
                return phone;
            }
        }
        return null;
    }

    @Override
    public List<Phone> getPhoneByName(String name) {
        ArrayList<Phone> phones = new ArrayList<>();
        for (Phone phone : phoneDB) {
            String realname = phone.getName().toLowerCase();
            if (realname.contains(name.toLowerCase())) {
                phones.add(phone);
            }
        }
        return phones;
    }

    @Override
    public boolean update(Phone phone) {
        for (Phone phoneNew : phoneDB) {
            if (phoneNew.getId() == phone.getId()) {
                phoneNew.setBrand(phone.getBrand());
                phoneNew.setName(phone.getName());
                phoneNew.setPrice(phone.getPrice());
                phoneNew.setSc(phone.getSc());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        for (Phone phone : phoneDB) {
            if (phone.getId() == id) {
                return phoneDB.remove(phone);
            }
        }
        return false;
    }

    @Override
    public Phone add(Phone phone) {
        if (phoneDB.add(phone)) {
            return phone;
        }
        return null;
    }
}