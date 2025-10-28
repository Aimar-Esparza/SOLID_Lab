package isp;

public class Main {

	public static void main(String[] args) {
		 GmailAccount g = new GmailAccount("Aimar", "aimar@gmail.com");
	    
	      EmailSender.sendEmail(g, "Kaixo Aimar!");
	      //SMSSender.sendSMS(g, "Kaixo!"); ERROR
	}

}
