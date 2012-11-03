package helpers;
import java.util.HashMap;
import java.util.Map;

import play.test.FakeApplication;


public class Helpers {
	
	public static FakeApplication fakeApplicationOverloaded() {
		
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("inject.modules", "module.DependenciesTest");
		
		return play.test.Helpers.fakeApplication(parameters);
	}

}