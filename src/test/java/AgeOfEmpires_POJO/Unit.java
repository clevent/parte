package AgeOfEmpires_POJO;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Unit {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("expansion")
    @Expose
    private String expansion;
    @SerializedName("age")
    @Expose
    private String age;
    @SerializedName("created_in")
    @Expose
    private String createdIn;
    @SerializedName("cost")
    @Expose
    private Cost cost;
    @SerializedName("build_time")
    @Expose
    private Integer buildTime;
    @SerializedName("reload_time")
    @Expose
    private Double reloadTime;
    @SerializedName("attack_delay")
    @Expose
    private Double attackDelay;
    @SerializedName("movement_rate")
    @Expose
    private Double movementRate;
    @SerializedName("line_of_sight")
    @Expose
    private Integer lineOfSight;
    @SerializedName("hit_points")
    @Expose
    private Integer hitPoints;
    @SerializedName("range")
    @Expose
    private String range;
    @SerializedName("attack")
    @Expose
    private Integer attack;
    @SerializedName("armor")
    @Expose
    private String armor;
    @SerializedName("accuracy")
    @Expose
    private String accuracy;
    @SerializedName("attack_bonus")
    @Expose
    private List<String> attackBonus = null;
    @SerializedName("search_radius")
    @Expose
    private Integer searchRadius;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExpansion() {
        return expansion;
    }

    public void setExpansion(String expansion) {
        this.expansion = expansion;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCreatedIn() {
        return createdIn;
    }

    public void setCreatedIn(String createdIn) {
        this.createdIn = createdIn;
    }

    public Cost getCost() {
        return cost;
    }

    public void setCost(Cost cost) {
        this.cost = cost;
    }

    public Integer getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(Integer buildTime) {
        this.buildTime = buildTime;
    }

    public Double getReloadTime() {
        return reloadTime;
    }

    public void setReloadTime(Double reloadTime) {
        this.reloadTime = reloadTime;
    }

    public Double getAttackDelay() {
        return attackDelay;
    }

    public void setAttackDelay(Double attackDelay) {
        this.attackDelay = attackDelay;
    }

    public Double getMovementRate() {
        return movementRate;
    }

    public void setMovementRate(Double movementRate) {
        this.movementRate = movementRate;
    }

    public Integer getLineOfSight() {
        return lineOfSight;
    }

    public void setLineOfSight(Integer lineOfSight) {
        this.lineOfSight = lineOfSight;
    }

    public Integer getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(Integer hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    public List<String> getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(List<String> attackBonus) {
        this.attackBonus = attackBonus;
    }

    public Integer getSearchRadius() {
        return searchRadius;
    }

    public void setSearchRadius(Integer searchRadius) {
        this.searchRadius = searchRadius;
    }

}