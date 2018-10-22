package com.buutcamp.configuration.web;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println("Session created!");
        httpSessionEvent.getSession().setMaxInactiveInterval(5);
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("Session destroyed!");
    }
}
