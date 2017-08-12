package com.dbabaalic.aspect.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterReturningAspect {

	@AfterReturning(pointcut = "execution(* com.dbabaalic.aspect.service.TestService.doAfterReturning(..))", returning = "result")
	public void afterReturning(String result) {
		System.out.println("After returning advice applied.");
		System.out.println("Result of method execution is : " + result);
	}
}
