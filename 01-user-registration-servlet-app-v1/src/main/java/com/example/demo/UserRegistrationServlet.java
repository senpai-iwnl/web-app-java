package com.example.demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.User;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "register", value = "/register")
public class UserRegistrationServlet extends HttpServlet {
    private String message;
    private List<User> users = new ArrayList<>();

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        User user = new User(
                request.getParameter("firstName"),
                request.getParameter("lastName"),
                Integer.parseInt(request.getParameter("age"))
        );

        if(request.getParameterValues("hobby") != null){
            for (String hobby : request.getParameterValues("hobby")){
                user.addHobby(hobby);
            }
        }

        users.add(user);

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html><head>");
        out.println("<link rel='stylesheet' type='text/css' href='css/style.css'>");
        out.println("<div class='container'>");
        for (User displayUser : users){
            out.println("<div class='user-container'>");
            out.println("<div class='field-container'><strong>First name: </strong>" + displayUser.getFirstName() + "</div>");
            out.println("<div class='field-container'><strong>Last name: </strong>" + displayUser.getLastName() + "</div>");
            out.println("<div class='field-container'><strong>Age: </strong>" + displayUser.getAge() + "</div>");
            if(displayUser.getHobbies() != null)
                out.println("<div class='field-container'><strong>Hobbies: </strong>" + displayUser.getHobbies() + "</div>");
            out.println("</div>");
        }
        out.println("</div></body></html>");
    }


    public void destroy() {
    }
}