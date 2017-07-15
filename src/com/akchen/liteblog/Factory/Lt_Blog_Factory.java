package com.akchen.liteblog.Factory;

import com.akchen.liteblog.VO.Lt_Blog;

public class Lt_Blog_Factory {
	public static Lt_Blog createBlog(){
		return new Lt_Blog();
	}
}
