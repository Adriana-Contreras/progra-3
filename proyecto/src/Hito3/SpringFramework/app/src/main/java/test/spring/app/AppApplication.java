package test.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import test.spring.app.servicios.serviciopersona;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {
	@Autowired
   private serviciopersona spersona;

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("spring mode consola running ");
		//spersona = new serviciopersona();
		spersona.Insertar("Adriana");
	}
}
