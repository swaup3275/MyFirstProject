package com.example.firstProject;

import org.springframework.stereotype.Component;

//@component says that in spring container we have a object of laptop.class type
//but how does the Alien class know that it has it. so we have to connect.


@Component
public class Laptop {
	
	private int lid;
	private String breand;
	
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBreand() {
		return breand;
	}
	public void setBreand(String breand) {
		this.breand = breand;
	}
	
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", breand=" + breand + "]";
	}
	
	public void compile() {
		System.out.println("compiling or what?");
	}
	

}
