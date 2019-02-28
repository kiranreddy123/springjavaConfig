package com.st.spring.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.st.spring.beans.BlackInk;
import com.st.spring.beans.FountainPen;
import com.st.spring.beans.Writer;
import com.st.spring.interfaces.Ink;
import com.st.spring.interfaces.Pen;

@Configuration
public class SpringJava_Config {

	@Bean
	public Writer writer(Pen pen) {
		return new Writer(pen);
	}

	@Bean
	public Pen FountainPen(Ink ink) {
		return new FountainPen(ink);
	}

	@Bean
	public Ink BlackInk() {
		return new BlackInk();
	}
}
