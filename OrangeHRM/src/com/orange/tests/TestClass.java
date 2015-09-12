package com.orange.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.orange.pages.LoginPage;
import com.orange.pages.Navigation;
import com.orange.pages.VacanciesPage;
import com.test.framework.UI;


public class TestClass {

	@Test(priority=1)
	public void test1(){
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://enterprise.demo.orangehrmlive.com/auth/login");
		driver.manage().window().maximize();
		
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		
		UI.type(lp.userName, "Admin");
		UI.type(lp.password, "admin");
		
		UI.click(lp.login);
		
		Navigation np=PageFactory.initElements(driver, Navigation.class);
		UI.click(np.recruitment);
		UI.click(np.vacancies);
		
		VacanciesPage vp=PageFactory.initElements(driver, VacanciesPage.class);
		UI.select(vp.jobTitle, "Software Engineer");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		UI.select(vp.hiringManager, "Lisa Smith");
		UI.select(vp.location, "Indian Development Center");
		
		UI.click(vp.search);
	}
	
}
