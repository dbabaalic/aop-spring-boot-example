package com.dbabaalic.aspect.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundAspect {

	@Around("execution(* com.dbabaalic.example.service.TestService.doAround(..))")
	public void doAround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Around advice - before part");
		pjp.proceed();
		System.out.println("Around advice - after part");
	}
}
