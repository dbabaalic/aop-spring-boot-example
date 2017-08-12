package com.dbabaalic.aspect.controller;

import com.dbabaalic.aspect.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	private final TestService testService;
	
	@Autowired
	public TestController (TestService testService){
		this.testService = testService;
	}
	
	@RequestMapping(value="/before")
	public void before(){
		testService.doBefore("arg1", false);
	}

	@RequestMapping(value="/after")
	public void testAfter() {
		testService.doSomethingAfter();
	}
	
	@RequestMapping(value="/afterReturning")
	public void testAfterReturning() {
		testService.doAfterReturning();
	}

	@RequestMapping(value="/afterThrowing")
	public void testAfterThrowing() throws Exception { testService.doThrowing(); }
	
	@RequestMapping(value="/around")
	public void testAround() {
		testService.doAround();
	}
	
	@RequestMapping(value="/annotation")
	public void testAnnotation() {
		testService.annotationMethod();
	}
}
