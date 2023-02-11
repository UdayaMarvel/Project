package com.amz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

 public class AmzMobile {
	 private static final long start = 0;
	public static WebDriver driver;
	private long startTime;
	 @Test
	public void m1() {
	
	WebDriverManager.chromedriver().setup();
  
	 driver =new ChromeDriver();
	driver .get("https://www.amazon.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
}	 
	 @Test
	 public void m2() {
		 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile phone",Keys.ENTER);		
	 }
	 
	@Test
	 public void m3 () {
		 
 List<WebElement> d= driver.findElements(By.xpath("//span[contains(text(),'SAMSUNG ')]"));
     
		 for (int i = 0; i <d.size(); i++) {
			
			 WebElement x=d.get(i);
		System.out.println( x.getText());
		
		}}
		 @Test
		 
		 public void m5 () {
			driver.findElement(By.xpath(" (//span[contains(text(),'SAMSUNG')])[1] ")) .click();		
		 }
	 @Test
	public void m4() throws Exception {
		 
			  List<WebElement> d1=	 driver.findElements(By.xpath("//span[contains(text(),'SAMSUNG ')]"));
		File f= new File("C:\\Users\\ELCOT\\Desktop\\book.xlsx");
		FileInputStream h=new FileInputStream (f);
		Workbook w=new XSSFWorkbook(h);
		Sheet s=w.createSheet("mobile phone");
		for (int i = 0; i < d1.size(); i++) {
			Row cr =s.createRow(i);
			org.apache.poi.ss.usermodel.Cell cell= cr.createCell(0);
			WebElement web =d1.get(i);
			cell.setCellValue(web.getText());		
		}	
		FileOutputStream f1=new FileOutputStream(f);
		w.write(f1);
	}
	
 @Test
		 public void m6 () {
			 long startTime = System.currentTimeMillis();
 }
 @Test
			 public void m7() {
				 long end=System.currentTimeMillis();
			
				long k =end-startTime;
				 System.out.println(k);				 
			 }
		 @Test
			public void m8() {
				 driver.close();		
 }
 }
