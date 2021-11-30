package jdbcProgram;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JdbcPreparedStatementUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?user=root&password=Ranjit@21");
		if(connection!=null)
			System.out.println("Connection established");
		PreparedStatement ps=connection.prepareStatement("update doctor set city =? where  doctor_id=?");
		ps.setString(1,"pune");
		ps.setInt(2,1);
		int x=ps.executeUpdate();
		if (x!=0)
		System.out.println("record updated");
		
		
		
		
}
}