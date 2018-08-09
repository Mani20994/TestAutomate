
import java.io.IOException;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class school_demo_student {

		public static void main(String arg[]) throws InterruptedException, IOException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://school.demo.moodle.net/");
			
			//login button
			driver.findElement(By.xpath("html/body/div[1]/nav/ul[2]/li[2]/div/span/a")).click();
			//username
			driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/section/div/div[2]/div/div/div/div/div/div[1]/form/div[1]/input")).sendKeys("student");
			//password
			driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/section/div/div[2]/div/div/div/div/div/div[1]/form/div[2]/input")).sendKeys("moodle");
			//login button
			driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/section/div/div[2]/div/div/div/div/div/div[1]/form/button")).click();
			//dashboard
			driver.findElement(By.xpath("html/body/div[2]/div[3]/nav/a[1]")).click();
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,2500)");
			System.out.println("scrolled Down");
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(2500,-2500)");
			System.out.println("scrolled up");
			
			
		/*	//site home
			driver.findElement(By.xpath("html/body/div[2]/div[3]/nav/a[2]/div/div/span[2]")).click();
			//go to courses
			driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/section/div/div/div/div/div/div/div[2]/div/div[2]/p[2]/a")).click();
			//art and media
			driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/section/div/div/div/div[1]/div[2]/div/div[1]/div[1]/h3/a")).click();
			//again dashboard
			driver.findElement(By.xpath("html/body/div[1]/div[2]/header/div/div/div/div[2]/div[1]/nav/ol/li[1]/a")).click();
			//3 lines
			driver.findElement(By.xpath("html/body/div[2]/nav/div/button")).click();
			//calender
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/nav/a[3]/div/div/span[2]")).click();
			//log out
			driver.findElement(By.xpath("html/body/div[2]/nav/ul[2]/li[2]/div/div/div/div/div/a")).click();
			//log out button
			driver.findElement(By.xpath("html/body/div[2]/nav/ul[2]/li[2]/div/div/div/div/div/div/a[6]")).click();*/
		

	}
}