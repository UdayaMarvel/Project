package com.amz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.util.ClassUtil.Ctor;
import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amziphone {

	 public static WebDriver driver;
	 
	 @Test
	public void I1() {
	
	WebDriverManager.chromedriver().setup();
 
	 driver =new ChromeDriver();
	driver .get("https://www.amazon.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
	 @Test
	public void I2() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple iphone",Keys.ENTER);
	}
	 @Test
	public void I3() {
List<WebElement> s=	driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone')]"));
		for (int i = 0; i <s.size(); i++) {
			WebElement n=s.get(i);
			System.out.println(n.getText());
				}
		}
		@Test	
		public void I4() throws Exception {
			
			List<WebElement> s1=	driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone')]"));	
			File f=new File("C:\\Users\\ELCOT\\Desktop\\book1.xlsx");
			FileInputStream l=new FileInputStream(f);
			Workbook w=new XSSFWorkbook(l);
			Sheet n=w.createSheet("vivo phone");
			for (int j = 0; j<s1.size(); j++) {
				Row r=n.createRow(j);	
				org.apache.poi.ss.usermodel.Cell c=r.createCell(0);
				WebElement w1 =s1.get(j);
				c.setCellValue(w1.getText());
				
				
			}
		
			
		}
	
	 
	 @Test
	public void I6() {
		driver.close();
	}
}
