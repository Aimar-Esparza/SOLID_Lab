package isp;

public class GmailAccount implements IEmail{
	String name;
    String emailAddress;

    public GmailAccount(String n, String e) {
        name = n;
        emailAddress = e;
    }

    @Override
    public String getEmail() {
        return emailAddress;
    }
}
