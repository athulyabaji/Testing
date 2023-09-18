package testing_pkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page_packages.HomePage;
import page_packages.LoginPage;
import page_packages.ProductPage;
import page_packages.RegisterPage;
import utilities.ExcelUtility;

public class TestingHome {
	WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	}

@BeforeMethod
public void url()
{
	driver.get("https://naveenautomationlabs.com/opencart/");
	}
@Test
public void testHome() throws InterruptedException
{
	HomePage ob=new HomePage(driver);
	ob.setValues("camera");
	ob.searchon();
	ob.checkWord();
	//ob.testScrolldown();
	
	 RegisterPage rp=new  RegisterPage(driver);
	 rp.register();
//driver.navigate(). back(); 
//driver.navigate(). back(); 
//	 LoginPage lp=new LoginPage(driver);
//	 lp.setValues("ammu1@gmail.com","athu1");
//	 lp.login2();
	 
	 rp.login1();
	 String xl ="D:\\seliniumProject.xlsx";
		String Sheet ="Sheet1";
		int rowCount =ExcelUtility.getRowCount(xl,Sheet);
		for(int i=1;i<=rowCount;i++)
		{
			
			String UserName = ExcelUtility.getCellValue(xl,Sheet,i,0);
			System.out.println(UserName);
			String pwd = ExcelUtility.getCellValue(xl,Sheet,i,1);
			System.out.println(pwd);
			rp.setValues(UserName,pwd);
			rp.login2();
			
			
			
		}
		ProductPage pp=new ProductPage(driver);
		pp.selectProduct();
		pp.selectProduct2();
		pp.excistingAddress();
		pp.payment();
		pp.newAddress();
	
	}
	
			

@AfterMethod
public void close()
{
	//driver.close();
	}
}
