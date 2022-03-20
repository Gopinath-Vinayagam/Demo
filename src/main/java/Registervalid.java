

	import java.math.BigInteger;
import java.util.*;

import Exception.DBException;
public class Registervalid {
		static Scanner i=new Scanner(System.in);
		public static void menu() throws Exception {
		System.out.println("'WELCOME TO Electricity Billing App'");
		System.out.println("Enter your option");
		System.out.println("Enter 1 for Register");
		System.out.println("Enter 2 for Login");
		System.out.println("Enter key for Admin Login");

		int option=i.nextInt();
		while(option>=4) {
			System.out.println("Enter a valid password");
			option=i.nextInt();
		}
		
		
	 // enter option register or login
	if (option == 1) {
		RegistrationMain.registration();
	} 
	else if (option == 2)
	{
		RegistrationMain.logininputs();
	}
	else if (option == 3)
	{
		RegistrationMain.logininputs();
	}
	}

		public static void validatingRegistration(UserRegistration car) throws Exception {
			int iscustomerNoValid = customerNoValidation(car.customerNo);
			int isNameValid = nameValidation(car.Name);
			int isUserNameValid = userNameValidation(car.userName);
			int isMobileNumberValid = userMobileNumberValidation(car.userMobileNumber);
			int isAgeValid = userAgeValidation(car.userAge);
			int isuserAddress=userAddressValidation(car.userAddress);
			int isEmailIdValid = userEmailIdValidation(car.userEmailId);
			int isPasswordValid = userPasswordValidation(car.userPassword);
			int isClassValid = userClassValidation(car.userClass);
			if (iscustomerNoValid+isNameValid + isUserNameValid + isMobileNumberValid + isAgeValid + isuserAddress+ isEmailIdValid + isPasswordValid+ isClassValid ==7 ) {
				System.out.println("YOU REGISTERED SUCCESSFULLY");
				System.out.println("Enter 1 to go back Main menu");
				int t=i.nextInt();
				while(t!=0 || t<=1) {
				menu();
				t=i.nextInt();
				}
				RegistrationDAO.insertUser(car);

			} else {
				throw new Exception("Please Re-Enter Your Details");
			}
		}
		
		public static int customerNoValidation(BigInteger customerNo) throws Exception {
			if (customerNo != null ) {
				return 1;
			} else {
				throw new Exception("Enter a Valid NUMBER");
			}
		}

		public static int nameValidation(String Name) throws Exception {
			if (Name != null) {
				return 1;
			} else {
				throw new Exception("Enter a Valid Name");
			}
		}

		public static int userNameValidation(String userName) throws Exception {
			if (userName != null) {
				return 1;
			} else {
				throw new Exception("Enter a Valid User Name");
			}
		}

		public static int userMobileNumberValidation(String userMobileNumber) throws Exception {
			char[] mobile = userMobileNumber.toCharArray();
			if (mobile.length == 10) {
				for (char i : mobile) {

					if (Character.isAlphabetic(i))
						
					{
						throw new Exception("Enter only Numeric values");
					}
				}
			}
			return 1;
		}

		public static int userAgeValidation(int userAge) throws Exception {
			if (userAge < 0) {
				throw new Exception("enter a valid Age");
			} else {
				return 1;
			}
		}
		public static int userAddressValidation(String userAddress) throws Exception {
			if (userAddress != null) {
				return 1;
			} else {
				throw new Exception("Enter a Valid User Address");
			}
		}
		public static int userClassValidation(String userClass) throws Exception {
			if (userClass !=null) {
				
				
				return 1;
			} else {
				throw new Exception("Enter a Valid ConsumerType");
			}
		}
		public static int userEmailIdValidation(String userEmailId) throws Exception {
			if (userEmailId.contains("@")) {
				return 1;
			} else {
				throw new Exception("Enter Valid email id");
			}
		}

		public static int userPasswordValidation(String userPassword) throws Exception {
			if (userPassword.length() >8) {
				return 1;
			} else {
				throw new Exception("Enter a Valid Password");
			}
		}

		

	}
