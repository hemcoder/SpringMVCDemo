package com.genpact.ds.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = FatherValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidFather {
	
	String listOfValidFathers() default "Arun|Jay|Vinod";

	String message() default "Pleae provide a valid Father's name,"+
			" accepted names are: Arun, Jay, Vinod";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
