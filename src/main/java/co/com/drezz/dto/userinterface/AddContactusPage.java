package co.com.drezz.dto.userinterface;

import co.com.drezz.dto.util.DateUtils;
import com.openhtmltopdf.css.parser.property.PrimitivePropertyBuilders;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddContactusPage extends PageObject {

    public  Target CONTACT_ID_DROPDOWN = Target.the("Id Contact")
            .located(By.xpath("//option[@value='"+DateUtils.generateRandom()+"']"));
    public static final Target ADD_CONTACTUS_EMAIL = Target.the("Email's Name")
            .located(By.id("email"));
    public static final Target ADD_ASK_FOR_REFERENCE = Target.the("Add Clothing")
        .located(By.id("id_order"));
    public static final Target ADD_MESSAGE_REFERENCE = Target.the("Add Message")
            .located(By.id("message"));
    public static final Target CONTACT_PQR_FILE = Target.the("Contact us button")
            .located(By.id("fileUpload"));
    public static final Target CLICK_CONTACTUS_SEND = Target.the("Click Final")
            .located(By.id("submitMessage"));

}
