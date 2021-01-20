package org.testcaseclass;

import org.baseclassforexcel.Base_Class;
import org.objectclass.Object_Class_Greens_Technology3;

public class FrameWork_POM_Greens_Technology3  extends Base_Class{

	public static void main(String[] args) {

		chromeBrowser("http://www.greenstechnologys.com/java-training-course-content.html");
		
		maximize();
		
		implictWait();
		
		Object_Class_Greens_Technology3 ob= new Object_Class_Greens_Technology3();
		
		clickButton(ob.getCarrier());
		
		scrollDown(ob.getScrollDown());
		
		getText(ob.getEmailId());
		
		
	}

}
