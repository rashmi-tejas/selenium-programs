package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileuploadpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.grotechminds.com/registration/");
		driver.manage().window().maximize();
		
	    WebElement e1=driver.findElement(By.linkText("file"));//file is a class check from inspect
	    e1.sendKeys("C://Us");
		
		

	}

}
