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

@WebServlet("/phone/q")
public class PhoneSearch extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String condition = req.getParameter("condition");

        PhoneDAO phoneDAO = new PhoneInDao();
        List<Phone> phones = phoneDAO.getPhoneByName(condition);

        req.setAttribute("phone", phones);

        req.getSession().setAttribute("msg", "当前查询条件为:[" + condition + "]");

        req.getRequestDispatcher("/jsp/phone_list.jsp").include(req, resp);
    }
}
