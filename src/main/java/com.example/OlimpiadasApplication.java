package com.example;

import com.example.service.OlimpiadasService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OlimpiadasApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(OlimpiadasApplication.class, args);
		OlimpiadasService olimpiadasService=context.getBean(OlimpiadasService.class);


// Esta es la funcion donde ira toda la chicha dentro del Service
		olimpiadasService.crearCosas();
	}
}
