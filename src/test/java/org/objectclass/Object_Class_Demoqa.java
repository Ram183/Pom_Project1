package org.objectclass;

import org.baseclassforexcel.Base_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_Class_Demoqa extends Base_Class{

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}

	public Object_Class_Demoqa() {

		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="firstName")
	private WebElement firstName;
	
	@FindBy(id="lastName")
	private WebElement lastName;
	
	@FindBy(id="userEmail")
	private WebElement email;
	
	@FindBy(xpath="(//label[@class='custom-control-label'])[1]")
	private WebElement gender;
	
	@FindBy(id="userNumber")
	private WebElement mobileNumber;
	
	@FindBy(id="subjectsContainer")
	private WebElement subjects;

	@FindBy(xpath="(//label[@class='custom-control-label'])[4]")
	private WebElement hobbies;
	
	@FindBy(id="currentAddress")
	private WebElement currentAddress;
	
	@FindBy(id="state")
	private WebElement state;
	
	@FindBy(xpath="//button[@id='submit']")
	private WebElement submit;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	public WebElement getSubjects() {
		return subjects;
	}

	public WebElement getHobbies() {
		return hobbies;
	}

	public WebElement getCurrentAddress() {
		return currentAddress;
	}

	public WebElement getState() {
		return state;
	}










}
