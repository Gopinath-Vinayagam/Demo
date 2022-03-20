import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RegisteredUserDetailsDAO{
	public static void LoginValidationUser() throws Exception {
	// Step 1 : Database Driver ( Optional)
	Class.forName("com.mysql.cj.jdbc.Driver");

	// Step 2: Get the Connection
	Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
			"rev_user", "rev_user");
	System.out.println(connection);
	String query = "SELECT *FROM electricity_registration_details ;";
	Statement statement = connection.createStatement();
	int rows = statement.executeUpdate(query);
	

}

{

	
	
	
	
	
}}
