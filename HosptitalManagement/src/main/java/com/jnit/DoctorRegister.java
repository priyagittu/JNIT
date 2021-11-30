package com.jnit;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("/DoctorRegister")
public class DoctorRegister extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Connection con=null;
	PreparedStatement ps=null;
	public DoctorRegister() {

	}
	public void init(ServletConfig config) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
		   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?user=root&password=Ranjit@21");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//String doctor_id=request.getParameter("doctor_id");
		int  doctor_id=Integer.parseInt(request.getParameter("doctor_id"));
		String doctor_name=request.getParameter("doctor_name");
		String doctor_password=request.getParameter("doctor_password");
		String doctor_specialization=request.getParameter("doctor_specialization");
		int doctor_phone=Integer.parseInt(request.getParameter("doctor_phone"));
		String city=request.getParameter("city");
		PrintWriter pw=response.getWriter();
		try {
			ps=con.prepareStatement("insert into doctor values(?,?,?,?,?,?)");
			ps.setInt(1,doctor_id);
			ps.setString(2,doctor_name);
			ps.setString(3,doctor_specialization);
			ps.setInt(4,doctor_phone );
			ps.setString(5,city );
			ps.setString(6,doctor_password);
			int x=ps.executeUpdate();
			if(x!=0)
				pw.println("<html><body bgcolor='wheat'><h1> Registered successful</h1></body></html>");

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
