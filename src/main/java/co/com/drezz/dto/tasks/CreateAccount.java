package co.com.drezz.dto.tasks;

import co.com.drezz.dto.userinterface.Createpage;
import co.com.drezz.dto.util.Constants;
import com.github.javafaker.Faker;
import io.cucumber.java.sk.Tak;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import java.util.Locale;
import java.util.Random;

import static co.com.drezz.dto.userinterface.Createpage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateAccount implements Task {
    private static Faker faker = Faker.instance(new Locale("es", "CO"), new Random());
    //private RegistroPage registroPage;

    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(Click.on(Createpage.sign_in), SendKeys.of("edgarpruebas@hotmail.com").into(Createpage.create_account),Click.on(Createpage.clic_create_account),Click.on(Createpage.day_happybirthday),Click.on(Createpage.day_happybirthday),SendKeys.of("2").into(Createpage.day_happybirthday),Click.on(Createpage.day_month),Click.on(Createpage.day_month),SendKeys.of("April").into(Createpage.day_month),Click.on(Createpage.day_year),Click.on(Createpage.day_year),SendKeys.of("1986").into(Createpage.day_year));
        theActor.attemptsTo(Enter.theValue(faker.name().firstName()).into(INPUT_NOMBRES));
        theActor.attemptsTo(Enter.theValue(faker.name().lastName()).into(INPUT_APELLIDOS));
        theActor.attemptsTo(Enter.theValue(faker.internet().password()).into(INPUT_PWD));


    }
    public static CreateAccount openWebPage() {
        return instrumented(CreateAccount.class);
    }
}
