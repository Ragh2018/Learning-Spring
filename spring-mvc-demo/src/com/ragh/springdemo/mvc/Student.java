package com.ragh.springdemo.mvc;

import java.util.LinkedHashMap;


public class Student {

	private String firstName;
	private String lastName;
	private String country;
	/* 2nd way */
	//private LinkedHashMap<String, String> countryOptions;

	/*
	 * public LinkedHashMap<String, String> getCountryOptions() { return
	 * countryOptions; }
	 */

	public Student()
	{
		/* 2nd way */
		/*
		 * countryOptions=new LinkedHashMap<String, String>();
		 * countryOptions.put("BR","Brazil"); countryOptions.put("IN","India");
		 * countryOptions.put("FR","France"); countryOptions.put("GE","Germany");
		 * countryOptions.put("US","United state");
		 */
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
