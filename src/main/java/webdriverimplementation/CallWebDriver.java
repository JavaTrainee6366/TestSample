package webdriverimplementation;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class CallWebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.gecko.driver","D:/geckodriver.exe");
				//WebDriver driver = new FirefoxDriver();
				System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				
				
				Actions action = new Actions(driver);
				driver.get("https://www.facebook.com/login/");
				driver.findElement(By.id("email")).sendKeys("sipikasaini@gmail.com");
				driver.findElement(By.id("pass")).sendKeys("seep13taunk*12");
				driver.findElement(By.id("loginbutton")).click();
				//action.moveToElement(driver.findElement(By.id("loginbutton"))).click();
				//driver.close(); //will only close the first window opened by webdriver
				//driver.quit(); //will quit all the associative windows
				
				//css selectors
				//Class name ==> tagname.classname--> Button.signInBtn
				// Id -> tagname#id --> input#inputUsername
				//Tagname[attribute='value']
				
				
				System.out.println(driver.findElement(By.cssSelector("div._9ay7")).getText());
				driver.findElement(By.linkText("Forgotten password?")).click();
				
				//XPath
				//    //tagname[@attribute = 'value']
				
				driver.findElement(By.xpath("//button[@name=\"reset_action\"]")).click();
				
				driver.close();
	}

}
