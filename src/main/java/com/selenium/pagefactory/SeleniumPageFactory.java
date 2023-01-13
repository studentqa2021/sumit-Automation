package com.selenium.pagefactory;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPageFactory {

	WebDriver driver;

	public SeleniumPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	@FindBy(xpath = "//*[@id ='header_sign_in']")
//	private WebElement costcoSingInBtn;

	@FindBy(xpath = "//*[text()='Sign In / Register']")
	private List<WebElement> costcoSingInBtn;

	@FindBy(xpath = "//*[@class='sub-item']")
	private List<WebElement> dealOptions;

	@FindBy(xpath = "//*[@class='action login primary']")
	private WebElement costcoSubmitBtn;

	@FindBy(xpath = "//*[@id='navigation-widget']//a")
	private List<WebElement> costcoMenuBtn;

	@FindBy(xpath = "//*[@name='login[username]']")
	private WebElement costcoEmail;

	@FindBy(xpath = "//*[@name='login[username]']")
	private WebElement costcoPass;

	@FindBy(xpath = "//*[@class='sub-item']")
	private List<WebElement> computerSubBtn;

	public List<WebElement> getComputerSubBtn() {
		return computerSubBtn;
	}

	public List<WebElement> getCostcoSingInBtn() {
		return costcoSingInBtn;
	}

	public List<WebElement> getDealOptions() {
		return dealOptions;
	}

	public WebElement getCostcoSubmitBtn() {
		return costcoSubmitBtn;
	}

	public List<WebElement> getCostcoMenuBtn() {
		return costcoMenuBtn;
	}

	public WebElement getCostcoEmail() {
		return costcoEmail;
	}

	public WebElement getCostcoPass() {
		return costcoPass;
	}

}
