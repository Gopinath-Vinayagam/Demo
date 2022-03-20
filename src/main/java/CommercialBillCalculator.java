package electricityBillapp;

import java.util.Scanner;

public class CommercialBillCalculator {

	 static void CommercialBill() {
		System.out.println("Enter the consumed unit");
	   	 int units=0;
	   	Scanner input=new Scanner(System.in);
	   	units=input.nextInt();
	   	double billpay=0;
	billpay=units*7.35;
	 System.out.println("Bill to pay : " + billpay); 
	}

}
