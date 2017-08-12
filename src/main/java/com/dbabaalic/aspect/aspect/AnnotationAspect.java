package com.dbabaalic.aspect.aspect;

import com.dbabaalic.aspect.annotation.SampleAnnotation;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnotationAspect {

	@After("@annotation(sampleAnnotation)")
	public void logActivityMonitor(SampleAnnotation sampleAnnotation) {
		System.out.println("ACTION = " + sampleAnnotation.action());
	}
}
