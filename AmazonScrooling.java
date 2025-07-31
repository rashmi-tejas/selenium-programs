package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonScrooling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		EdgeDriver driver=new EdgeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        WebElement science=                driver.findElement(By.linkText("Amazon Science"));
        Point p1=                science.getLocation();
        int x=                p1.getX();
        int y=                p1.getY();
        
        JavascriptExecutor js= driver;
        js.executeScript("Window.scrollBy(0,500)");
        Thread.sleep(3000);
        js.executeScript("Window.scrollBy(0,500)");
        
        
        
        
	}

}
