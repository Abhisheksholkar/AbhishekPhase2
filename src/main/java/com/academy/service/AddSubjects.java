package com.academy.service;

import java.awt.print.Book;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.academy.entity.*;
import com.academy.util.HIbernateUtil;;


@WebServlet("/AddSubjects")
public class AddSubjects extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String subjectname = request.getParameter("subjectname");
		String subjectlevel = request.getParameter("subjectlevel");
		int subjectmaxmarks = Integer.parseInt(request.getParameter("subjectmaxmarks"));
		
		Session session = HIbernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Subjects subjects= new Subjects(subjectname,subjectlevel,subjectmaxmarks);
		
		session.save(subjects);
		
		session.getTransaction().commit();
		
		session.close();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>subject Added</h1>");
		out.println("<a href='homepage.html'>Home</a>");
		
	}


}
