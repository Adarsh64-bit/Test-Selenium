import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automatation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh\\Desktop\\Selenium Dep\\exeFiles\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/railways/");
		
		//checking for correct web page
		String URL = driver.getCurrentUrl();
		if(URL.contains("https://www.makemytrip.com/railways/"))
		{
	        System.out.println("The driver is in correct page");
		}
	    else {
	          System.out.println("The driver is in not correct page");
	    }
		
		// print Title and URL of the page
		System.out.println(driver.getTitle());     
		System.out.println(driver.getCurrentUrl());
		
		// Functioning
		    driver.findElement(By.xpath("//span[contains(text(),'From')]")).click();
		    Thread.sleep(3000);
		   driver.findElement(By.xpath("//span[contains(text(),'From')]")).sendKeys("Delhi");
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//span[contains(text(),'To')] ")).click();
		    driver.findElement(By.xpath("//span[contains(text(),'To')]")).sendKeys("Lucknow");
		    Thread.sleep(3000);
	        driver.findElement(By.xpath("//input[@id='travelDate']")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//div[@class=\"DayPicker-Day\"][contains(@aria-label, 'May 12 2022')]")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//span[contains(text(),'Class')]")).click();
		   driver.findElement(By.xpath("//span[contains(text(),'Class')]")).sendKeys("3AC");
		   
		   Thread.sleep(3000);
}

}



