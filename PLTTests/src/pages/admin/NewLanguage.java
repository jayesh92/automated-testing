package admin;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;

/*
 * @author Madi Paris
 * Test for New language UI feature on the Languages page
 */

public class NewLanguage extends CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/languages");
    if(driver.findElement(By.linkText("New language"))){
      JUnit.AssertTrue("Found the new language link", true);
    }
    else {
      JUnit.fail("No new language link found");
    }
  }
}
