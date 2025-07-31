package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonproductclicking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		WebElement searchf=driver.findElement(By.xpath("(twotabsearchtextbox"));
		
		//check the product its is opening or not
   searchf.sendKeys("shoes"+Keys.ENTER);
   
   
   WebElement e2=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'](1)"));//Launchamzon-search a product-click on 1st product
	
	e2.click();


	}

}
