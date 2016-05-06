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

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ReviewSubmission 
{ 
	  public static void main(String [] args)
	  {     		 
			WebDriver driver = new FirefoxDriver();
			         
			driver.get("https://www.glassdoor.com/survey/employer/collectReview_input.htm");
			         
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize(); 
			
			try
			{
				System.out.println("in try block");
			 	
			 	try
			    {
			 		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[1]/div[1]/div/input[1]")).click();
					System.out.println("1111111");
					//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[1]/div[1]/div/input[1]")).clear(); 
					//System.out.println("2222222");
					driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[1]/div[1]/div/input[1]")).sendKeys("Coeus ");
					System.out.println("3333333");
					
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

						driver.quit();  
					*/
					//System.out.println("DYNAMIC ELEMENT is " +myDynamicElement);
								
			    }
			    catch(Exception e)
			    {
			    	System.out.println("Error at Employer field"+e);
			    }
			    
			 	//Star rating       
			 	//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[2]/div/fieldset/ul/li[2]")).click();
			 	driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[2]/div[1]/div/fieldset/ul/li[3]/i")).click();
			 	
			 	//current or former employee
			 	driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[2]/div[2]/div/div/div[1]/div/div/div/label[1]")).click();
			 	//driver.findElement(By.id("EmployerSurveyRadioCurrent")).click();
			 	
			 	//employee status from dropdown
			 	//driver.findElement(By.id("EmploymentStatusSelect")).click();         
			 	driver.findElement(By.id("EmploymentStatusSelectSelectBoxIt")).click();
			 	//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[4]/span/ul/li[3]")).click();
			 	driver.findElement(By.xpath("//*[@id='EmploymentStatusSelectSelectBoxItOptions']/li[2]")).click();
			 	
			 	
			 	//Review title
			 	//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[5]/div[1]/div/div/input")).click();
			 	//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[5]/div[1]/div/div/input")).sendKeys("Review for Coeus");
			 	driver.findElement(By.id("answer200")).click();
			 	driver.findElement(By.id("answer200")).sendKeys("Review for Coeus");
			 	
			 	//Pros
			 	//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[6]/div/textarea")).click();
			 	//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[6]/div/textarea")).sendKeys("The environment in the company is great, Employees feel comfortable. The work load is bearable. I do like my company.");
			 	driver.findElement(By.id("answer100")).click();
			 	driver.findElement(By.id("answer100")).sendKeys("The environment in the company is great, Employees feel comfortable. The work load is bearable. I do like my company.");
			 	
			 	//Cons 
			 	//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[7]/div/textarea")).click();
			 	//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[7]/div/textarea")).sendKeys("Company trips are not frequent , actually trips are rare. Emplyees don't receive their bonuses very late which is very annoying.");
			 	driver.findElement(By.id("answer101")).click();
			 	driver.findElement(By.id("answer101")).sendKeys("Company trips are not frequent , actually trips are rare. Emplyees don't receive their bonuses very late which is very annoying.");
			 	
			 	//advice to management 
			 	//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[8]/div/textarea")).click();
			 	//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/article/div/div/form/div[3]/div[2]/div[8]/div/textarea")).sendKeys("Managment should improve the processes and should follow those strictly");
			 	driver.findElement(By.id("answer102")).click();
			 	driver.findElement(By.id("answer102")).sendKeys("Managment should improve the processes and should follow those strictly");
			 	
			 	driver.findElement(By.id("ContinueButton")).click();		 	
			 	}
			 	catch(Exception e)
			 	{
			 		System.out.println("the exception!!!!"+e);
			 		//driver.quit();
			 	}
			    
			//*****************************************************
			// https://www.glassdoor.com/profile/joinNow_input.htm?surveyType=REVIEWS&userOriginHook=CONTENT_AFTER_CONTRIBUTION&midTx=true
			String strUrl = driver.getCurrentUrl();
			System.out.println("URL of current page : "+strUrl);
			System.out.println("length of URL : "+strUrl.length());
			if(strUrl.contains("https://www.glassdoor.com/profile/joinNow_input.htm"))
			{
				System.out.println("The review has submitted without login");
				// getTitle() method
				 String strTitle = driver.getTitle();
				 System.out.println("title of page : "+strTitle);
				 System.out.println("length of title : "+strTitle.length());
				 System.out.println();
				
				 
				 if(strTitle.equals("Sign Up | Glassdoor") )
				 {
					 //click the signIn tab
					 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div[2]/div/div[1]/div/div[1]/ul/li[2]/a")).click();
					                             // /html/body/div[2]/div/div/div/div/div[1]/div[2]/div/div[1]/div/div[1]/ul/li[2]/a
					 //enter email address
					 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div[2]/div/div[1]/div/div[1]/div[3]/form/div[3]/input")).clear();
					 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div[2]/div/div[1]/div/div[1]/div[3]/form/div[3]/input")).sendKeys("test1@coeus-solutions.de");
					
					 //enter password
					 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div[2]/div/div[1]/div/div[1]/div[3]/form/span/div[1]/input")).clear();
					 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div[2]/div/div[1]/div/div[1]/div[3]/form/span/div[1]/input")).sendKeys("test123");
					
					 //click at signIn button
					 driver.findElement(By.id("signInBtn")).click();
					 System.out.println("SignIn has done successfully");
				 }
				 else
				 {
					 System.out.println("conditions didn't match and signIn not done");
				 }
			}
			else
			{
				System.out.println("There is some problem in submitting the form");
			}
			 
	  }
}

