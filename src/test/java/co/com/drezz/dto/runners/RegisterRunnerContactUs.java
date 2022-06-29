package co.com.drezz.dto.runners;


        import io.cucumber.junit.CucumberOptions;
        import net.serenitybdd.cucumber.CucumberWithSerenity;
        import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = "src/test/resources/features/management_customersupport.feature",
        tags="@register1",
        glue ="co.com.drezz.dto",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class RegisterRunnerContactUs {
}
