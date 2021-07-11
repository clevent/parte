package apitests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;



public class MYHamcrestTeachersCybertek {


    @Test
    public void teacher(){
        given().accept(ContentType.JSON)
                .and().pathParam("id",8261)
                .when().log().all().get("http://api.cybertektraining.com/teacher/{id}")
                .then().statusCode(200)
                .and().contentType(equalTo("application/json;charset=UTF-8"))
                .and().header("Content-Length",equalTo("240"))
                .and().header("Connection",equalTo("Keep-Alive"))
                .and().header("Date",notNullValue())
                .and().assertThat().body("teachers.firstName[0]",equalTo("James"),
                "teachers.lastName[0]",equalTo("Bond"),
                "teachers.gender[0]",equalTo("Male")).log().all();
    }

    @Test
    public void homework1(){
        given().accept(ContentType.JSON)
                .and().pathParam("id",15)
                .when().get("http://34.233.135.132:8000/api/spartans/{id}")
              .then().statusCode(200)
            .contentType(equalTo("application/json"))
               .and().header("Date",notNullValue())
              .and().header("Transfer-Encoding","chunked")
                .log().all();


//              .and().assertThat().body("id",equalTo("20"),"name",equalTo("Lothario"),
//             "gender",equalTo("Male"),"phone",equalTo("7551551687")).log().all();






    }



}