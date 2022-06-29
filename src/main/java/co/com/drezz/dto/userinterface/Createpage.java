package co.com.drezz.dto.userinterface;

import co.com.drezz.dto.util.Constants;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Createpage extends PageObject {

    public static final Target TEXT_INFORMACION_PERSONAL = Target.the("Valida que este en el formulario para crear la cuenta")
            .located(By.cssSelector(".account_creation:nth-child(1) > .page-subheading"));
    public static final Target sign_in = Target.the("Email's Name")
            .located(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
    public static final Target INPUT_NOMBRES = Target.the("" + Constants.EL_USUARIO +" "+ Constants.MR_ROBOT + "  debera ingresar sus nombres completos")
            .located(By.id("customer_firstname"));
    public static final Target INPUT_APELLIDOS = Target.the("" + Constants.EL_USUARIO +" "+ Constants.MR_ROBOT + "  debera ingresar sus apellidos completos")
            .located(By.id("customer_lastname"));
    public static final Target create_account = Target.the("Email's Name")
            .located(By.id("email_create"));
    public static final Target clic_create_account = Target.the("Email's Name")
            .located(By.id("SubmitCreate"));
    public static final Target INPUT_PWD = Target.the("" + Constants.EL_USUARIO +" "+ Constants.MR_ROBOT + "  debera ingresar una contraseña de preferencia y que cumpla con las condiciones minimas de seguridad")
            .located(By.id("passwd"));
    public static final Target day_happybirthday = Target.the("Email's Name")
            .located(By.id("days"));
    public static final Target day_month = Target.the("Email's Name")
            .located(By.id("months"));
    public static final Target day_year = Target.the("Email's Name")
            .located(By.id("years"));


}
