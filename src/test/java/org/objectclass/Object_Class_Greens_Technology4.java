package org.objectclass;

import org.baseclassforexcel.Base_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_Class_Greens_Technology4 extends Base_Class {

	public Object_Class_Greens_Technology4() {

	
	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//a[text()='TESTIMONIALS']")
	private WebElement testimonials;
	
	@FindBy(xpath="//div[text()='Sekhar C (Infosys, Chennai)']")
	private WebElement scrollDown;
	
	@FindBy(xpath="(//li[text()='+91 8939 915 577 /'])[1]")
	private WebElement phoneNo;
	
	@FindBy(xpath="//p[contains(text(),'around')]")
	private WebElement text;
	
	
	
	@FindBy(xpath="//div[@class='bright-pre-header bright-pre-header-mobile-disable']")
	private WebElement scrollUp;
	
	@FindBy(xpath="(//a[text()='Contact Us'])[2]")
	private WebElement contactUs;
	
	@FindBy(xpath="//h3[@class='title divider-3']")
	private WebElement text1;
	
	@FindBy(xpath="//p[contains(text(),'Copyright')]")
	private WebElement copytext;
	
	
	
	public WebElement getTestimonials() {
		return testimonials;
	}

	public WebElement getScrollDown() {
		return scrollDown;
	}

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	public WebElement getText() {
		return text;
	}

	public WebElement getScrollUp() {
		return scrollUp;
	}

	public WebElement getContactUs() {
		return contactUs;
	}

	public WebElement getText1() {
		return text1;
	}

	public WebElement getCopytext() {
		return copytext;
	}
	
}
