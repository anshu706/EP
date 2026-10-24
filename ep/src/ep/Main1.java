package ep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main1 {

	public static void main(String[] args) throws SQLException{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (Exception ex){
			System.out.println(ex.getMessage());
		}

		String url = "jdbc:mysql://localhost:3306/parul";
		Connection con = DriverManager.getConnection(url, "root", "ansh2712");
		
		Statement st = con.createStatement();
		st.executeUpdate("Insert into student1 values(4,'Vidhi','bangalore')");
		
		// Prepared Statement
		PreparedStatement st1 = con.prepareStatement("select * from student1");
		
		ResultSet set = st1.executeQuery();
		
		con.close();
	}

}
