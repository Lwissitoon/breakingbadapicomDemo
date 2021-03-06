package POJOs;

import java.util.ArrayList;
import java.util.List;

public class Character {
    public Integer charId;
    private String name;
    private String birthday;
    private List<String> occupation = new ArrayList<String>();
    private String img;
    private String status;
    private String nickname;
    private List<Integer> appearance = new ArrayList<Integer>();
    private String portrayed;
    private String category;
    private List<Object> betterCallSaulAppearance = new ArrayList<Object>();
    public Integer getCharId() {
        return charId;
    }
    public void setCharId(Integer charId) {
        this.charId = charId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public List<String> getOccupation() {
        return occupation;
    }
    public void setOccupation(List<String> occupation) {
        this.occupation = occupation;
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public List<Integer> getAppearance() {
        return appearance;
    }
    public void setAppearance(List<Integer> appearance) {
        this.appearance = appearance;
    }
    public String getPortrayed() {
        return portrayed;
    }
    public void setPortrayed(String portrayed) {
        this.portrayed = portrayed;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public List<Object> getBetterCallSaulAppearance() {
        return betterCallSaulAppearance;
    }
    public void setBetterCallSaulAppearance(List<Object> betterCallSaulAppearance) {
        this.betterCallSaulAppearance = betterCallSaulAppearance;
    }
}
