package org.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        HttpSession session = req.getSession();
        String sessionUsername = (String)session.getAttribute("user");
        String sessionPassword = (String)session.getAttribute("pass");

        if (username.equals(sessionUsername) && password.equals(sessionPassword)) {
            session.setAttribute("username", username);
            req.getRequestDispatcher("welcome.jsp").forward(req, res);
        } else {
            req.setAttribute("error", "Invalid username or password");
            req.getRequestDispatcher("login.jsp").forward(req, res);
        }
    }
}
