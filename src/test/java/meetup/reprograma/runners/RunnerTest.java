package meetup.reprograma.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue	 = {"meetup.reprograma.steps", "meetup.reprograma.setup"},
        tags	 = {"@SuccessfullRegisterCustomer"},
        snippets = SnippetType.UNDERSCORE
)

public class RunnerTest {

}
