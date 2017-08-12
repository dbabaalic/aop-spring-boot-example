package com.dbabaalic.aspect.service;

public interface TestService {

	void doBefore(String arg1, boolean arg2);

	void annotationMethod();

	void doAfter();

	void doAround();

	String doAfterReturning();

	void doThrowing() throws Exception;

}
