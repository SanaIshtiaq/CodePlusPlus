package V1;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
//import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ReviewSubmission_Glassdoor 
{
	public static void main(String [] args)
	{
		WebDriver driver = new FirefoxDriver();
			    
		int i = 0 ;
		Random rand = new Random();
		//RandomStringUtils.randomAlphabetic(10)
		while ( i <= 0)
		{
			driver.get("https://www.glassdoor.com/survey/employer/collectReview_input.htm");
			         
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize(); 
			
			try
			{
				System.out.println("in try block");
			 	try
			    {
			 		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[1]/div[1]/div/input[1]")).click();
		 			driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[1]/div[1]/div/input[1]")).clear();
		 		
		 			System.out.println("1111111");
		 			
			 		if(i==1 || i==3)
			 		{
			 			driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[1]/div[1]/div/input[1]")).sendKeys("Coeus ");
			 			System.out.println("3333333");
			 		}
			 		else
			 		{//app
			 			//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[1]/div[1]/div/input[1]")).click();
			 			//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[1]/div[1]/div/input[1]")).clear();
				 		
						driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[1]/div[1]/div/input[1]")).sendKeys("Kai");
						System.out.println("222222");
				 	}
					
					WebElement myDynamicElement = (new WebDriverWait(driver, 10))
							  .until(ExpectedConditions.presenceOfElementLocated(By.id("SurveyEmployerName-menu")));
					 
					List<WebElement> elements = driver.findElements(By.className("ui-menu-item"));
						//*[@id="passwd"] 
					elements.get(0).click();
					//driver.findElement(By.partialLinkText(elements.get(0).getText()));
						 /*for(WebElement ele : elements)
						 {
							 System.out.println("location : "+ele.getLocation());
							 System.out.println("Text : "+ele.getText());
							 System.out.println();
						 }  
					*/	
			    }
			    catch(Exception e)
			    {
			    	System.out.println("Error at Employer field"+e);
			    }
			    
			 	//Star rating       
			 	//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[2]/div/fieldset/ul/li[2]")).click();
			 	if(i == 1 || i == 3)
			 	{
			 		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[2]/div[1]/div/fieldset/ul/li[3]/i")).click();
			 	}
			 	else
			 	{
			 		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[2]/div[1]/div/fieldset/ul/li[5]/i")).click();
			 	}
			 	
			 	//current or former employee
			 	driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[2]/div[2]/div/div/div[1]/div/div/div/label[1]")).click();
			 	//former
			 	//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[2]/div[2]/div/div/div[1]/div/div/div/label[2]")).click();
			 	
			 	
			 	//employee status from dropdown
			 	//driver.findElement(By.id("EmploymentStatusSelect")).click();         
			 	driver.findElement(By.id("EmploymentStatusSelectSelectBoxIt")).click();
			 	//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[4]/span/ul/li[3]")).click();
			 	driver.findElement(By.xpath("//*[@id='EmploymentStatusSelectSelectBoxItOptions']/li[2]")).click();
			 	
			 	
			 	//Review title
			 	//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[5]/div[1]/div/div/input")).click();
			 	//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[5]/div[1]/div/div/input")).sendKeys("Review for Coeus");
			 	driver.findElement(By.id("answer200")).click();
			 	driver.findElement(By.id("answer200")).clear();
			 	driver.findElement(By.id("answer200")).sendKeys("Review for Coeus"+rand.nextInt(2000));
			 	
			 	//Pros
			 	//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[6]/div/textarea")).click();
			 	//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[6]/div/textarea")).sendKeys("The environment in the company is great, Employees feel comfortable. The work load is bearable. I do like my company.");
			 	driver.findElement(By.id("answer100")).click();
			 	driver.findElement(By.id("answer100")).clear();
			 	driver.findElement(By.id("answer100")).sendKeys("The environment in the company is great, Employees feel comfortable. The work load is bearable. I do like my company."+rand.nextInt(2000));
			 	
			 	//Cons 
			 	//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[7]/div/textarea")).click();
			 	//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[7]/div/textarea")).sendKeys("Company trips are not frequent , actually trips are rare. Emplyees don't receive their bonuses very late which is very annoying.");
			 	driver.findElement(By.id("answer101")).click();
			 	driver.findElement(By.id("answer101")).clear();
			 	driver.findElement(By.id("answer101")).sendKeys("Company trips are not frequent , actually trips are rare. Emplyees don't receive their bonuses very late which is very annoying."+rand.nextInt(2000));
			 	
			 	//advice to management 
			 	//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[8]/div/textarea")).click();
			 	//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[8]/div/textarea")).sendKeys("Managment should improve the processes and should follow those strictly");
			 	driver.findElement(By.id("answer102")).click();
			 	driver.findElement(By.id("answer102")).clear();
			 	driver.findElement(By.id("answer102")).sendKeys("Managment should improve the processes and should follow those strictly"+rand.nextInt(2000));
			 	
			 	driver.findElement(By.id("ContinueButton")).click();
			 	}
			 	catch(Exception e)
			 	{
			 		System.out.println("the exception!!!!"+e);
			 		//driver.quit();
			 	}
			i++;
		}         
	}
}

