package Day8;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class SpartanFlow {

    int id;
    @BeforeClass
    public void beforeclass(){
        baseURI= ConfigurationReader.get("spartan_api_url");
    }

    @Test(priority = 1)
    public void POSTNewSpartan(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","barcelona");
        map.put("gender","Male");
        map.put("phone","1231231231");

        Response response = (Response) RestAssured.given().contentType(ContentType.JSON)
                .and().body(map)
                .when().post(baseURI);
               response.prettyPrint();// .then().statusCode(201);
        id=response.path("data.id");
        System.out.println(id);

    }

    @Test(priority = 2)
    public void PUTExistingSpartan(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","Sevilla");
        map.put("gender","Male");
        map.put("phone","1231231231");
        Response response = (Response) RestAssured.given().contentType(ContentType.JSON)
                .and().pathParam("id",id)
                .and().body(map)
                .when().put(baseURI+"/{id}");
        response.prettyPrint();
        System.out.println("response = " + response.statusCode());

    }

    @Test(priority = 3)
    public void PATCHExistingSpartan(){
        Map<String,Object> gender = new HashMap<>();
        gender.put("gender","Female");

        Response response = (Response) RestAssured.given().contentType(ContentType.JSON)
                .and().pathParam("id",id)
                .and().body(gender)
                .when().patch(baseURI+"/{id}");
        response.prettyPrint();
        System.out.println("response.statusCode() = " + response.statusCode());
    }

    @Test(priority = 4)
    public void GETThatSpartan(){
        Response response = (Response) RestAssured.given().contentType(ContentType.JSON)
                .and().pathParam("id",id)

                .when().get(baseURI+"/{id}");
        response.prettyPrint();
        System.out.println("response.statusCode() = " + response.statusCode());
    }

    @Test(priority = 5)
    public void DELETEThatSpartan(){
        Response response = (Response) RestAssured.given().contentType(ContentType.JSON)
                .and().pathParam("id",id)
                .when().delete(baseURI+"/{id}");
        response.prettyPrint();
        System.out.println("response.statusCode() = " + response.statusCode());
    }

}
