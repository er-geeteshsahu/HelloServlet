package com.learn.serv.geeteh.helloservlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title> Servlet Servlet2 </title>");
        out.println("</head");
        out.println("<body>");
        String name = req.getParameter("name");
        out.println("<h1> Hello, " + name + " ! Welcome Back !!! This is My Website Using Second Servlet......</h1>");
        out.println("<h1>Thank You !</h1> ");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title> Servlet Servlet2 </title>");
        out.println("</head");
        out.println("<body>");
        String name = req.getParameter("name");
        out.println("<h1> Hello, " + name + " ! Welcome Back !!! This is My Website Using Second Servlet......</h1>");
        out.println("<h1>Thank You !</h1> ");
        out.println("</body>");
        out.println("</html>");
    }
}
