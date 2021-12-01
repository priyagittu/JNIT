package employee;

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

public class EmployeeRegister extends HttpServlet {
	
	
	Connection con=null;
	PreparedStatement ps=null;
	public EmployeeRegister() {

	}
	public void init(ServletConfig config) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
		   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDetait?user=root&password=Ranjit@21");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//String doctor_id=request.getParameter("doctor_id");
		int  employee_id=Integer.parseInt(request.getParameter("employee_id"));
		String employee_name=request.getParameter("employee_name");
		int employee_age=Integer.parseInt(request.getParameter("employee_age"));
		int employee_salary =Integer.parseInt(request.getParameter("employee_salary"));
		int employee_phone=Integer.parseInt(request.getParameter("employee_phone"));
		String  employee_location=request.getParameter("employee_location");
		PrintWriter pw=response.getWriter();
		try {
			ps=con.prepareStatement("insert into employee values(?,?,?,?,?,?)");
			ps.setInt(1,employee_id);
			ps.setString(2,employee_name);
			ps.setInt(3,employee_age);
			ps.setInt(4,employee_salary );
			ps.setInt(5,employee_phone );
			ps.setString(6,employee_location);
		int x=ps.executeUpdate();
			if(x!=0)
				pw.println("<html><body bgcolor='red'><h1> Registered successful</h1></body></html>");

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}

	


