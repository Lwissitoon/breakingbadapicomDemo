import POJOs.Character;
import org.testng.annotations.Test;

import java.util.List;

public class TestCases {

@Test
    public void GetCharacterByName(){

    System.out.println(CharacterApi.GetCharacterByName("Walter White").get(0).getBirthday());
    }

    @Test
    public void GetAllCharacters(){
        List<Character> Characters =CharacterApi.GetCharacters();
    for(int i=0;i<Characters.size();i++){

        System.out.println("Character name: "+Characters.get(i).getName());
        System.out.println("Portrayed: "+Characters.get(i).getPortrayed());
        System.out.println("------------------------------------------------------");
    }
    }
}
