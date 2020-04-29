package com.ragh.springdemo.fortune;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	@PostConstruct
	public String getFortune() {
		
		BufferedReader reader;
		ArrayList<String> list=new ArrayList<String>();
		int index=-1;
		try {
			//Provide location of your file
			reader = new BufferedReader(new FileReader(
					"C:/Users/ragsingh/Documents/udemy/Spring & Hibernate for Beginners (includes Spring Boot)/eclipse/Learning-Spring/spring-demo-annotations/src/ServiceValue.txt"));
			String line = reader.readLine();
			while (line != null) {
				list.add(line);
				// read next line
				line = reader.readLine();
			}
			reader.close();
			Random myrandom=new Random();
			index=myrandom.nextInt(list.size());
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println(list.get(index));
		return list.get(index);
	}

}
