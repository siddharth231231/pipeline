import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();

      // Create a new instance of ChromeDriver
      WebDriver driver = new ChromeDriver();

      // Launch a URL
      driver.get("https://www.google.com");
      Thread.sleep(5000);
  }
}
