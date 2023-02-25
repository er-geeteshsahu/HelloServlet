package com.learn.serv.geeteh.helloservlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class s1 extends HttpServlet {


    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<body>");

        String n1 = req.getParameter("n1");
        String n2 = req.getParameter("n2");

        int nn1 = Integer.parseInt(n1);
        int nn2 = Integer.parseInt(n2);

        int s = nn1+nn2;

        req.setAttribute("sum", s);

        RequestDispatcher rd = req.getRequestDispatcher("s2");
        rd.forward(req, resp);

        out.println("</body>");
        out.println("</html>");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
