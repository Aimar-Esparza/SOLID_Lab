package ocp;

public class GoogleApi implements Api{
	
	public boolean signIn(String log, String pass) {
		//use the Google api
		return true;
	}
	
	public String getName() {
		return "Google";
	}
}
