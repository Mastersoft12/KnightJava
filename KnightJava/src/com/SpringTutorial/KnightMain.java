package com.SpringTutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KnightMain {

	public static void main(String[] args) {
		
		   ApplicationContext ctx = new AnnotationConfigApplicationContext(KnightConfig.class);
		   Knight knight = ctx.getBean(Knight.class);
		   knight.embarkOnQuest();


	}

}
