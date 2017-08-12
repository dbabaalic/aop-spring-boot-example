package com.dbabaalic.aspect.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterAspect {

	@Pointcut("execution(* com.dbabaalic.aspect.service.TestService.doAfter(..))")
	private void doAfterPointcut() {
	}

	@After("doAfterPointcut()")
	public void doAfter() {
		System.out.println("After advice applied.");
	}
}
