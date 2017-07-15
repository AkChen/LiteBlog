package com.akchen.liteblog.VO;

public class Lt_Attachment {
	private int id;
	private String guid;
	private int blog_id;
	
	public final static String LT_ATTACHMENT_ROOT_PATH = "C:/LiteBlog/Attachments/";
	public Lt_Attachment(){};
	public Lt_Attachment(int id, String guid, int blog_id) {
		super();
		this.id = id;
		this.guid = guid;
		this.blog_id = blog_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public int getBlog_id() {
		return blog_id;
	}
	public void setBlog_id(int blog_id) {
		this.blog_id = blog_id;
	}

}
