package com.gorest.utils;/**
 * @author VibrantSoul
 */

import java.util.Random;

/**
 *@author VibrantSoul
 */
public class TestUtils {
    public static String getRandomValue(){
        Random random = new Random();
        int randomInt = random.nextInt(100000);                  //Returns String
        return Integer.toString(randomInt);
    }

    public static int getRandomNumber(){
        Random random = new Random();
        int number = random.nextInt(10000);                    //Returs int
        return number;
    }
}
