package Covid19;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.Matchers.*;

import java.util.List;

public class SpainCovid19 {

    String url= "https://covid-api.mmediagroup.fr/v1/cases";

    @Test
    public void spaintest(){

        Response response = (Response) given().accept(ContentType.JSON)
                .and().queryParams("country", "Spain")
                .when().get(url);
        response.then().statusCode(200);
   response.prettyPrint();
        JsonPath jsonpath = response.jsonPath();
        System.out.println("jsonpath.getString(\"Andalusia.deaths\") = " + jsonpath.getString("Andalusia.deaths"));
        System.out.println("jsonpath.getString(\"All.deaths\") = " + jsonpath.getString("All.deaths"));
        System.out.println("jsonpath.getString(\"Madrid.recovered\") = " + jsonpath.getString("Madrid.recovered"));
    }






}
