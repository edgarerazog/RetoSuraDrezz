package co.com.drezz.dto.questions.registro;

import co.com.drezz.dto.util.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.drezz.dto.userinterface.Createpage.TEXT_INFORMACION_PERSONAL;

public class ValidarTextoCrearCuenta implements Question {


    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(TEXT_INFORMACION_PERSONAL, WebElementStateMatchers.containsText(Constants.TEXTO_PAG_REGISTRO))
                .forNoMoreThan(Constants.INTERMEDIATE).seconds());
        return true;
    }
    public static ValidarTextoCrearCuenta validarTextoCrearCuenta(){
        return  new ValidarTextoCrearCuenta();
    }

}
