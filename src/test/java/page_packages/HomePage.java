package page_packages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

public class HomePage {
	WebDriver driver;
	
	By homesearch=By.name("search");
	By searchbutton=By.xpath("//*[@id=\"search\"]/span/button");
	
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	public void setValues(String search)
	{
		driver.findElement(homesearch).sendKeys(search);
	}
	public void searchon()
	{
		driver.findElement(searchbutton).click();
	}
 public void checkWord()
 {
	 String Exp="Search - camera";
		String actual=driver.getTitle();
		Assert.assertEquals(Exp, actual);
 }
 public void screenshot() throws IOException 
 {

	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 FileHandler.copy(src, new File("D://error1.png"));
 }

	public void testScrolldown()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)","");
		driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[1]/a")).click();
	}

 
}
