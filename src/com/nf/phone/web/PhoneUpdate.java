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

@WebServlet("/phone/update")
public class PhoneUpdate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        PhoneDAO phoneDAO = new PhoneInDao();
        Phone phone = phoneDAO.getPhoneById(id);
        req.setAttribute("phone", phone);
        req.getRequestDispatcher("/jsp/phone_update.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        int id = Integer.parseInt(req.getParameter("id"));
        String brand = req.getParameter("brand");
        String name = req.getParameter("name");
        float price = Float.parseFloat(req.getParameter("price"));
        String sc = req.getParameter("sc");

        System.out.println(id);
        Phone phone = new Phone(id,brand, name, price,sc);
        PhoneDAO phoneDAO = new PhoneInDao();
        phoneDAO.update(phone);



        HttpSession session = req.getSession();
        session.setAttribute("msg", "更新成功！");
        resp.sendRedirect("/phone/detail?id=" + id);
    }

}
