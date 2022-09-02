package org.alfredo.restdatajpa;

import org.alfredo.restdatajpa.models.Laptop;
import org.alfredo.restdatajpa.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RestDatajpaApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(RestDatajpaApplication.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop( "Lenovo", "Window 10", "Intel Core", "8gb", 20, 500000, true, true);
		Laptop laptop2 = new Laptop( "Sony", "Linux", "AMD", "16gb", 14, 900000, true, true);
		repository.save(laptop1);
		repository.save(laptop2);
	}

}
