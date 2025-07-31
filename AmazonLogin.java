package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fs%3Fk%3DKitchen%2BAppliances%26rh%3Dp_36%253A-5000%26dc%26_encoding%3DUTF8%26_encoding%3DUTF8%26content-id%3Damzn1.sym.1c676675-169c-43b5-84e3-6a95e93c5fec%26pd_rd_r%3Db9e76a33-52df-479b-b1c1-a3a42ef544a3%26pd_rd_w%3DJjagk%26pd_rd_wg%3DAXsit%26pf_rd_p%3D1c676675-169c-43b5-84e3-6a95e93c5fec%26pf_rd_r%3DMXMPM2S61F8GNE7MHBQB%26qid%3D1747513660%26rnid%3D386465011%26ref%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		WebElement username=  driver.findElement(By.name("email"));
		username.sendKeys("rashmi@gmali.com");
		
		WebElement cnt=  driver.findElement(By.id("continue"));//id can be unique
		cnt.click();
		
		WebElement password=  driver.findElement(By.name("password"));
		password.sendKeys("364ragdv");
		
		WebElement signin=  driver.findElement(By.id("signInSubmit"));
		signin.click();//enter also usre intstead of click

	}

}
