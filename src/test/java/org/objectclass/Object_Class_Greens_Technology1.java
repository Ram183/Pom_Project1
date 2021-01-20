package org.objectclass;

import org.baseclassforexcel.Base_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_Class_Greens_Technology1 extends Base_Class{

	public Object_Class_Greens_Technology1() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Certifications']")
	private WebElement certificate;
	
	@FindBy(xpath="(//a[text()='Course Content'])[29]")
	private WebElement courseContent;
	
	@FindBy(xpath="//a[text()='TESTIMONIALS']")
	private WebElement testimonials;
	
	@FindBy(xpath="//h2[text()='Selenium Training in Chennai']")
	private WebElement title;
	

	public WebElement getCertificate() {
		return certificate;
	}

	public WebElement getCourseContent() {
		return courseContent;
	}

	public WebElement getTestimonials() {
		return testimonials;
	}

	public WebElement getTitle() {
		return title;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
