package org.testcaseclass;

import org.baseclassforexcel.Base_Class;
import org.objectclass.Object_Class_Greens_Technology4;

public class FrameWork_POM_Greens_Technology4 extends Base_Class {

	public static void main(String[] args) {

		chromeBrowser("http://www.greenstechnologys.com/java-training-course-content.html");

		maximize();

		implictWait();

		Object_Class_Greens_Technology4 ob = new Object_Class_Greens_Technology4();

		clickButton(ob.getTestimonials());

		getText(ob.getPhoneNo());

		scrollDown(ob.getScrollDown());

		getText(ob.getText());
		
		scrollup(ob.getScrollUp());
		
		javaScriptClick(ob.getContactUs());

		getText(ob.getText1());
		
		scrollDown(ob.getCopytext());
		
		getText(ob.getCopytext());
		
	}

}
