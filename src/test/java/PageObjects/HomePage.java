package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	

public  HomePage(WebDriver driver)//constructor to invoke parent class constructor
{
	super(driver);//from child class to invoke the parent class constructor
}

@FindBy(xpath="//span[normalize-space()='My Account']")
WebElement linkMyaccount;

@FindBy(xpath="//a[normalize-space()='Login']")
WebElement login;

@FindBy(xpath="//a[normalize-space()='Register']")
WebElement linkRegister;


public void clickMyAccount() {
	
	linkMyaccount.click();
}

public void clickRegister()
{
	linkRegister.click();
}

public void clickLogin()
{
	login.click();
}
}