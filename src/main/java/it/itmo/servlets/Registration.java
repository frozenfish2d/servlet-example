package it.itmo.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Registration extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.getRequestDispatcher("servlet_registration.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String bd = req.getParameter("bd");

        req.getSession().setAttribute("token", "Y");

        System.out.println(login);
        System.out.println(password);
        System.out.println(email);
        System.out.println(bd);

        req.getRequestDispatcher("servlet_registration.jsp").forward(req, resp);
    }
}
