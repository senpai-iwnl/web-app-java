package com.example.demo;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppContextListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        ServletContext sc = sce.getServletContext();
        List<Integer> numberList = Collections.synchronizedList(new ArrayList<>());
        sc.setAttribute("numberList", numberList);
    }

    public void contextDestroyed(ServletContextEvent sce) {
    }
}
