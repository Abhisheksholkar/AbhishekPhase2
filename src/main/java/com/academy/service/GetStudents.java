package com.academy.service;

import java.io.IOException;
import java.util.ArrayList;

import com.academy.entity.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.academy.util.HIbernateUtil;

import antlr.collections.List;


@WebServlet("/GetStudents")
public class GetStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public GetStudents() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
		Session session = HIbernateUtil.getSessionFactory().openSession();
		
		
		ArrayList<Students> students = (ArrayList<Students>) session.createQuery("from Students").list();
		
		request.setAttribute("students", students);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/viewstudent.jsp");
		requestDispatcher.forward(request, response);
		
		
		session.close();
	}

	

}
