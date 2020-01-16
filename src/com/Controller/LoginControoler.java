package com.Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Bean.Bean;
import com.Dao.Dao;

@WebServlet("/LoginControoler")
public class LoginControoler extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Bean bean=null;
		try {
		String	name=request.getParameter("name");
		String	password=request.getParameter("password");
		 bean=new Bean();
		 bean.setName(name);
		 bean.setPassword(password);
		Dao dao=new Dao();
		bean=dao.checkLoginUser(bean);
		if(bean!=null) {
		   HttpSession session= request.getSession();
		   session.setAttribute("Bean",bean);
		   request.getRequestDispatcher("Home.jsp").forward(request, response);
		}
		
		else {
			request.setAttribute("error", "usename password not match");
			 request.getRequestDispatcher("Login.jsp").include(request, response);;
		}
	} catch (Exception e) {
		e.printStackTrace();
	} 
	}
}	