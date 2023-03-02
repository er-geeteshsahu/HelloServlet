package com.learn.serv.geeteh.helloservlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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



        //get all the cookie
        boolean f = false;
        String name = "";
        Cookie[] Cookies = req.getCookies();
        if (Cookies==null)
        {
            out.println("<h1> You Have Not Entered Your Name Go To Home Page and Submit Your Name</h1>");
            return;
        }
        else
        {
            for (Cookie c: Cookies){
                String tname = c.getName();
                if (tname.equals("user_name"))
                {
                    f = true;
                    name = c.getValue();
                }
            }
        }

        if(f) {
            out.println("<h1> Hello, " + name + " ! Welcome Back !!! This is My Website Using Second Servlet......</h1>");
            out.println("<h1>Thank You !</h1> ");
        }
        else {
            out.println("<h1> You Have Not Entered Your Name Go To Home Page and Submit Your Name</h1>");
        }

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



        //get all the cookie
        boolean f = false;
        String name = "";
        Cookie[] Cookies = req.getCookies();
        if (Cookies==null)
        {
            out.println("<h1> You Have Not Entered Your Name Go To Home Page and Submit Your Name</h1>");
            return;
        }
        else
        {
            for (Cookie c: Cookies){
                String tname = c.getName();
                if (tname.equals("user_name"))
                {
                    f = true;
                    name = c.getValue();
                }
            }
        }

        if(f) {
            out.println("<h1> Hello, " + name + " ! Welcome Back !!! This is My Website Using Second Servlet......</h1>");
            out.println("<h1>Thank You !</h1> ");
        }
        else {
            out.println("<h1> You Have Not Entered Your Name Go To Home Page and Submit Your Name</h1>");
        }

        out.println("</body>");
        out.println("</html>");
    }
}
