package com.academy.service;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.academy.entity.ClassInformation;
import com.academy.entity.Students;
import com.academy.util.HIbernateUtil;


@WebServlet("/ClassReport")
public class ClassReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ClassReport() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    String classno= request.getParameter("classno");
		Session session = HIbernateUtil.getSessionFactory().openSession();
		
		
		ArrayList<ClassInformation> reports = (ArrayList<ClassInformation>) session.createQuery("from ClassInformation").list();
		
		request.setAttribute("report", reports);
		request.setAttribute("classno", classno);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ClassReport.jsp");
		
		
        ArrayList<Students> students = (ArrayList<Students>) session.createQuery("from Students").list();
		
		request.setAttribute("students", students);
		
		RequestDispatcher requestDispatcher1 = request.getRequestDispatcher("/ClassReport.jsp");
		requestDispatcher1.forward(request, response);
		requestDispatcher.forward(request, response);
		session.close();
		
		
	}

	

}
