package electricityBillapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import Exception.DBException;

import electricityBillapp.ElectricityBillingappRegistration.ElectricityBilling;
public class ElectricityBillingDAO {

public static void addUser(ElectricityBilling users) throws DBException{
	Connection connection=null;
	Statement statement=null;

	try {	//Step 1 : Database Driver ( Optional)
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2: Get the Connection
		connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		System.out.println(connection);
		
		
		String query = "INSERT INTO electricity_registration_details (customer_id,customer_name,email_id,phone_no,address,password) VALUES(?,?,?,?,?,?)" ;
		System.out.println(query);
		
		statement = connection.createStatement( );
		
		int rows = statement.executeUpdate(query);
		System.out.println("No of rows inserted:" + rows);
		
		connection.close();
		
	}
	catch(Exception e) {
		System.out.println(e);
	}
}

    public static void loginUser(ElectricityBilling users2) throws DBException{
        
		try {
             
            //Step 1 : Database Driver ( Optional)
           Class.forName("com.mysql.cj.jdbc.Driver");
           
           //Step 2: Get the Connection
           Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
           System.out.println(connection);
           Statement mystatement = connection.createStatement();
           
   
           
           
            ResultSet regquery=mystatement.executeQuery("select * from electricity_registration_details where email_id ='"+users2.emailID+"' and password ='"+users2.password+"'and customer_id ='"+users2.customerId+"';");
            while(regquery.next())
            {
                System.out.println(regquery.getString("costomer_id")+"  "+regquery.getString("customer_name")+"			"+regquery.getString("email_id")+"			"+regquery.getString("phone_no")+"			"+regquery.getString("address"));  
                connection.close();
            }
         
            }   
            catch (Exception e)
            {
               System.out.println(e);
            }

    }

    public static void allUser() throws DBException{
        try {
             
            //Step 1 : Database Driver ( Optional)
           Class.forName("com.mysql.cj.jdbc.Driver");
           
           //Step 2: Get the Connection
           Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
           System.out.println(connection);
           Statement mystatement = connection.createStatement();
   
            ResultSet regquery=mystatement.executeQuery("select * from electricity_registration_details;");
            while(regquery.next())
            {
                System.out.println(regquery.getString("user_id")+"  "+regquery.getString("name")+"			"+regquery.getString("email_id")+"			"+regquery.getString("password")+"			"+regquery.getString("customerId"));  
                connection.close();
            }
         
            }   
            catch (Exception e)
            {
               System.out.println(e);
            }
        
        
    }
 public static void billing(ElectricityBilling users2) throws DBException{
        
		try {
             
            //Step 1 : Database Driver ( Optional)
           Class.forName("com.mysql.cj.jdbc.Driver");
           
           //Step 2: Get the Connection
           Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
           System.out.println(connection);
           Statement mystatement1 = connection.createStatement();
           
   
          ResultSet query1 = mystatement1.executeQuery("select customer_name  from electricity_registration_details Right join electricity_billing_details on electricity_registration_details.customer_name=electricity_billing_details.customer_name where consumer_Id=user2.customer");
   		System.out.println(query1);
   		while(query1.next())
        {
            System.out.println(query1.getString("user_id")+"  "+query1.getString("name")+"			"+query1.getString("email_id")+"			"+query1.getString("password")+"			"+query1.getString("customerId"));  
            connection.close();
        }
   		
            
         
            }   
         catch (Exception e)
            {
               System.out.println(e);
            }


    

    

        
}



}