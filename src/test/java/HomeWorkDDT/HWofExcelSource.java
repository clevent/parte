package HomeWorkDDT;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import utilities.ConfigurationReader;
import utilities.ExcelUtil;
import org.testng.annotations.Test;

import java.util.*;

import static io.restassured.RestAssured.baseURI;

public class HWofExcelSource {

    @DataProvider
    public Object [][] excel(){

        ExcelUtil mock = new ExcelUtil("src/test/resources/mock_data.xlsx","data");

        String [][] dataArray = mock.getDataArrayWithoutFirstRow();

        return dataArray;
    }
    //Create an object from ExcelUtil
    //it accepts two argument
    //Argument 1: location of the file(path)
    //Argument 2: sheet that wew want to open(sheetName)
    @Test(dataProvider =  "excel")
    public void readExcelFile(String name, String gender, String phone){
       
       Map<String,Object> map = new HashMap<>();

            map.put("name", name);
            map.put("gender", gender);
            map.put("phone", 1234567893);
        System.out.println(map);

        //**********************   serialization  *************
        Gson gson = new Gson();
        String jsonnew = gson.toJson(map);
        System.out.println(jsonnew);


        //    list.add(map);
        String baseURI= ConfigurationReader.get("spartan_api_url");
        Response response = (Response) RestAssured.given().contentType(ContentType.JSON)
                .and().body(jsonnew)
                .when().post(baseURI);
        response.prettyPrint();
        // .then().statusCode(201);
//        int id=response.path("data.id");
//        System.out.println(id);

        }
//
//        //get Nona as a value
//        System.out.println("dataList.get(2) = " + dataList.get(2).get("name"));
//
//        //get Harber
//        System.out.println("dataList.get(8) = " + dataList.get(8).get("gender"));
//
//        //get all data in 2d array
//        String [][] dataArray = qa3short.getDataArray();
//
//        //print 2d array
//        System.out.println(Arrays.deepToString(dataArray));

    }













