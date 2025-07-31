package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement e1=driver.findElement(By.tagName("button"));
		e1.click();
		
	}

}
