package com.dbabaalic.aspect.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class BeforeAspect {
	
	@Pointcut("execution(* com.dbabaalic.aspect.service.TestService.doBefore(..))")
	public void before() {
	}

	@Before("before()")
	public void printBeforeAll(JoinPoint joinPoint) {
		System.out.println("Before advice applied.");
		System.out.println("Method signiture : " + joinPoint.getSignature().getName());
		System.out.println("Arguments : " + Arrays.toString(joinPoint.getArgs()));
	}
	
}
