package Api.com;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Geturl {
	
	@Test
	public void verify_statusCode() 
	{
		String url = "/api/users?page=2\r\n";
		RequestSpecification http_request = RestAssured.given();
		Response response = http_request.get(url);
		int statusCode = response.getStatusCode();
		System.out.println("Print status code---->"+statusCode);
		Assert.assertEquals(statusCode, 200,"status code are matched");
		
		
	}

}

