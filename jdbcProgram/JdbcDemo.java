package jdbcProgram;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcDemo {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
				Class.forName("com.mysql.jdbc.Driver");
				//String url="jdbc:mysql://localhost:3306/hospital";
				//String username="root@localhost";
				//String password="Ranjit@21";
				
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?user=root&password=Ranjit@21");
				if(connection!=null)
					System.out.println("Connection established");
				Statement st= connection.createStatement();
				//int x=st.executeUpdate("update doctor set doctor_name='john',doctor_specialization='dentist'where  doctor_id in(1,1003)");
				//if (x!=0)
				//System.out.println("record updated");
				ResultSet rs=st.executeQuery("select * from doctor");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" " +rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
				}
			}

		}

	

