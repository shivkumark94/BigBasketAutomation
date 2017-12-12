package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.BaseTest;

public class CheckSignUp extends BaseTest 
{
	@Test
	public void InvalidSignUp() throws Exception
	{
		driver.findElement(By.xpath("(//a[@href='/auth/signup/'])[1]")).click(); //to click on signup link in home page
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='Submit']")).click(); //to click on signup button in signup page
		
	}

}
