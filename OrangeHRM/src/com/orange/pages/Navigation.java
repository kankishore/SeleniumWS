package com.orange.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Navigation {

	
	@FindBy(xpath="//b[.='Recruitment']")
	public WebElement recruitment;
	
	@FindBy(xpath="//a[.='Vacancies']")
	public WebElement vacancies;
	
	
}
