import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class fluentwaitDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Sharayu\\Downloads\\edgedriver_win64 (3)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/dynamic-properties");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
		//Fluent Wait
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		
		wait.withTimeout(3000, TimeUnit.MILLISECONDS);
		//Sepcify polling time
		wait.pollingEvery(1000, TimeUnit.MILLISECONDS);
		//Specify what exceptions to ignore
		wait.ignoring(NoSuchElementException.class);
		
		Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>()
		{
			public Boolean apply(WebDriver arg0) {
				WebElement element = arg0.findElement(By.xpath("//button[@id='visibleAfter']"));
				Boolean elementValue = element.isDisplayed();
				System.out.println(elementValue);
				if(elementValue("true"))
				{
					return true;
				}
				return false;
			}

			private boolean elementValue(String string) {
			
				return true;
			}
		};

wait.until(function);
}
}
