package com.genpact.ds.annotation;

import java.beans.PropertyEditorSupport;

public class CustomStudentName extends PropertyEditorSupport {

	@Override
	public void setAsText(String studentName) throws IllegalArgumentException {
		if(studentName.contains("Mr.")||studentName.contains("Ms.")||studentName.contains("Mrs.")){
			setValue(studentName);
		}else{
			studentName="Ms. "+studentName;
			setValue(studentName);
		}
	}

	
}
