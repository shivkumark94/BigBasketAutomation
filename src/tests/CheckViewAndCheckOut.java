package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import generic.BaseTest;

public class CheckViewAndCheckOut extends BaseTest
{
	@Test
	public void viewAndCheckout() throws InterruptedException
	{
		driver.findElement(By.xpath("(//button[@qa='add'])[1]")).click(); //to add any product to mybasket
		Thread.sleep(2000);
		
		WebElement myBasketIcon = driver.findElement(By.xpath("//span[@class='basket-content']")); //to get mybasket
		Actions act=new Actions(driver);
		act.moveToElement(myBasketIcon);   //to mousehover on mybasket
		
		
		driver.findElement(By.xpath("//button[@ng-click='vm.goToBasketPage(vm.cart.cart_no_items);']")).click(); //to click on view and checkout button
		
		
		
	}

}
