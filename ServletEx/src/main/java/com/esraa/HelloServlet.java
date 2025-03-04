package com.esraa;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {

        res.setContentType("text/html");

        PrintWriter out=res.getWriter();

        out.println("<h1><b>Hello Servlet</b></h1>");
    }

}
