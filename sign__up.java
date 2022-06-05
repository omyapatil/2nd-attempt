package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sign__up
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mindsdet140\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nobroker.in/?ef_id=EAIaIQobChMIt_rxgY-T-AIVDDErCh0uYww2EAAYASAAEgKt_vD_BwE:G:s&AL!5425!3!385439544133!e!!g!!nobroker!650219745!32123275349&gclid=EAIaIQobChMIt_rxgY-T-AIVDDErCh0uYww2EAAYASAAEgKt_vD_BwE");
  driver.findElement(By.xpath("//*[@id=\"navHeader\"]/div[5]/div[2]/div[1]/div")).click();
  driver.findElement(By.xpath("//*[@id=\"signUp-phoneNumber\"]")).sendKeys("9075407173");
  driver.findElement(By.xpath("//*[@id=\"login-signup-form\"]/div[4]/label[2]")).click();
  driver.findElement(By.xpath("//*[@id=\"login-signup-form__password-input\"]")).sendKeys("00117275"); 
   driver.findElement(By.xpath("//*[@id=\"signUpSubmit\"]")).click();
	driver.close();
}

}
