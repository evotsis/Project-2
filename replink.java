package com.example.web;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class replink extends HttpServlet {

public void doPost(HttpServletRequest request, HttpServletResponse response) 
  throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String uri = (String) getServletContext().getAttribute("adress");  
    response.sendRedirect(uri);
}
}