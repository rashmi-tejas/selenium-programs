package Package1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Amazonaddtokart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		WebElement searchf=driver.findElement(By.id("twoabsearchtextbox)"));
		searchf.sendKeys("shoes"+Keys.ENTER);
		
		WebElement e2=driver.findElement(By.xpath("//a[@class='-link-bormal s-no-outline'])[1]"));
		e2.click();
		Set<String> pcid=driver.getWindowHandles();
		System.out.println(pcid);
		
		Iterator<String> pc=pcid.iterator();
		String parentid=pc.next();
		String childid=pc.next();
		driver.switchTo().window(childid);//moving the control from parent window to child window
		
		WebElement e3=driver.findElement(By.id("add-to-cart-button)"));
		e3.click();*/
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount");
		driver.manage().window().maximize();
		WebElement googlelink=driver.findElement(By.xpath("//span[text()='Google']"));
		googlelink.click();
		//searchf.sendKeys("shoes"+Keys.ENTER);
		
		//WebElement e2=driver.findElement(By.xpath("//a[@class='-link-bormal s-no-outline'])[1]"));
		//e2.click();
		Set<String> pcid=driver.getWindowHandles();
		System.out.println(pcid);
		//driver.close();//only child windowis show
		
		Iterator<String> pc=pcid.iterator();
		String parentid=pc.next();
		String childid=pc.next();
		driver.switchTo().window(childid);
		//moving the control from parent window to child window
	    driver.close();	//child is closed
		//WebElement e3=driver.findElement(By.id("add-to-cart-button)"));
		//e3.click();
		

	
	}

}
