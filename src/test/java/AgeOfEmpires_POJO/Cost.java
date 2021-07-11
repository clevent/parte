package AgeOfEmpires_POJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cost {

    @SerializedName("Wood")
    @Expose
    private Integer wood;
    @SerializedName("Gold")
    @Expose
    private Integer gold;
    @SerializedName("Food")
    @Expose
    private Integer food;
    @SerializedName("info")
    @Expose
    private String info;

    public Integer getWood() {
        return wood;
    }

    public void setWood(Integer wood) {
        this.wood = wood;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getFood() {
        return food;
    }

    public void setFood(Integer food) {
        this.food = food;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}