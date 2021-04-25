package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeadDuplicateLead {

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
		//Click Leads Hyper Link
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(2000);
		//Click Create Lead hyper link
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter all details to the lead page
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CA");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sudhakaran");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Viswanathan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sudha");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Visu");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Dr");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("50,000");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Quality");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("458");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("350");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("123");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("1");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("1");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9884680075");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("1");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@email.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Sud");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.google.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("karan");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("kar");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("1st street");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("CHennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600122");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("10");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Nagar");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("04/1/1985");
		//Select Source
		WebElement sourceDrop = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourcedd = new Select(sourceDrop);
		sourcedd.selectByVisibleText("Partner");
		//Select Industry
		WebElement industrydrop = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industdd = new Select(industrydrop);
		industdd.selectByVisibleText("Retail");
		//Select Ownership
		WebElement Ownerdrop = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownerdd = new Select(Ownerdrop);
		ownerdd.selectByVisibleText("Corporation");
		//Select Ownership
		WebElement Campaigndrop = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select campdd = new Select(Campaigndrop);
		campdd.selectByVisibleText("Automobile");
		
				//Select currency
				WebElement currencydrop = driver.findElement(By.id("createLeadForm_currencyUomId"));
				Select curdd = new Select(currencydrop);
				curdd.selectByVisibleText("DZD - Algerian Dinar");
				//Select country
				WebElement countrydrop = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
				Select countrydd = new Select(countrydrop);
				countrydd.selectByVisibleText("India");
				Thread.sleep(2000);
				//Select state
				WebElement statedrop = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select stdd = new Select(statedrop);
				stdd.selectByVisibleText("BIHAR");
				//Click Create Lead to Save
				driver.findElementByClassName("smallSubmit").click();
				//Get title
				String title1 =driver.getTitle();
				System.out.println(title1);
				driver.findElement(By.linkText("Duplicate Lead")).click();
		
				driver.findElement(By.id("createLeadForm_companyName")).clear();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Customer Analytics");
				//Click Create Lead to Save
				driver.findElementByClassName("smallSubmit").click();
				String compname = "Customer Analytics";
				String comname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
				if(compname.equals(comname)) {
					System.out.println("Testcase is passed");}
				driver.close();

		
		
	}

}
