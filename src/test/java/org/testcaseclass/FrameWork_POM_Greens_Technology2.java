package org.testcaseclass;

import org.baseclassforexcel.Base_Class;
import org.objectclass.Object_Class_Greens_Technology2;

public class FrameWork_POM_Greens_Technology2 extends Base_Class {

	public static void main(String[] args) {

		chromeBrowser("http://www.greenstechnologys.com/");

		maximize();

		implictWait();

		Object_Class_Greens_Technology2 ob = new Object_Class_Greens_Technology2();

		mousehOver(ob.getCourses());

		mousehOver(ob.getJavaTraining());

		mousehOver(ob.getCoureJavaTraining());

		mousehClick(ob.getCoureJavaTraining());

		scrollDown(ob.getScrollDown());

		getText(ob.getPrintValue());

	}

}
