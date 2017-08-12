package com.dbabaalic.aspect.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterThrowingAspect {

	@AfterThrowing(pointcut = "execution(* com.dbabaalic.example.service.TestService.doThrowing(..))", throwing = "e")
	public void doThrowing(NullPointerException e) {
		System.out.println("After throwing advice applied.");
		System.out.println("Error message : " + e.getMessage());
	}
}
