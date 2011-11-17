package com.example.web;
import com.example.model.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class converter extends HttpServlet {

public void doPost(HttpServletRequest request, HttpServletResponse response) 
  throws ServletException, IOException {
    String cash = request.getParameter("money");
    String syn1 = request.getParameter("nom1");
    String syn2 = request.getParameter("nom2");
    eksport count = new eksport();
    String result = count.conve(cash,syn1,syn2);

    request.setAttribute("styles", result);
    
    RequestDispatcher view = request.getRequestDispatcher("result.jsp");
    view.forward(request, response);
}
}