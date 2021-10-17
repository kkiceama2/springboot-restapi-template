package com.example.demo.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogConfig {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

  @Around("within(com.example.demo.controller.*))") 
  public Object logging(ProceedingJoinPoint pjp) throws Throwable { 
	
	String controllerName = pjp.getSignature().getDeclaringType().getSimpleName();
	String methodName = pjp.getSignature().getName();

    long startAt = System.currentTimeMillis();
    log.info("-----------> REQUEST : {}({})", pjp.getSignature().getDeclaringTypeName(), pjp.getSignature().getName());

    Object result = pjp.proceed();

    long endAt = System.currentTimeMillis();

    log.info("-----------> RESPONSE : {}({}) = {} ({}ms)", pjp.getSignature().getDeclaringTypeName(), pjp.getSignature().getName(), result, endAt - startAt);

    return result;
  }
}
