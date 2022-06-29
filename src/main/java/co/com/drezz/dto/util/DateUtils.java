package co.com.drezz.dto.util;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

public class DateUtils {
    private static Faker faker = Faker.instance(new Locale("es", "CO"), new Random());

    public static int seleccionarTitulo() {
        int numTitulo = faker.number().numberBetween(Constants.DATO_MR, Constants.DATO_MRS);
        return numTitulo;
    }

    public static int generateRandom(){
        int numFaker = faker.number().numberBetween(1,2);
        return numFaker;

    }


}
