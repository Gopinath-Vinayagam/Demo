 
import java.math.BigInteger;
import java.util.Scanner;

import Exception.DBException;
public class RegistrationMain {



	static Scanner sc = new Scanner(System.in);

	public static void registration() {
		System.out.println("Enter your customerNo");
		BigInteger customerNo = sc.nextBigInteger();
		System.out.println("Enter your Name");
		String Name = sc.next();
		System.out.println("Enter user Name");
		String userName = sc.next();
		System.out.println("Enter your Mobile Number ");
		String userMobileNumber = sc.next();
		System.out.println("Enter your Age");
		int userAge = sc.nextInt();
		System.out.println("Enter your Address");
		String userAddress = sc.next();
		System.out.println("Enter your Consumer Type (mention it as DomestiConsumer or CommercialConsumer)");
		String userClass = sc.next();
		System.out.println("Enter your E-mail ID");
		String userEmailId = sc.next();
		System.out.println("Enter your Password");
		String userPassword = sc.next();
		UserRegistration car = new UserRegistration(customerNo,Name, userName, userMobileNumber, userAge,userAddress, userClass, userEmailId,userPassword);
		try {
			Registervalid.validatingRegistration(car);
		} catch (Exception e) {
			System.out.println("error..!!" + e.getMessage());
		}
	}

	public static void logininputs() throws DBException
	{
	System.out.println("Enter+ your EmailId");
	String email=sc.next();
	System.out.println("Enter your Password");
	String password=sc.next();
	try
	{
	//loginValidation.loginValidator(pen);
		LoginValidationUser.LoginValidationUser(email,password);
	}catch(Exception e)
	{
	System.out.println("error..!!"+e.getMessage());
	}
	}
}

