package study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Study1 {
@Test
public void validlogin()
{
	System.setProperty("webdriver.gecko.driver","./software/geckodriver-v0.29.1-win64/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.com");
}
}
