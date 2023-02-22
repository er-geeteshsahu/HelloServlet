package com.learn.serv.geeteh.helloservlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class SecondServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("this is the generic servlet....");
        servletResponse.setContentType("text/html");
        PrintWriter out=servletResponse.getWriter();
        out.println("<h1>tis is the second servlet.....");
        out.println(new Date());
    }
}
