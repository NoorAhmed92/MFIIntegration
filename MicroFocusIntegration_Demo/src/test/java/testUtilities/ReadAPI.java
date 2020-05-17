package testUtilities;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import org.testng.Reporter;

public class ReadAPI {
	private String Endpoint=  "http://api.zippopotam.us/us/90210";
	
	public String getDataFromAPI() {
		
		Response response= given().when().get(Endpoint).then().extract().response();
		String CountryName= response.path("country");
		System.out.println("API Data from response is:" + CountryName);
		
		return CountryName;
	}

}
