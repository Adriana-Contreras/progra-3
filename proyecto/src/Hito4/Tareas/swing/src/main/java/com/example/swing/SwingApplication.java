package com.example.swing;

import com.example.swing.Repository.ButtonRepository;
import com.example.swing.Service.AlphabetService;
import com.example.swing.Service.ButtonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SwingApplication  {
	@Autowired
	private ButtonService buttonService;
	@Autowired
	private AlphabetService alphabetService;

	public static void main(String[] args) {
		//conmadLineRunner para modo consola
		//SpringApplication.run(SwingApplication.class, args); //para modo web
		SpringApplicationBuilder springApp = new SpringApplicationBuilder(SwingApplication.class);
		springApp.headless(false);
		springApp.run(args);

	}



	//para que este metodo se ejecute despues del constructor
	@PostConstruct
	public void InsertDataBase(){
		buttonService.saveData();
		alphabetService.saveData();


	}


}
