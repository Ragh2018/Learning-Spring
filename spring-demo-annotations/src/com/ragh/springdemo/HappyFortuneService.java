package com.ragh.springdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements ForturneService {

	@Override
	public String getFortune() {
		
		BufferedReader reader;
		ArrayList<String> list=new ArrayList<String>();
		int index=-1;
		try {
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
		return list.get(index);
	}

}
