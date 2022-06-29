package co.com.drezz.dto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddContactusIndex {

        public static final Target CLICK_CONTACTUS_INDEX = Target.the("Click Index")
            .located(By.id("contact-link"));

}
