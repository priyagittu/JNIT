package jdbcProgram;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class JdbcPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		//String url="jdbc:mysql://localhost:3306/hospital";
		//String username="root@localhost";
		//String password="Ranjit@21";
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?user=root&password=Ranjit@21");
		if(connection!=null)
			System.out.println("Connection established");
		PreparedStatement ps= connection.prepareStatement("insert into doctor values (?,?,?,?,?,?)");
		ps.setInt(1,3003);
		ps.setString(2,"ramesh");
		ps.setString(3,"physician");
		ps.setInt(4,23415673);
		ps.setString(5,"mumbai");
		ps.setString(6,"mumbai");
		
		
		ps.setInt(1,3004);
		ps.setString(2,"radha");
		ps.setString(3,"physician");
		ps.setInt(4,23415634);
		ps.setString(5,"mumbai");
		ps.setString(6,"mumbai");
		
		ps.setInt(1,3005);
		ps.setString(2,"rani");
		ps.setString(3,"neuto");
		ps.setInt(4,23415456);
		ps.setString(5,"hyd");
		ps.setString(6,"mumbai");
		
		int x=ps.executeUpdate();
		if (x!=0)
		System.out.println("record inserted");	
	}
}
