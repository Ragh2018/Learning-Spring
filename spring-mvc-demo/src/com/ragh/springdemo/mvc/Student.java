package com.ragh.springdemo.mvc;

import java.util.LinkedHashMap;

import javax.print.DocFlavor.STRING;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	
	private String favoriteLanguage;
	private String operatingSystems;
	
	/* 2nd way */
	// private LinkedHashMap<String, String> countryOptions;

	/*
	 * public LinkedHashMap<String, String> getCountryOptions() { return
	 * countryOptions; }
	 */

	public String getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public Student() {
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
