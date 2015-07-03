package FirstPackage;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2 
{
	WebDriver driver = new FirefoxDriver();
    
    String URL = "http://dev.incoverage.de/app/index.html#/";
    
    String genString = "";
    Random rand = new Random();
    
    @BeforeTest
	public void beforeAllTests()
	{
		System.out.println("this is before the logIn functionality");
		driver.get(URL);
			          		 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize(); 
	}
    
    @Test(priority = 0)
    public void login() 
    {
    	// email id = mail
    	driver.findElement(By.id("mail")).clear();
    	driver.findElement(By.id("mail")).sendKeys("mavra.yasmin@coeus-solutions.de");
    	
    	// password id = pw
    	driver.findElement(By.id("pw")).clear();
    	driver.findElement(By.id("pw")).sendKeys("coeus123");
    	
    	//login button id = login_button
    	driver.findElement(By.id("login_button")).click();
    	
    	//incase of incorrect input ; error msg id = msg
    	
    }
    
    @Test(priority = 1)
    public void addNote()
    {
    	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[2]/div[3]/a/div")).click();
    	
    	//click to add new note
    	driver.findElement(By.xpath("/html/body/div[2]/ng-view/div/div[2]/a[1]/span[2]")).click();
    	
    	//enter note
    	driver.findElement(By.xpath("/html/body/div[2]/ng-view/div/div[3]/div[2]/div[2]/div[2]/span[3]/input")).clear();
    	driver.findElement(By.xpath("/html/body/div[2]/ng-view/div/div[3]/div[2]/div[2]/div[2]/span[3]/input")).sendKeys("note " + rand.nextInt(5000));
    	
    	//add creator
    	driver.findElement(By.xpath("/html/body/div[2]/ng-view/div/div[3]/div[2]/div[2]/div[2]/span[1]/input")).sendKeys("sana.ishtiaq@coeus-solutions.de");
    	driver.findElement(By.xpath("/html/body/div[2]/ng-view/div/div[3]/div[1]/div")).click();
    	
    	//get message text from top bar
        String txt = driver.findElement(By.xpath("/html/body/div[2]/ng-view/div/div[3]/ul[2]/span/li")).getText();
    	if(txt.equals("Email wurde versendet."))
    	{
    		System.out.println("this is a success message !!!");
    	}
    	else if( txt.equals("Wir benötigen Ihre E-Mail-Adresse.") )
    	{
    		System.out.println("this is an error message !!!");
    	}
    	else
    	{
    		System.out.println("some invalid condition!!!");
    		return;
    	}
    	
    	new Select(driver.findElement(By.xpath("/html/body/div[2]/ng-view/div/div[3]/div[2]/div[2]/div[2]/span[4]/span[1]/select"))).selectByIndex(1);
    	
    	//add description
    	driver.findElement(By.xpath("/html/body/div[2]/ng-view/div/div[3]/div[2]/div[2]/div[2]/span[5]/textarea")).clear();
    	driver.findElement(By.xpath("/html/body/div[2]/ng-view/div/div[3]/div[2]/div[2]/div[2]/span[5]/textarea")).sendKeys("note 3 for automation test");
    	
    	//click to save
    	driver.findElement(By.xpath("/html/body/div[2]/ng-view/div/div[3]/div[2]/div[2]/div[2]/div[2]/a[2]")).click();
    	
    	//RandomStringUtils.randomAlphabetic(10)
    }
}
