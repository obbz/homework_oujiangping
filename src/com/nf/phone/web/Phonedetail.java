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

@WebServlet(value = "/phone/detail")
public class Phonedetail extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        PhoneDAO phoneDAO = new PhoneInDao();

        req.getSession().setAttribute("aaa", "222");

        req.getSession().getAttribute("aaa");

        Phone phone = phoneDAO.getPhoneById(id);
        req.setAttribute("Phone", phone);
       req.getRequestDispatcher("/jsp/phone_detail.jsp").forward(req, resp);

       // resp.sendRedirect("jsp/phone_detail.jsp");
    }
}
