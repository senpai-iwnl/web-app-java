package com.example.demo;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import java.util.ArrayList;
import java.util.List;

@WebListener
public class MyServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Kontekst aplikacji został zainicjalizowany.");
        List<Integer> numberList = new ArrayList<>();
        ServletContext context = sce.getServletContext();
        context.setAttribute("numbers", numberList);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Kontekst aplikacji jest niszczony.");
        sce.getServletContext().removeAttribute("numbers");
    }
}