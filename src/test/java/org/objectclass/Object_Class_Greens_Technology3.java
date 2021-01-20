package org.objectclass;

import org.baseclassforexcel.Base_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_Class_Greens_Technology3 extends Base_Class{
	
	public Object_Class_Greens_Technology3() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='CAREERS']")
	private WebElement carrier;
	
	@FindBy(xpath="(//a[text()='contact@greenstechnologys.com'])[8]")
	private WebElement scrollDown;
	
	@FindBy(xpath="//a[@title='www.greenstechnologys.com.']")
	private WebElement emailId;

	public WebElement getCarrier() {
		return carrier;
	}

	public WebElement getScrollDown() {
		return scrollDown;
	}

	public WebElement getEmailId() {
		return emailId;
	}
	
	
	
	

}
