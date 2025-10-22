package ocp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AuthService {
	Map<String, Api> services;
	
	public AuthService(ArrayList<Api> services) {
		this.services = new HashMap<String, Api>();
		for(int i = 0; i < services.size(); i++) {
			this.services.put(services.get(i).getName(),services.get(i));
		}
	}
	 
	public boolean signIn(String service, String log, String pass) {
		Api api = services.get(service);
		if(api != null){
			return api.signIn(log, pass);
		}
		return false;
	}
}
