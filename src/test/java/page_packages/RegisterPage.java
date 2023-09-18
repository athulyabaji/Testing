package page_packages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
	WebDriver driver;
	By myAccBtn = By.xpath("//a[@title='My Account']");
	By myAccBtnOpn1 = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li[1]/a");
	By firstname = By.xpath("//input[@name='firstname']");
	By lastname = By.xpath("//input[@name='lastname']");
	By email = By.xpath("//input[@name='email']");
	By telephone = By.xpath("//input[@name='telephone']");
	By password = By.xpath("//input[@name='password']");
	By confirmPwd = By.xpath("//input[@name='confirm']");
	By regChkBtn = By.xpath("//div[@class='col-sm-10']/label[2]/input");
	By regChkBtn2 = By.xpath("//input[@name='agree']");
	By continueBtn = By.xpath("//input[@value='Continue']");
	
	
	//login
	By myAccBtnOpn2 = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li[2]/a");
	By loginEmail = By.xpath("//input[@name='email']");
	By loginPwd = By.xpath("//input[@name='password']");
	By loginBtn = By.xpath("//input[@value='Login']");
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void register() {
		driver.findElement(myAccBtn).click();
		driver.findElement(myAccBtnOpn1).click();
		driver.findElement(firstname).sendKeys("Attttm");
		driver.findElement(lastname).sendKeys("Banjjn");
		driver.findElement(email).sendKeys("athu@gml.com");
		driver.findElement(telephone).sendKeys("29932324");
		driver.findElement(password).sendKeys("athuka133");
		driver.findElement(confirmPwd).sendKeys("athukya133");
		driver.findElement(regChkBtn).click();
		driver.findElement(regChkBtn2).click();
		driver.findElement(continueBtn).click();

	}
	public void login1() {
		driver.findElement(myAccBtn).click();
		driver.findElement(myAccBtnOpn2).click();
		
	}
	public void setValues(String emailid,String password)
	{
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(3));
		w1.until(ExpectedConditions.visibilityOfElementLocated(loginEmail));
		driver.findElement(loginEmail).sendKeys(emailid);
		driver.findElement(loginPwd).sendKeys(password);
		
	}
	public void login2()
	{
		driver.findElement(loginBtn).click();

	}

}
