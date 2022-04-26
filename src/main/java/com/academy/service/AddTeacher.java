package com.academy.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.academy.entity.Subjects;
import com.academy.entity.Teacher;
import com.academy.util.HIbernateUtil;

@WebServlet("/AddTeacher")
public class AddTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AddTeacher() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String teachername = request.getParameter("teachername");

		int teacherexperience = Integer.parseInt(request.getParameter("teacherexperience"));
		
		Session session = HIbernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Teacher teacher= new Teacher(teachername,teacherexperience);
		
		session.save(teacher);
		
		session.getTransaction().commit();
		
		session.close();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Teacher Added</h1>");
		out.println("<a href='homepage.html'>Home</a>");
	}

}
