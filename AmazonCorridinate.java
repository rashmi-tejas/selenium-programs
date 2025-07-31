package Package1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonCorridinate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EdgeDriver driver=new EdgeDriver();
		Driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement science=driver.findElement(By.linkText("Amazon Science"));
		Point p1=  science.getLocation();
		int X= p1.getX();
		int Y= p1.getY();
		System.out.println(X);
		System.out.println(Y);
		
		Dimension d1=science.getSize();
		int height=d1.getHeight();
		int Width=d1.getWidth();
		System.out.println(height);
		System.out.println(Width);
		
	}

}
