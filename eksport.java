package com.example.model;
import java.io.*;
import java.net.*;
import java.util.*;

public class eksport{

  public String conve(String a, String b, String c ){
  String apot = new String();
try{
  
    URL convert = new URL("http://www.google.com/ig/calculator?hl=en&q="+a+b+"=?"+c);
    BufferedReader in = new BufferedReader(new InputStreamReader(convert.openStream()));		//http://www.exchangerate-api.com/java#ex1
    String apotel = in.readLine();  
    in.close();
    int len = apotel.length();
    int i=0;
    while(apotel.charAt(i)!=','){i++;}
    int k;
    for(k=i+7;apotel.charAt(k)!='"';k++){
    apot = apot+apotel.charAt(k);
      }

    
}

  
  
catch (MalformedURLException mue) {
System.exit(1);
}
catch (IOException ioe) {
System.exit(1);
}
return apot;
}
}


