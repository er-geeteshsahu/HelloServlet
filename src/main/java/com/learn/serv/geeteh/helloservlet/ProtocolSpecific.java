package com.learn.serv.geeteh.helloservlet;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class ProtocolSpecific extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("this is Http Servlet Protocol running.........");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.print("<h1></h1>");
        out.println("This is Http Servlet & Protocol Specific");
        out.print(new Date());
        out.println("/<h1>");
    }
}
