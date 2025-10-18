package ocp;

public class FacebookApi implements Api{
	
	public boolean signIn(String log, String pass) {
		//use the FB api
		return true;
	}
	
	public String getName() {
		return "Facebook";
	}
}
