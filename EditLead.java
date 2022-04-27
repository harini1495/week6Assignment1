package testcase;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	@Test
	public  void runEditLead() {
		
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("demosalesmanagers");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Seehash");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Harini");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ganesh");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("AutomationTester");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("Using Selenium interact with webapplication");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("harini1495@gmail.com");
        WebElement dropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select state = new Select(dropDown);
        state.selectByVisibleText("New York");
        driver.findElement(By.className("smallSubmit")).click();
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.id("updateLeadForm_description")).clear();
        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Selenium with webdriver");
        driver.findElement(By.className("smallSubmit")).click();
        driver.getTitle().contains("View Lead");
	}

}