package electricityBillapp;
import java.util.Scanner;

public class DomesticBillCalculate {
	
	   
		public static void DomesticBill() 
	        {   
			System.out.println("Enter the consumed unit");
       	 int units=0;
       	Scanner input=new Scanner(System.in);
       	units=input.nextInt();
	        	

	 double billpay=0;
	 
	         if(units <=100)
	  {
	       billpay=units*0;
	   }
	 else if( units> 100 && units  <=200)
	  {
	    billpay=(units-100)*1.5+20;
	  }
	 else if(units>200 && units<=500)
	 {
	     billpay=(units-100)*3+30;
	 }
	 else if (units>500) {
		    billpay=(units-100)*4.5+50; 
	 }
	       
	 System.out.println("Bill to pay : " + billpay); 
	      }

	}