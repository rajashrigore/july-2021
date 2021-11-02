import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Sharayu\\Downloads\\edgedriver_win64 (3)\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='close-fixedban']")).click();
		WebElement FirstName = driver.findElement(By.xpath("//input[@id='firstName']"));

		Actions actions = new Actions(driver);
	    actions.keyDown(Keys.SHIFT);
		actions.sendKeys(FirstName, "ravi");
		actions.keyUp(Keys.SHIFT);
		actions.build().perform();
		
		WebElement ChooseFile= driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		actions.moveToElement(ChooseFile).build().perform();
		WebElement Sports =driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));

		actions.click(Sports).perform();
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click()", Sports);
		
		driver.navigate().to("https://demoqa.com/buttons");
		WebElement doubleClickBtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement RightClickBtn = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		WebElement DynamicClick = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		actions.doubleClick(doubleClickBtn).perform();
		actions.contextClick(RightClickBtn).perform();
		actions.click(DynamicClick).perform();
		
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement Source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Target = driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div[@id='droppable']"));
		actions.dragAndDrop(Source, Target).build().perform();
		
		driver.navigate().to("https://demoqa.com/menu/");
		WebElement MainItem2 = driver.findElement(By.xpath("//a[contains(text(),'Main Item 2')]"));
		actions.moveToElement(MainItem2).perform();
		WebElement SubSubList = driver.findElement(By.xpath("//a[contains(text(),'SUB SUB LIST »')]"));
		actions.moveToElement(SubSubList).perform();
		
		driver.navigate().to("https://demoqa.com/tool-tips");
		WebElement toolTipBtn = driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		actions.moveToElement(toolTipBtn).perform();
		String toolTipText = driver.findElement(By.xpath("//div[@id='buttonToolTip']")).getText();
		System.out.println(toolTipText);
		
		WebElement contraty = driver.findElement(By.xpath("//a[text()='Contrary']"));
		actions.moveToElement(contraty).perform();
		String contraryText = driver.findElement(By.xpath("//div[@id='contraryTexToolTip']")).getText();
		System.out.println(contraryText);
		
		driver.navigate().to("https://demoqa.com/text-box");
		WebElement username =driver.findElement(By.xpath("//input[@id='userName']"));
		actions.sendKeys(username, "Ravi Nangare").perform();
		actions.sendKeys(Keys.TAB);
		actions.sendKeys("ravinangre@gmail.com").build().perform();
		actions.sendKeys(Keys.TAB);
		actions.sendKeys("At Post Lokhandi Sawargaon").build().perform();
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("a");
		actions.keyUp(Keys.CONTROL).build().perform();
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("c");
		actions.keyUp(Keys.CONTROL).build().perform();
		actions.sendKeys(Keys.TAB);
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("v");
		actions.keyUp(Keys.CONTROL).build().perform();
		actions.sendKeys(Keys.TAB);
		WebElement submitBtn = driver.findElement(By.xpath("//button[@id='submit']"));
		actions.click(submitBtn).build().perform();
		
	}
}
