package AgeOfEmpires_POJO;

import Day6_POJO.Spartan;
import io.restassured.http.ContentType;
import static org.testng.Assert.*;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import java.util.List;

public class Pojo_Deserialize {
    String uriageof = "https://age-of-empires-2-api.herokuapp.com/api/v1";

    @Test
    public void oneunittest() {

        Response response = given().accept(ContentType.JSON)
                .and().pathParam("id", 7)
                .when().get(uriageof + "/unit/{id}");

        assertEquals(response.statusCode(), 200);
        response.prettyPrint();

        Unit unit12 = response.body().as(Unit.class);

        System.out.println("unit12.getCost().getWood() = " + unit12.getCost().getWood());
        System.out.println("unit12.getAccuracy() = " + unit12.getAccuracy());

        assertEquals(unit12.getName(), "Skirmisher");


    }

    @Test
    public void providestest() {

        Response response = given().accept(ContentType.JSON)

                .when().get(uriageof + "/unit/12");

        assertEquals(response.statusCode(), 200);
        response.prettyPrint();

        Cost cost = response.as(Cost.class);
        System.out.println("cost.getFood() = " + cost.getFood());
        System.out.println("cost.getWood() = " + cost.getWood());


    }

    @Test
    public void unitstest1() {

        Response response = given().accept(ContentType.JSON)

                .when().get(uriageof + "/unit/12");

        assertEquals(response.statusCode(), 200);
        Unit units1 = response.body().as(Unit.class);
        System.out.println("units.getUnits().size() = " + units1.getArmor());


    }

}
