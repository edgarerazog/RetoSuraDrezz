package co.com.drezz.dto.tasks;

import co.com.drezz.dto.userinterface.AddContactusPage;
import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;

import static co.com.drezz.dto.userinterface.AddContactusPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PutContactusInformation implements Task {
    private final DataTable dataTable;
    protected Faker faker = new Faker();
    AddContactusPage addContactusPage;

    public PutContactusInformation(DataTable dataTable) {
        this.dataTable = dataTable;
    }
    String ruta = "C:\\Users\\eerazo\\Documents\\reto-screenplay\\Reto_SuraDrezz\\src\\test\\resources\\data\\sura.pdf";
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(faker.internet().emailAddress().replace(" ","_")).into(ADD_CONTACTUS_EMAIL));
        actor.attemptsTo(Enter.theValue(dataTable.cell(1, 0)).into(ADD_ASK_FOR_REFERENCE));
        actor.attemptsTo(Enter.theValue(dataTable.cell(1, 1)).into(ADD_MESSAGE_REFERENCE));
        actor.attemptsTo(Click.on(addContactusPage.CONTACT_ID_DROPDOWN));
        actor.attemptsTo(SendKeys.of(ruta).into(CONTACT_PQR_FILE));
        actor.attemptsTo(Click.on(CLICK_CONTACTUS_SEND));



    }
    public static PutContactusInformation putContactusInformation(DataTable dataTable){ return instrumented(PutContactusInformation.class, dataTable); }

}
