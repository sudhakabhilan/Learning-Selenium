package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//Enter User Name
	
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	//Enter Password
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	//Click Login
	driver.findElementByClassName("decorativeSubmit").click();
	
	//Assert Home Page
	String homepagetext = driver.findElementByTagName("h2").getText();
	System.out.println(homepagetext);
	
	Thread.sleep(2000);
	
	
	//Click Hyper Link
	driver.findElement(By.linkText("CRM/SFA")).click();
	//Click Contact Hyper Link
	driver.findElement(By.linkText("Contacts")).click();
	Thread.sleep(2000);
	//Click Create Contact hyper link
	driver.findElement(By.linkText("Create Contact")).click();
	//Enter all details to the Contact page
	driver.findElement(By.id("firstNameField")).sendKeys("Viswanathan");
	driver.findElement(By.id("lastNameField")).sendKeys("Sudhakaran");
	driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Visu");
	driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Sudha");
	driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Quality Test Dept");
	driver.findElement(By.id("createContactForm_description")).sendKeys("this is a test Desc");
	driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("test@email.com");
	
		
			//Select state
			WebElement statedrop = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
			Select stdd = new Select(statedrop);
			stdd.selectByVisibleText("New York");
			//Click Create Lead to Save
			driver.findElementByClassName("smallSubmit").click();
			
			driver.findElement(By.xpath("//div/a[@class = 'subMenuButton']")).click();
			driver.findElement(By.id("updateContactForm_description")).clear();
			driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("This is a test note");
			
			driver.findElementByClassName("smallSubmit").click();
			System.out.println("The title is "+ driver.getTitle());
			driver.close();		
	}
//div/a[@href ='/crmsfa/control/updateContactForm?partyId=10049']
}
