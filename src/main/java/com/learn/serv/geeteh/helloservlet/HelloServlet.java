package com.learn.serv.geeteh.helloservlet;


import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.zip.DataFormatException;


public class HelloServlet implements Servlet {
    ServletConfig conf;

    public void init(ServletConfig conf){
        this.conf = conf;
        System.out.println("Init method is exicuted............");
    }

    @Override
    public ServletConfig getServletConfig() {
        return conf;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("The service is being processed ................");
        servletResponse.setContentType("text/html");
        PrintWriter out = servletResponse.getWriter();
        out.println("<h1>This is my output from servlet method;,<h2> Todays date is Tue :: "+new Date());

    }

    @Override
    public String getServletInfo() {
        return ("This program is created by Geetesh Kumar");
    }

    @Override
    public void destroy() {
        System.out.println("this servlet is gonna destroy ............. BYE!!");

    }


}
