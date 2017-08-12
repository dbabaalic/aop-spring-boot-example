package com.dbabaalic.aspect.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SampleAnnotation {

	public String action() default "";

}
