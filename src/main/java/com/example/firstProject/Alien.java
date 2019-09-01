package com.example.firstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")



public class Alien {
	
	public Alien() {
		super();
		System.out.println("object created");
		
		
	}

	private String name;
	private String tech;
	private int aid;
	
	
	@Autowired
	private Laptop laptop;
	//but there's no object of laptop using new right? alas.
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	public void show() {
		System.out.println("in show");
		laptop.compile();
	}
	
	

}
