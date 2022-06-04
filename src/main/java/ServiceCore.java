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

    public static List<Character> GetCharacterByName(String name){
        ServiceConf();
         response = httpRequest.request(Method.GET, "/characters?name="+name);
            jsonPath =JsonPath.from(response.asString());
         return jsonPath.getList("", Character.class);
    }

    public static List<Character> GetCharacters(){
        ServiceConf();
        response = httpRequest.request(Method.GET, "/characters");
        jsonPath =JsonPath.from(response.asString());
        return jsonPath.getList("", Character.class);
    }

}
