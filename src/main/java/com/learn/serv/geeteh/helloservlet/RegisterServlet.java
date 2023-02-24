package com.learn.serv.geeteh.helloservlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;

public class RegisterServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Executing Get Method.......");
        out.println("<h2>Welcome! To Register Servlet</h2?");
        String name = request.getParameter("user_name");
        String password = request.getParameter("user_password");
        String email = request.getParameter("user_email");
        String gender = request.getParameter("user_gender");
        String course = request.getParameter("user_course");

        String cond = request.getParameter("condition");
        if(cond != null){
            out.println("<h2>Name : " + name + "</h2>");
            out.println("<h2>Password : " + password + "</h2>");
            out.println("<h2>Email : " + email + "</h2>");
            out.println("<h2>Gender : " + gender + "</h2>");
            out.println("<h2>Course : " + course + "</h2>");
            printOnConsole(name,password,email,gender,course);

        }
        else{
            out.println("<h1>You have not checked the Terms & Conditions !!!</h1>");
            System.out.println("You have not checked the Terms & Conditions !!!");
        }

    }


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Welcome! To Register Servlet</h2?");
        String name = request.getParameter("user_name");
        String password = request.getParameter("user_password");
        String email = request.getParameter("user_email");
        String gender = request.getParameter("user_gender");
        String course = request.getParameter("user_course");

        String cond = request.getParameter("condition");
        if(cond != null){
            out.println("<h2>Name : " + name + "</h2>");
            out.println("<h2>Password : " + password + "</h2>");
            out.println("<h2>Email : " + email + "</h2>");
            out.println("<h2>Gender : " + gender + "</h2>");
            out.println("<h2>Course : " + course + "</h2>");
            printOnConsole(name,password,email,gender,course);

        }
        else{
            out.println("<h1>You have not checked the Terms & Conditions !!!</h1>");
            System.out.println("You have not checked the Terms & Conditions !!!");
        }

    }

    public void printOnConsole(String name, String password, String email, String gender, String course){
        System.out.println("name "+ name + "  ");
        System.out.println("password "+ password + "  ");
        System.out.println("email "+ email + "  ");
        System.out.println("gender "+ gender + "  ");
        System.out.println("course "+ course + "  ");
    }

    public void destroy() {
    }
}
