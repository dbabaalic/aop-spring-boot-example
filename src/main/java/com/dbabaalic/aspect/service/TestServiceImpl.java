package com.dbabaalic.aspect.service;

import com.dbabaalic.aspect.annotation.SampleAnnotation;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

	public void doBefore(String arg1, boolean arg2) {
		System.out.println("Inside target method.");
	}
	
	public void doAfter() {
		System.out.println("Inside target method.");
	}

	public String doAfterReturning() {
		System.out.println("Inside target method.");
		return "sample String object";
	}
	
	public void doThrowing() throws Exception {
		System.out.println("Inside target method.");
		throw new NullPointerException("NullPointerException happened.");
	}

	public void doAround() {
		System.out.println("Inside target method.");
	}
	
	@SampleAnnotation(action = "sample action")
	public void annotationMethod() {
		System.out.println("Inside target method.");
	}

}
