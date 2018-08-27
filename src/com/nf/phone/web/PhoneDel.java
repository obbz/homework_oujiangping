package com.nf.phone.web;

import com.nf.phone.dao.PhoneDAO;
import com.nf.phone.dao.PhoneInDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/phone/del")
public class PhoneDel extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        PhoneInDao dao = new PhoneInDao();
        String msg = null;
        if(dao.delete(id)){
            msg = "delete sussecc";
        }else {
            msg = "delete failure";
        }
        req.getSession().setAttribute("msg",msg);
        resp.sendRedirect("/phone/index");
        }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] ids = req.getParameterValues("id");
        PhoneInDao dao = new PhoneInDao();
        // 组织成一次数据库操作，一切为了效率
        for (String id : ids) {
            dao.delete(Integer.parseInt(id));
        }

        req.getSession().setAttribute("msg", "删除成功。");

        // req.getRequestDispatcher("/index").forward(req,resp);
        resp.sendRedirect("/phone/index");
    }
}
