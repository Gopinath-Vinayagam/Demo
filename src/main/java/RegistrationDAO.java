
	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

public class RegistrationDAO {
		public static void runquery(String query)throws Exception
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
			//System.out.println(connection);
			//System.out.println(query);
			java.sql.Statement statement=connection.createStatement();
			int rows=statement.executeUpdate(query);
			connection.close();
			}
			public static void insertUser(UserRegistration obj) throws Exception
			{
			String query1="insert into electricity_registration_details(customerNo,Name,user_Name,user_MobileNumber,user_Age,user_Class,user_EmailId,user_Password)values('"+ obj.customerNo+"','"+ obj.Name+"','" +obj.userName+"','"+obj.userMobileNumber +"','"+obj.userAge +"','"+obj.userAddress +"''"+obj.userClass +"','"+obj.userEmailId +"','"+obj.userPassword +"')";
			runquery(query1);
		}
}
	


