package com.akchen.liteblog.VO;

public class Lt_Blog {
	private int id;
	private String owner;
	private String guid;
	private boolean is_public;
	private int    category_id;
	
	public Lt_Blog(){}
	public Lt_Blog(int id, String owner, String guid, boolean is_public, int category_id) {
		super();
		this.id = id;
		this.owner = owner;
		this.guid = guid;
		this.is_public = is_public;
		this.category_id = category_id;
	}
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
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public boolean isIs_public() {
		return is_public;
	}
	public void setIs_public(boolean is_public) {
		this.is_public = is_public;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
}
