package Wolfram;

   import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;
	
	public class WolframLogin {
		//code for login module 
		@Test
		public void loginToWolfram() 
		{
			WebDriver driver=new FirefoxDriver(); //Firefox browser is launched
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://develop.wolframcloud.com/app/");
			((WebElement) 
		    driver.findElement(By.id("email"))).sendKeys("krithibekal16@gmail.com"); //user name is given
		   ((WebElement) 
		    driver.findElement(By.id("password"))).sendKeys("Amma$25appa");//password is given
		    driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[2]/form/div[2]/div ")).click();// choosing from the dropdown menu
			driver.findElement(By.id("newNotebookBtn")).click();//find the notebook option
			
			
		}

	}


