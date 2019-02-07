package com.EmbededH2DataBaseExample.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootEmbededH2DataBaseDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmbededH2DataBaseDemo1Application.class, args);
		
		System.out.println("Hello SpringBootEmbededH2DataBaseDemo1Application");
		
//		1. While Creating Project, choose Two "Available:" things i)web  &  ii)H2(under SQL)
//		2. Add tomcat-jasper to support JSP in pom.xml
		
	}

}

