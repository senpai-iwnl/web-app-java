package com.example.demo;

import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent se) {
        // Możesz tu dodać logikę, która wykonuje się przy tworzeniu sesji.
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        // Możesz tu dodać logikę, która wykonuje się przy niszczeniu sesji.
    }
}
