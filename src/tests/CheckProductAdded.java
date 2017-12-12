package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import generic.BaseTest;


public class CheckProductAdded extends BaseTest 
{
	@Test
	public void checkproduct() throws Exception
	{
		driver.findElement(By.xpath(".//*[@id='navbar']/ul/li[2]/a/span")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@ng-click='vm.addToBasket(vm.selectedProduct);'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[.='OFFERS']")).click();  //to click on 
//		driver.findElement(By.xpath("((//button[@qa='add'])[1]")).click();
//		WebElement basket = driver.findElement(By.xpath("//span[@class='basket-content']"));
//		
//		Actions act=new Actions(driver);
//		act.moveToElement(basket).click().perform();
	}

}
