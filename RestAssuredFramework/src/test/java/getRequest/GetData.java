package getRequest;

import org.openqa.selenium.remote.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetData {
	
	@Test
	
	public void testResponsecode() {
		
	// test code
		
	io.restassured.response.Response resp = RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=d8217c6fec49b7cb225edd8a043b4a14");
     
	int code = resp.getStatusCode();
	
	System.out.println("Status code is " +code);
	
	Assert.assertEquals(code,200);
	}

}
