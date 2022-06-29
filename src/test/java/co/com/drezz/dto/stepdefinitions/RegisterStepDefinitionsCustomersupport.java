package co.com.drezz.dto.stepdefinitions;

import co.com.drezz.dto.questions.registro.ValidarTextoCrearCuenta;
import co.com.drezz.dto.tasks.CreateAccount;
import co.com.drezz.dto.tasks.OpenWebPage;
import co.com.drezz.dto.tasks.PutContactusInformation;
import co.com.drezz.dto.tasks.SelectContactusPage;
import co.com.drezz.dto.util.Constants;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterStepDefinitionsCustomersupport {
    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Edgar needs to register a petition on the website DREZZ")
    public void edgarNeedsToRegisterAPetitionOnTheWebsite(DataTable dataTable) {

        theActorCalled(Constants.ACTOR).wasAbleTo(OpenWebPage.openWebPage(),
                SelectContactusPage.clickonContactUsPage(),
                PutContactusInformation.putContactusInformation(dataTable),
                CreateAccount.openWebPage());
        theActorInTheSpotlight().should(seeThat(ValidarTextoCrearCuenta.validarTextoCrearCuenta()));

    }


    @When("Fill in the required fields in the message")
    public void fillInTheRequiredFieldsInTheMessage() {
    }


    @Then("The DREZZ page shows that your message was sent successfully")
    public void theDREZZPageShowsThatYourMessageWasSentSuccessfully() {
    }
}
