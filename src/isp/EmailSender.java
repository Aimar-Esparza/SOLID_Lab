package isp;

public class EmailSender {
	 public static void sendEmail(IEmail c, String message){
		 // Mezu bat bidaltzen du Person klaseko korreo helbidera. 
	 System.out.println("Mezu bat bidaltzen" + c.getEmail() + ": "+ message);
	 }
}
