package org.example.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    //Создание поинт-ката и указание на получение всех методов get
    @Pointcut("execution(* get*())")
    private void allGetMethods(){}

    //Создание Advice для поинт-ката
    @Before("allGetMethods()")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: попытка получить книгу");
    }
}
