package electricityBillapp;

import java.util.Scanner;

public class TypeOfConsumer  {
	public static void TypeConsume() {
		System.out.println("CHOOSE CONSUMER TYPE");
  
   	Scanner input=new Scanner(System.in);
   	String type=input.nextLine();
   	String str= "domestic";
   	String Type=type.toLowerCase();
   	if (type.equalsIgnoreCase(str)) {
   		DomesticBillCalculate.DomesticBill();
   		
   	}
   	
   	else
   	{
   		CommercialBillCalculator.CommercialBill();
   	}
   
   	System.out.println(type);
   	
   	

	}

}
