package com.academy.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.academy.entity.ClassInformation;
import com.academy.entity.Classes;
import com.academy.util.HIbernateUtil;

@WebServlet("/ClassInf")
public class ClassInf extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ClassInf() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String classnumber = request.getParameter("classnumber");
		String teacher = request.getParameter("teacher");
		String subject = request.getParameter("subject");
		Session session = HIbernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
	ClassInformation classinformation = new ClassInformation(classnumber,teacher,subject);
		
		session.save(classinformation);
		
		session.getTransaction().commit();
		
		session.close();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>class assigned</h1>");
		out.println("<a href='homepage.html'>Home</a>");
	}

}
