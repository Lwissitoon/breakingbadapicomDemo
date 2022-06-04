import POJOs.Character;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;

import java.util.List;

public class CharacterApi extends ServiceCore {
    public static List<Character> GetCharacterByName(String name){
        ServiceConf();
        response = httpRequest.request(Method.GET, "/characters?name="+name);
        jsonPath = JsonPath.from(response.asString());
        return jsonPath.getList("", Character.class);
    }

    public static List<Character> GetCharacters(){
        ServiceConf();
        response = httpRequest.request(Method.GET, "/characters");
        jsonPath =JsonPath.from(response.asString());
        return jsonPath.getList("", Character.class);
    }
}
