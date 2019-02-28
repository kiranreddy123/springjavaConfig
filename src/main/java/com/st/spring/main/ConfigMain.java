package com.st.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.st.spring.beans.Writer;
import com.st.spring.java.config.SpringJava_Config;

public class ConfigMain {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringJava_Config.class);
		Writer writer = appContext.getBean(Writer.class);
		// Writer writer=(Writer) appContext.getBean("writer");
	}
}
