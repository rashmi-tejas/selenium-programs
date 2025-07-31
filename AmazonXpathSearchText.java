package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpathSearchText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("(//path)[5]"));
		
		e1.sendKeys("toys"+Keys.ENTER);//check the product its is opening or not

	}

}
