package com.example.Product;

public class Moduler {
	
	
	private int id;
	String name;
	
	public Moduler() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Moduler(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
