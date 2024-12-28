import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
public class postClass {
	@Test
public void PostRequest() {
		
		JSONObject request=new JSONObject();
		request.put("name", "ankit");
		request.put("job","teacher");
System.out.println(request);
	given()
	  .body(request.toJSONString())
	.when()
	  .post("https://reqres.in/api/users")
	.then()
	  .statusCode(201);
	
}
	
@Test
void putApiTest() {
	JSONObject obj=new JSONObject();
	obj.put( "name", "newterm");
		    obj.put("job", "zion resident");
	given().body(obj.toJSONString()).
	when().then().statusCode(200).body("data.first_name",hasItems("newterm")).log().all();
}

}
