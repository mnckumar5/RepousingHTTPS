package Jan08class;

import io.restassured.RestAssured;

public class restassured {

	public static void main(String[] args) 
	
	{
		int code =RestAssured.get("http://google.com")
				.statusCode();
				
				System.out.println(code);

	}

}
