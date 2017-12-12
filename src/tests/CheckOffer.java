package tests;

//import java.io.File;
//import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.support.events.EventFiringWebDriver;



import generic.BaseTest;

public class CheckOffer extends BaseTest
{
	@Test
	public void clickOnOffers() throws Exception
	{
		//Thread.sleep(2000);
		//driver.navigate();
		driver.findElement(By.xpath("//span[.='OFFERS']")).click(); 
		//to click on offers module
		driver.findElement(By.xpath("(//span[.='BB EXPRESS'])[2]")).click();
		
		/*//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("((//button[@qa='add'])[1]")).click(); //to click on banners
		Thread.sleep(2000);
		//to add product to basket under that banner
		driver.findElement(By.xpath("(//button[@ng-click='vm.addToBasket(vm.selectedProduct);'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='hidden-xs hidden-sm'])[2]")).click(); //to add product to the basket
		
		//eventfiringwebdriver is a class that implements takesscreenshot to take screen shot
		EventFiringWebDriver r=new EventFiringWebDriver(driver);  
		File src = r.getScreenshotAs(OutputType.FILE);
		File dst = new File("./abc.png");
		org.apache.commons.io.FileUtils.copyFile(src, dst);
		r.close();*/
		
	}
}
