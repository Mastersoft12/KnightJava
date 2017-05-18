package com.SpringTutorial;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Auditoria {
	
	@Pointcut("execution(* com.SpringTutorial.BraveKnight.embarkOnQuest(..))")
	public void businessService() {}  // signature
	
	@Before("businessService()")
	public void iniciarCancion(){
		System.out.println("Inicia la cancion... Prueba de commit ");
	}
	
	@After("businessService()")
	  public void terminarCancion(){
			System.out.println("finaliza la cancion...");
		}
}
