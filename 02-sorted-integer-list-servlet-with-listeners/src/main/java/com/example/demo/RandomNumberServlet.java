package com.example.demo;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@WebServlet("/randomNumber")
public class RandomNumberServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletContext();
        List<Integer> numbers = (List<Integer>) context.getAttribute("numbers");

        if (numbers == null) {
            numbers = new ArrayList<>();
        }

        Random rand = new Random();
        int newNumber = rand.nextInt(100);
        numbers.add(newNumber);
        Collections.sort(numbers);

        context.setAttribute("numbers", numbers);
        
        response.sendRedirect("index.jsp");
    }

}
