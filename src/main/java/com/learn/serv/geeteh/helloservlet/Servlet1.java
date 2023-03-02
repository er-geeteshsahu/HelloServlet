package com.learn.serv.geeteh.helloservlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title> Servlet Servlet1 </title>");
        out.println("</head");
        out.println("<body>");

        //stateles session
        String name = req.getParameter("name");
        out.println("<h1> Hello, " + name + " ! Welcome  !!! This is My Website Using Second Servlet......</h1>");
        out.println("<h1><a href='servlet2'>Go To Servlet2</a></h1> ");

        //cookie
        Cookie c = new Cookie("user_name", name);
        resp.addCookie(c);

        out.println("</body>");
        out.println("</html>");
    }
}
