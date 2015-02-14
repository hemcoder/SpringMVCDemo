package com.genpact.ds.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FatherValidator implements ConstraintValidator<IsValidFather, String> {

	private String listOfValidFathers;
	
	@Override
	public void initialize(IsValidFather isValidFather) {

		this.listOfValidFathers=isValidFather.listOfValidFathers();
	}

	@Override
	public boolean isValid(String fatherName, ConstraintValidatorContext context) {
		if(fatherName==null){
			return false;
		}
		
		if(fatherName.matches(listOfValidFathers)){
			return true;
		}else{
			return false;
		}
	}

	
}
