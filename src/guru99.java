
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class guru99 {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v4/");
		
		//email
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr47659");
		//password
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("12345@");
		//login
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		
		//insurence project
		driver.findElement(By.xpath("html/body/div[1]/div[2]/nav/div/div/ul/li[3]/a")).click();
		Thread.sleep(3000);
		//register
		driver.findElement(By.xpath("html/body/div[4]/a")).click();
		//title
		driver.findElement(By.xpath("//input[@name='firstname']")).click();
		
		 //Scroll Down-up
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(3000);
		
		//miss
		driver.findElement(By.xpath("html/body/div[3]/form/div[2]/select/option[3]")).click();
		//name
		driver.findElement(By.xpath("html/body/div[3]/form/div[2]/input")).sendKeys("Aish");
		
		//surname
		driver.findElement(By.xpath("html/body/div[3]/form/div[2]/div[1]/input")).sendKeys("Aish");
		
		//phone#
		driver.findElement(By.xpath("html/body/div[3]/form/div[2]/div[2]/input")).sendKeys("1234567891");
		
		//year
		driver.findElement(By.xpath("html/body/div[3]/form/div[2]/div[3]/select[1]")).click();
		
		//1995
		driver.findElement(By.xpath("html/body/div[3]/form/div[2]/div[3]/select[1]/option[61]")).click();
		
		//month
		driver.findElement(By.xpath("html/body/div[3]/form/div[2]/div[3]/select[2]")).click();
		
		//june
		driver.findElement(By.xpath("html/body/div[3]/form/div[2]/div[3]/select[2]/option[6]")).click();
		
		//date
		driver.findElement(By.xpath("html/body/div[3]/form/div[2]/div[3]/select[3]")).click();
		
		//22
		driver.findElement(By.xpath("html/body/div[3]/form/div[2]/div[3]/select[3]/option[22]")).click();
		//full
		driver.findElement(By.xpath("html/body/div[3]/form/div[2]/div[4]/label[1]")).click();
	
		// licence period
		driver.findElement(By.xpath("html/body/div[3]/form/div[2]/div[5]/select")).click();
		
		//10years
		driver.findElement(By.xpath("html/body/div[3]/form/div[2]/div[5]/select/option[10]")).click();
		
		//occupation
		driver.findElement(By.xpath("html/body/div[3]/form/div[2]/div[6]/select")).click();
		
		//student
		driver.findElement(By.xpath("html/body/div[3]/form/div[2]/div[6]/select/option[6]")).click();
		
		
		//Scroll Down-up
		JavascriptExecutor jsa=(JavascriptExecutor)driver;
		jsa.executeScript("window.scrollBy(250,500)", "");
		Thread.sleep(3000);
		
		//address
		
		//street
		driver.findElement(By.xpath("html/body/div[3]/form/div[4]/div[1]/input")).sendKeys("adfsg");
		
		//city
		driver.findElement(By.xpath("html/body/div[3]/form/div[4]/div[2]/input")).sendKeys("adfsg");
		
		//country
		driver.findElement(By.xpath("html/body/div[3]/form/div[4]/div[3]/input")).sendKeys("India");
		
		//postcode
		driver.findElement(By.xpath("html/body/div[3]/form/div[4]/div[4]/input")).sendKeys("sy245be");
		
		//email
		driver.findElement(By.xpath("html/body/div[3]/form/div[5]/div[1]/input")).sendKeys("testautomate2018@gmail.com");
		
		//password
		driver.findElement(By.xpath("html/body/div[3]/form/div[5]/div[2]/input")).sendKeys("raodinni2018");

		//confirm password
		driver.findElement(By.xpath("html/body/div[3]/form/div[5]/div[3]/input")).sendKeys("raodinni2018");
			
		//create button
		driver.findElement(By.xpath("html/body/div[3]/form/div[5]/input[2]")).click();
		
		
		
		//sign-up
		//email
		driver.findElement(By.xpath("html/body/div[3]/form/div[1]/input")).sendKeys("testautomate2018@gmail.com");
				
		//password
		driver.findElement(By.xpath("html/body/div[3]/form/div[2]/input")).sendKeys("raodinni2018");
				
		//login button
		driver.findElement(By.xpath("html/body/div[3]/form/div[3]/input")).click();
		Thread.sleep(2000);
		
		//request quotation
		driver.findElement(By.xpath("html/body/div[3]/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		
		//retrieve quotation
		driver.findElement(By.xpath("html/body/div[3]/div/ul/li[3]/a")).click();
		Thread.sleep(2000);
		
		
		//profile
		driver.findElement(By.xpath("html/body/div[3]/div/ul/li[4]/a")).click();
		//Scroll Down-up
				JavascriptExecutor jsb=(JavascriptExecutor)driver;
				jsb.executeScript("window.scrollBy(250,500)", "");
				Thread.sleep(2000);
				
		//logout
		driver.findElement(By.xpath("html/body/div[3]/form/input")).click();
		

		Thread.sleep(3000);
		driver.close();
	}
}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	