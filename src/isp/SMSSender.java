package isp;

public class SMSSender {
	 public static void sendSMS(Person c, String message){
		 //SMS bat bidaltzen du Person klaseko telefono zenbakira. 
		 System.out.println("SMS bat bidaltzen" + c.getTelephone() + ": "+ message);
	 }
}