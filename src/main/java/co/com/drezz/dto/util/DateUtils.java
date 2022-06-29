package co.com.drezz.dto.util;

import com.github.javafaker.Faker;

public class DateUtils {
    private static Faker faker = new Faker();

    public static int generateRandom(){
        int numFaker = faker.number().numberBetween(1,2);
        return numFaker;

    }



}
