package com.nf.phone.web;


import com.nf.phone.dao.PhoneDAO;
import com.nf.phone.dao.PhoneInDao;
import com.nf.phone.entity.Phone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(value = "/phone/add")
public class PhoneAdd extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // req.getRequestDispatcher("/jsp/phone_add.jsp").forward(req, resp);
        resp.sendRedirect("/jsp/phone_add.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        int id = Integer.parseInt(req.getParameter("id"));
        String brand = req.getParameter("brand");
        String name = req.getParameter("name");
        float price = Float.parseFloat(req.getParameter("price"));
        String sc = req.getParameter("sc");

        Phone phone = new Phone(id,brand, name, price, sc);

        PhoneDAO phoneDAO = new PhoneInDao();
        phoneDAO.add(phone);
        resp.sendRedirect("/phone/index");
    }
}
