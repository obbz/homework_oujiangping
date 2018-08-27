package com.nf.phone.web;


import com.nf.phone.dao.PhoneDAO;
import com.nf.phone.dao.PhoneInDao;
import com.nf.phone.entity.Phone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class PhoneList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PhoneDAO dao = new PhoneInDao();
        List<Phone> phones = dao.listAll();
        req.setAttribute("phones",phones);
        req.getRequestDispatcher("/jsp/phone_list.jsp").forward(req,resp);
    }
}
