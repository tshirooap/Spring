package sample.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import sample.di.business.valueobject.Product;

@Aspect
@Component
public class MyFirstAspect {

	@Before("execution(* findProduct(String))")
	public void before() { 
		System.out.println("Before..........");
	}
	
	@After("execution(* findProduct(String))")
	public void after(){
		System.out.println("After..........");
	}
	
	@AfterReturning(value="execution(* findProduct(String)), returning=product")
	public void afterReturning(){
		System.out.println("@AfterReturnig................");
	}
	
	@Around("execution(* findProduct(String))")
	public Product around(ProceedingJoinPoint point) throws Throwable {
		System.out.println("@Around1................");
		Product product = (Product)point.proceed();
		System.out.println("@Around2................" + product.getName());
		
		return product;
	}
	
	@AfterThrowing(value="execution(* findProduct(String))", throwing="ex")
	public void afterThrowing(Throwable ex){
		System.out.println("@@AfterThrowing................");		
	}
}
