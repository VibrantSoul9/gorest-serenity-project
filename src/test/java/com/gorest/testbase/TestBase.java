package com.gorest.testbase;/**
 * @author VibrantSoul
 */

import com.gorest.utils.PropertyReader;
import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 *@author VibrantSoul
 */
public class TestBase {
    public static PropertyReader propertyReader;

    @BeforeClass
    public static void init() {
        propertyReader = PropertyReader.getInstance();                                        //if its common only declare here orelse NO
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
        RestAssured.basePath = propertyReader.getProperty("basePath");
        //Property Reader always returns String
    }
}
