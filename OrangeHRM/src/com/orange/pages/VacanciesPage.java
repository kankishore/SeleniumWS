package com.orange.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VacanciesPage {

	
	@FindBy(id="vacancySearch_jobTitle")
	public WebElement jobTitle;
	
	@FindBy(id="vacancySearch_hiringManager")
	public WebElement hiringManager;
	
	@FindBy(id="vacancySearch_location")
	public WebElement location;
	
	@FindBy(id="btnSrch")
	public WebElement search;
	
}	
