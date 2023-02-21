package com.learn.serv.geeteh.helloservlet;


import javax.servlet.*;
import java.io.IOException;


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
