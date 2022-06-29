package co.com.drezz.dto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.drezz.dto.userinterface.AddContactusIndex.CLICK_CONTACTUS_INDEX;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectContactusPage implements  Task {
    @Override
    public  <T extends Actor> void performAs(T theActor ){
        theActor.attemptsTo(
                Click.on(CLICK_CONTACTUS_INDEX)

        );
    }
    public static SelectContactusPage clickonContactUsPage (){
        return instrumented(SelectContactusPage.class);
    }
}
