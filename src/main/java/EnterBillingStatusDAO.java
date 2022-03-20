import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EnterBillingStatusDAO {
	public static String LoginValidationUser() throws Exception {
		// Step 1 : Database Driver ( Optional)
		
		PreparedStatement statement = null;
		ResultSet rs = null;
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2: Get the Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
				"rev_user", "rev_user");
		System.out.println(connection);
		String sql = "update electricity_billing_details set billing_status =? where customer_id = ?";
		statement = connection.prepareStatement(sql);
		
		// 3.execute query
		int rows = statement.executeUpdate();
	  
	return sql;

	}

}
