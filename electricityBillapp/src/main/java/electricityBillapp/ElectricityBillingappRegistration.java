package electricityBillapp;
import java.util.Scanner;
import java.sql.Timestamp;
import java.sql.Date;
public class ElectricityBillingappRegistration {

	

	public static  class ElectricityBilling {

		 String customerId;
	     String phoneNo;
	     String regdate;
	     String address;
	     String name;
	     String emailID;
	     String password;
		 String username;
		
	   
	    

	    public ElectricityBilling(String customerId,String name,String emailID,String phoneNo,String address,String regdate,String password){
	        this.name = customerId;
	        this.emailID = phoneNo;
	        this.regdate = regdate;
	        this.address = address;
	        this.name = name;
	        this.emailID = emailID;
	        this.password = password;
	      
	    }

	    public ElectricityBilling(String customerId, String username, String emailID, String phoneNo, String address, String password) {
	        this.emailID = emailID;
	        this.password = password;
	    }

	    public ElectricityBilling(String userEmail, String userPassword) {
			// TODO Auto-generated constructor stub
		}

		public ElectricityBilling(String userEmail, String userPassword, String usercustomerid) {
			// TODO Auto-generated constructor stub
		}

		public static void main(String[] args) throws Exception{
	        try {
	        	
	        	Scanner sc = new Scanner(System.in);
	    
	            System.out.println("Already user - enter 'login' / new user - enter 'register");
	            String enter = sc.nextLine();

	            
	            if(enter.equals("register")){
	                try  {
	                	
	                	Scanner ip = new Scanner(System.in); 
	                    System.out.println("customerId ,UserName,emailId ,phoneNo,address,password, ");
	                    String customerId= ip.nextLine() ;
	                    String username = ip.nextLine();
	            	    String emailID= ip.nextLine();
	            	    String phoneNo= ip.nextLine();
	            	    String address= ip.nextLine();
	            	    String password= ip.nextLine();
	            	    
	            	  
	            	    
	              ElectricityBilling users = new ElectricityBilling(customerId,username, emailID,phoneNo,address, password);
	                    System.out.println(users.customerId+"      "+users.username+"     "+users.emailID+"      "+users.phoneNo+"      "+users.address+"      "+users.password);
	                    ElectricityBillingDAO.addUser(users);
	                }catch(Exception e) {
	                	
	                }
	            }
	            else if(enter.equals("login"))
	            {
	                System.out.println("enter your mail id and password and customerid :");
	                String userEmail = sc.nextLine();
	                String userPassword = sc.nextLine();
	                String usercustomerid = sc.nextLine();
	                ElectricityBilling users2 = new ElectricityBilling(userEmail,userPassword,usercustomerid);
	                ElectricityBillingDAO.loginUser(users2);
	               
	                
	            }
	            
	            else if(enter.equals("billing"))
	            {
	                System.out.println("enter your mail id and password:");
	                String userEmail = sc.nextLine();
	                String userPassword = sc.nextLine();
	                String usercustomerid = sc.nextLine();
	                ElectricityBilling users2 = new ElectricityBilling(userEmail,userPassword,usercustomerid);
	                TypeOfConsumer.TypeConsume();
	                ElectricityBillingDAO.billing(users2);
	                
	            }
	            else if(enter.equals("admin"))
	            {
	                String useremail1 = sc.nextLine();
	                String userpassword1 = sc.nextLine();
	                
	                if(useremail1.equals("gopinathvinayagam@gmail.com")  && userpassword1.equals("gopinath@123"))
	                {
	                    System.out.println("welcome admin...!");
	                    ElectricityBillingDAO.allUser();
	                }
	                else{
	                    System.out.println("you are not an admin...!!");
	                    
	                    
	                }
	            }
	            else
	            {
	                System.out.println("enter the correct command: login / register");
	            }
	        }
	        catch(Exception e) {
            	
            }
	        
	    }
	    

		 
	    
	}
}