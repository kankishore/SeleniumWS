package com.test.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UI {

	
		
	public static void type(WebElement el, String val){
		
		//Highlight
		//Logging
		//Screenshot
		
		
		el.sendKeys(val);
	}
	
	public static void click(WebElement el){
		el.click();
	}
	
	
	public static void select(WebElement el, String val){
		Select sl=new Select(el);
		//sl.selectByValue(val);
		sl.selectByVisibleText(val);
		
	}
		
	
}
