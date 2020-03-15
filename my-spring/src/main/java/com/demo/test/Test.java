package com.demo.test;


import com.demo.app.AppConfig;
import com.demo.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		TestService service = context.getBean(TestService.class);
		service.service();
	}

}
