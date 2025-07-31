package Package1;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHoverover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		//WebElement e1=driver.findElement(By.xpath("//path[.=='prime']"));//e1 is a prime component
		WebElement e1=driver.findElement(By.xpath("//span[@class='nav-line-2']"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		
		}

}
