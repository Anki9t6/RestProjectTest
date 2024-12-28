package TypesOfAddBodyInRequest;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class pozoClassTest {
	@Test(priority=1)
	void testPostUsingPozoClass() {
		
		
		Pojo_PostRequest pz=new Pojo_PostRequest();
		pz.setName("anika");
		pz.setPhone("999999");
		pz.setLocation("Noida");
		String courseArr[]= {"rest","java"};
		pz.setCourses(courseArr);
	given()
	.contentType("application/json")  // need to give the content type to parse
	.body(pz)
	
	.when()
	.post("https://reqres.in/api/users")
	
	.then()
	.statusCode(201)
	.body("courses[0]",equalTo("rest"))
	.body("courses[1]",equalTo("java"))
	.log().all();
	}
}




