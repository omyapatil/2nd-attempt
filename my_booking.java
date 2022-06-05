package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class my_booking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\mindsdet140\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://backend.nobroker.in/");
		driver.findElement(By.xpath("//*[@id=\"myBooking\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"navHeader\"]/div[5]/div[2]/div[1]/div")).click();
		  driver.findElement(By.xpath("//*[@id=\"signUp-phoneNumber\"]")).sendKeys("9075407173");
		  driver.findElement(By.xpath("//*[@id=\"login-signup-form\"]/div[4]/label[2]")).click();
		  driver.findElement(By.xpath("//*[@id=\"login-signup-form__password-input\"]")).sendKeys("omkar@1999"); 
		   driver.findElement(By.xpath("//*[@id=\"signUpSubmit\"]")).click();
		  
		 
				driver.quit();
	}

}