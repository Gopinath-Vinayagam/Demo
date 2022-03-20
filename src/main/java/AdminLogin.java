import java.util.Scanner;
public class AdminLogin {
	
	public static void AdminEntry() throws Exception{
		
		System.out.println("PRESS  1  FOR BILL ENTRY PRESS  2  TO VIEW REGISTERED USER DETAILS AND 3 TO ENTER BILL STATUS ");
      	 int Options=0;
      	Scanner input=new Scanner(System.in);
      	Options=input.nextInt();
		if(Options==1) {
			
	   		DomesticBillCalculate.DomesticBill();

			
		}
		else if( Options==2) {
			RegisteredUserDetailsDAO.LoginValidationUser();
			
			
		}
		else if( Options==3) {
			
			EnterBillingStatusDAO.LoginValidationUser();
			

		
		}
	}
	
	
	
	

}
