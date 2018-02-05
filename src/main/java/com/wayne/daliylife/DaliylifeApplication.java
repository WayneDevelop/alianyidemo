package com.wayne.daliylife;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@ComponentScan("com.wayne.*.*")
public class DaliylifeApplication {



	public static void main(String[] args) {
		SpringApplication.run(DaliylifeApplication.class, args);
	}


}
