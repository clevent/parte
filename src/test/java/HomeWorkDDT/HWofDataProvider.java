package HomeWorkDDT;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class HWofDataProvider {
    //Optional homeworks
    //Homework-1
    //1-Create csv file from mackaroo website, which includes name,gender,phone
    //2-Download excel file
    //3- using testng data provider and apache poi create data driven posting from spartan



    //Homework-2
    //-Create one mackaroo api for name,gender,phone
    //send get request to retrieve random info from that api
    //use those info to send post request to spartan

//    @DataProvider
//    public  testData(){
//
//        List<Map<String,Object>> list = new ArrayList<>();
//        Map<String,Object> map = new HashMap<>();
//
//        map.put("name","carlos");
//        map.put("gender","Male");
//        map.put("phone","8877445596l");
//        list.add(map);
//
//        map.put("name","carlos");
//        map.put("gender","Male");
//        map.put("phone","8877445596l");
//        list.add(map);
//       // return list ;
//
//    }
//    @DataProvider(name="DP")
//    public Object[] hashdata() {
//
//        HashMap<String, String> hash_map = new HashMap<>();
//        hash_map.put("1", "One");
//        hash_map.put("2", "Two");
//        hash_map.put("3", "Three");
//
//        System.out.println(hash_map);
//
//
//    }
//
//    @Test //(dataProvider="testData")
//    public void hwtest1(){
//
//
//
//       // System.out.println(list);
//    }


}
