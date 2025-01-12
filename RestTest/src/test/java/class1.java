import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class class1 {

	
	@Test
	public void function1() {
		//Response res=RestAssured.get("https://reqres.in/api/users?page=2");
		Response res=get("https://reqres.in/api/users?page=2"); //after set restassured impport to static remove restassued
		//as shown in above line
		
		/*RestAssured.post("https://reqres.in/api/users");
		RestAssured.put("https://reqres.in/api/users/2");
		RestAssured.delete("");*/
		System.out.println("statuscode is  "+res.getStatusCode());
		System.out.println("preety string is  "+res.asPrettyString());
		System.out.println("header content type is  "+res.contentType());
		System.out.println("Status line is  "+res.getStatusLine());
		System.out.println("time is  "+res.getTime());
		System.out.println("body is  "+res.getBody().asString());
		int StatusCode=res.getStatusCode();
		Assert.assertEquals(StatusCode,200);
		
	}
	@Test
public void BDDStyleRest() {
	//convert the resassured import to static for direct use
	given().get("https://reqres.in/api/users?page=2")
	.then()
	 .statusCode(200)
	 .body("data.id[0]", equalTo(7))
	 .body("data.first_name", hasItems("Michael"));
}
	
}
