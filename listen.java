package com.example.web;
import javax.servlet.*;

public class listen implements ServletContextListener{
  
  public void contextInitialized(ServletContextEvent event){
    
    ServletContext sc = event.getServletContext();
    String linkreport = sc.getInitParameter("adress");
    sc.setAttribute("adress", linkreport);
    }

   public void contextDestroyed(ServletContextEvent event){}
}