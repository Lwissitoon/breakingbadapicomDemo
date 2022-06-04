import POJOs.Character;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import  POJOs.*;
import java.util.List;

public class ServiceCore {
    static Response response;
    static RequestSpecification httpRequest;
    static JsonPath jsonPath;
    public static void ServiceConf(){
        RestAssured.baseURI = "https://www.breakingbadapi.com/api";
        httpRequest = RestAssured.given();
    }


}
