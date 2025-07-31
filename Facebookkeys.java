package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Facebookkeys {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("https://www.facebook.com");
		
		
		WebElement e1=driver1.findElement(By.id("email"));
		e1.sendKeys("987422112");
		e1.sendKeys(Keys.CONTROL+"a");
		e1.sendKeys(Keys.CONTROL+"c");
		WebElement e2=driver1.findElement(By.id("pass"));
		e2.sendKeys(Keys.CONTROL+"v");
				
		}

	
	}


