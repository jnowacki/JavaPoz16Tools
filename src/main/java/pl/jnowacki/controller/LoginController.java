package pl.jnowacki.controller;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("username");
        String password = req.getParameter("password");

        if (StringUtils.isNotEmpty(userName.trim()) && StringUtils.isNotEmpty(password.trim())){
            req.getSession().setAttribute("username", userName);
            resp.sendRedirect(getServletContext().getContextPath());
        } else {

            getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }
}
