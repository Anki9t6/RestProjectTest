package TypesOfAddBodyInRequest;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class ByorgJson {
	@Test(priority=1)
	void testPostUsingJsonLib() {
		
		

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
}



