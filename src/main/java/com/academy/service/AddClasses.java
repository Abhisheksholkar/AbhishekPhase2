package com.academy.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.academy.entity.Classes;
import com.academy.entity.Subjects;
import com.academy.util.HIbernateUtil;

@WebServlet("/AddClasses")
public class AddClasses extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddClasses() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int classnumber = Integer.parseInt(request.getParameter("classnumber"));
	
		int classcapacity = Integer.parseInt(request.getParameter("classcapacity"));
		
		Session session = HIbernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Classes classes= new Classes(classnumber,classcapacity);
		
		session.save(classes);
		
		session.getTransaction().commit();
		
		session.close();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>class Added</h1>");
		out.println("<a href='homepage.html'>Home</a>");
		
	}

}
