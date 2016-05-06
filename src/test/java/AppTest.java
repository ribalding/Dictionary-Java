import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.Rule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;
import static org.fluentlenium.core.filter.FilterConstructor.*;


public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Rule
  public ClearRule clearRule = new ClearRule();

  @Test
  public void rootTest(){
    goTo("http://localhost:4567");
    assertThat(pageSource()).contains("Enter A New Word:");
  }

  @Test
  public void definitionsGetOutputtedCorrectly() {
    goTo("http://localhost:4567");
    fill("#wordInput").with("cat");
    submit(".btn");
    click("a", withText ("cat"));
    fill("#inputDef").with("a furry feline");
    submit(".btn");
    assertThat(pageSource()).contains("a furry feline");
  }
}
