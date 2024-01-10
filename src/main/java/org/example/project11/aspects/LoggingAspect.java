package org.example.project11.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

//    @Before("execution(public void getBook())")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получения книги");
//    }

//    @Before("execution(public void org.example.project11.UniversityLibrary.getBook())")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получения книги");
//    }

//    @Before("execution(public void get*())")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получения книги");
//    }

//    @Before("execution(public * returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
//    }

//    @Before("execution(* returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
//    }

    @Before("execution(* *())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
    }

}
