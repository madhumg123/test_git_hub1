package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebook_login {
@FindBy(id="email")
private WebElement uName;

@FindBy(id="pass")
private WebElement pwd;

@FindBy(name="login")
private WebElement loginbtn;

public facebook_login(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void setUsername(String un)
{
	uName.sendKeys(un);
}
public void setPassword(String pass)
{
	uName.sendKeys(pass);
}
}
