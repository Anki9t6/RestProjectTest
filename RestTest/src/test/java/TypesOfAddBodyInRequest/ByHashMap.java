package TypesOfAddBodyInRequest;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class ByHashMap {
	
		@Test(priority=1)
		void testPostUsingHashmap() {
			HashMap hm=new HashMap();
		/*	
			hm.put("name", "ankit");
			hm.put("location", "karnal");
			hm.put("phone", "123456");
			
		String	courseArr[]= {"c","c++"};
		hm.put("courses", courseArr);
		
		given()
		.contentType("application/json")  // need to give the content type to parse
		.body(hm)
		
		.when()
		.post("https://reqres.in/api/users")
		
		.then()
		.statusCode(201)
	
		.log().all();*/
		
		hm.put("name", "ankit");
		hm.put("job","teacher");
		System.out.println(hm);
		given().contentType("application/json")
		  .body(hm)
		.when()
		  .post("https://reqres.in/api/users")
		.then()
		  .statusCode(201);
		
		}
	


}
