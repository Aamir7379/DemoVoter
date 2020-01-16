package com.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.Bean;
import com.Dao.Dao;

@WebServlet("/Controller")
public class Controller extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String password=request.getParameter("password");
		String confirm_password=request.getParameter("Confirm Password");
		Bean bean=new Bean();
		bean.setName(name);
		bean.setEmail(email);
		bean.setMobile(mobile);
		bean.setPassword(password);
		bean.setConfirm_password(confirm_password);
		
		Dao dao=new Dao();
		int ins=dao.Insert(bean);
		if(ins>0) {
			request.getRequestDispatcher("Login.jsp").forward(request,response);
	}

}
	}
	
