package com.akchen.liteblog.VO;

public class Lt_Blog_Category {
	private int id;
	private String owner;
	
	public Lt_Blog_Category(){}
	public Lt_Blog_Category(int id, String owner, String name) {
		super();
		this.id = id;
		this.owner = owner;
		this.name = name;
	}
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
