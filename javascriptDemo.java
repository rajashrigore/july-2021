import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class javascriptDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Sharayu\\Downloads\\edgedriver_win64 (3)\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		WebElement male = driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
		
		// click
		
		js.executeScript("arguments[0].click();", male);
		//WebElement submitBtn = driver.findElement(By.xpath("//button[@id='submit']"));
		
		// scroll
		//js.executeScript("arguments[0].scrollIntoView(true);", submitBtn);
		js.executeScript("window.scrollBy(0,250);");

		js.executeScript("history.go(0);");
		
		// against driver.get or driver.navigate.to()
		js.executeScript("window.location = 'https://www.facebook.com'");
		
		// page refresh 
		js.executeScript("history.go(0);");
		
		js.executeScript("alert('Happy Dasara');");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
		js.executeScript("arguments[0].style.border='3px dotted red'", Email);
		
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
		
		String url = js.executeScript("return document.URL;").toString();
		System.out.println(url);
		
		String text = js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(text);
		
		js.executeScript("document.getElementByXpath('//input[@id='email']').value='ravinangre@gmail.com';");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		js.executeScript("arguments[0].value='12345678';", password);
	}

}
