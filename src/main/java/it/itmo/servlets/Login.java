package it.itmo.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Login extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {


        System.out.println(req.getSession().getAttribute("token"));

        req.setAttribute("token", req.getSession().getAttribute("token"));

        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }
}
