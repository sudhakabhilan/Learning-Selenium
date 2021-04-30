package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		

		
		Thread.sleep(2000);
		
		
		//Click Hyper Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		
		
		
		driver.findElement(By.xpath("(//Div[@class = 'x-form-element']/input[@name='firstName'])[3]")).sendKeys("Sudhakaran");
		
		
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class = 'x-grid3-cell-inner x-grid3-col-firstName']/a[@class = 'linktext'])[1]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//div[@class = 'frameSectionExtra']/a[@class = 'subMenuButton'])[3]")).click();

		driver.findElementById("updateLeadForm_companyName").clear();
		String com = "Custom Company1";
		driver.findElementById("updateLeadForm_companyName").sendKeys(com);
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(2000);
		String curcom = driver.findElementById("viewLead_companyName_sp").getText();
		if(com.equals(curcom))
		{
			System.out.println("Company Name has Changed");
		}
			
		//driver.close();
	}

}
