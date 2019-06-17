package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import com.app.repo.ProductRepsitory;

@Component
public class ConsoleRunner implements CommandLineRunner{

	@Autowired
	private ProductRepsitory repo;


	@Override
	public void run(String... args) throws Exception {
	repo.getNewData(1, 3.3).forEach(System.out::println);
	
	repo.getCostOnly().forEach(System.out::println);
	
repo.getInfo().forEach(System.out::println);

repo.getNewData(1, 5.5).forEach(System.out::println);

repo.getMyDataName(5, 6.6).forEach(System.out::println);
	}

	
}
