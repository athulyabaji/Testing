package page_packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By myAccBtn = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a");
//	By myAccBtnOpn2 = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");
//	
//	By loginEmail = By.xpath("//*[@id=\"input-email\"]");
//	By loginPwd = By.xpath("//*[@id=\"input-password\"]");
//	By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	By myAccBtnOpn2 = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li[2]/a");
	By loginEmail = By.xpath("//*[@id=\"input-email\"]");
	By loginPwd = By.xpath("//input[@name='password']");
	By loginBtn = By.xpath("//input[@value='Login']");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void setValues(String loginEmail1,String loginPwd2 )
	{
		driver.findElement(loginEmail).sendKeys(loginEmail1);
		driver.findElement(loginPwd).sendKeys(loginPwd2);
	}
	public void login2()
	{
		driver.findElement(myAccBtn).click();
		driver.findElement(myAccBtnOpn2).click();
		driver.findElement(loginBtn).click();
		

	}

}
