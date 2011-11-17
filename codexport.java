package com.example.web;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class codexport extends HttpServlet {

public void doPost(HttpServletRequest request, HttpServletResponse response) 
  throws ServletException, IOException {
    response.setContentType("application/jar");
    ServletContext ctx = getServletContext();
    InputStream is = ctx.getResourceAsStream("/coding.zip"); 
    int read = 0;
    byte[] bytes = new byte[1024];
    OutputStream os = response.getOutputStream();
    while ((read = is.read(bytes)) != -1){
      os.write(bytes, 0, read);
    }
    os.flush();
    os.close();
}
}