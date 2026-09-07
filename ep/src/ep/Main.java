package ep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) throws SQLException{
		// step 2
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		// step 3
		String url = "jdbc:mysql://localhost:3306/parul";
		Connection conn = DriverManager.getConnection(url, "root", "ansh2712");
						
		// Statement st = conn.createStatement();
		// st.executeUpdate("Insert into Students values(2, 'ansu','u')");
					
		// step 4
		PreparedStatement st1 = conn.prepareStatement("select * from students");
						
		ResultSet set = st1.executeQuery();
				
		// step 5: Print out the results
		System.out.println("--- Student Names ---");
		while (set.next()) {
			System.out.println(set.getString("name"));
		}
		
		// Good practice: Close the connection resource
		conn.close();
	}
}
