package com.CheckBoxRadioButton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.Helper;

public class TestCheckBoxButtonRadio {
	WebDriver driver;

	@Test
	public void Checkboxscenario() {
		driver = Helper.startBrowser("GC");
		driver.manage().window().maximize();
		driver.get("file:///C:/SDET/Radio.html");

		List<WebElement> CheckBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int chkBox_Count = CheckBox.size();
		System.out.println("Total Number of CheckBoxes:" + chkBox_Count);

		List<WebElement> Radiobutton = driver.findElements(By.xpath("//input[@type='radio']"));
		int Rdbtn_Count = Radiobutton.size();
		System.out.println("Total Number of RadioButton:" + Rdbtn_Count);

		driver.findElement(By.xpath("//input[@name='option-1']")).click();
		driver.findElement(By.xpath("//input[@name='option-1']")).click();
		driver.findElement(By.xpath("//input[@name='option-2']")).click();
		driver.findElement(By.xpath("//input[@name='option-2']")).click();
		// driver.findElement(By.xpath("//input[@name='option3']")).click();
		driver.findElement(By.xpath("//input[@name='option-3']")).click();
		driver.findElement(By.xpath("//input[@name='option-4']")).click();
		driver.findElement(By.xpath("//input[@name='option-4']")).click();
		driver.findElement(By.xpath("//input[@name='option-5']")).click();
		driver.findElement(By.xpath("//input[@name='option-5']")).click();
		driver.findElement(By.xpath("//input[@name='option-6']")).click();
		driver.findElement(By.xpath("//input[@name='option-6']")).click();
		driver.findElement(By.xpath("//input[@name='option-7']")).click();
		driver.findElement(By.xpath("//input[@name='option-7']")).click();

		driver.findElement(By.xpath("//input[@value='Programming']")).click();
		driver.findElement(By.xpath("//input[@value='Testing']")).click();
		driver.findElement(By.xpath("//input[@value='Test Automation']")).click();
		driver.quit();
	}
}
