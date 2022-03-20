import java.math.BigInteger;

public class UserRegistration {

		public BigInteger customerNo;
		public String Name;
		public String userName;
		public String userMobileNumber;
		public int userAge;
		public String userAddress;
		public String userClass;
		public String userEmailId;
		public String userPassword;

	
		


		public UserRegistration(BigInteger customerNo, String Name, String userName, String userMobileNumber,
				int userAge, String userAddress, String userClass, String userEmailId, String userPassword) {
			this.customerNo=customerNo;;
			this.Name=Name;
			this.userName= userName;
			this.userMobileNumber=userMobileNumber;
			this.userAge=userAge;
			this.userAddress=userAddress;
			this.userClass=userClass;
			this.userEmailId=userEmailId;
			this.userPassword=userPassword;
		}
}

		