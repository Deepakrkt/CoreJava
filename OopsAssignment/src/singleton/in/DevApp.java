package singleton.in;

public class DevApp {
	
private static DevApp app;
	
	// create private constructor
	
	private DevApp() {
		
	}
	
	public static DevApp getInstance() {
		if(null == app) {
			app = new DevApp();
		}
		return app;
	}
	

}
