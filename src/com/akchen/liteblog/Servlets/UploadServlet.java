package com.akchen.liteblog.Servlets;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;







/**
 * Servlet implementation class UploadServlet
 */
@WebServlet("/UploadServlet")
public class UploadServlet extends HttpServlet {
	
	public static final String UPLOAD_PATH = "C:\\DiskUpload\\";
	private static final long serialVersionUID = 1L;
    // 上传配置
	 

    private static final int MEMORY_THRESHOLD   = 1024 * 1024 * 3;  // 3MB
    private static final int MAX_FILE_SIZE      = 1024 * 1024 * 40; // 40MB
    private static final int MAX_REQUEST_SIZE   = 1024 * 1024 * 50; // 50MB
 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/**
		 *  仅支持单文件上传
		 */
		PrintWriter out = response.getWriter(); 
		request.setCharacterEncoding("utf-8");////这句至关重要，不然中文的文件名称显示乱码 
		DiskFileItemFactory factory = new DiskFileItemFactory();  
		String uploadPath= UploadServlet.UPLOAD_PATH;
		File pathFile = new File( uploadPath);
		if(!pathFile.exists())
			pathFile.mkdirs();
		
		factory.setSizeThreshold(1024 * 1024 * 500); 
		factory.setRepository(new File(uploadPath));  
		ServletFileUpload servletFileUpload = new ServletFileUpload(factory);
		List<FileItem> list;  
	   try {
		Map<String,List<FileItem>> map = servletFileUpload.parseParameterMap(request);
		Set<String> ks = map.keySet();
		Iterator<String> it = ks.iterator();
		String fileKey = it.next();
		String tokenKey = it.next();
        list = map.get(fileKey);
       System.out.println( map.get(tokenKey).iterator().next().getString());
        FileItem fileItem =  list.get(0);
        InputStream is = fileItem.getInputStream();  
        
        //生成一个GUID名字作为该文件的文件名
        UUID uuid = UUID.randomUUID();
        String saveName = uploadPath+uuid;
        FileOutputStream output = new FileOutputStream(  new File(saveName)); 
        byte[] buf = new byte[102400]; 
        int length = 0;  
        while ((length = is.read(buf)) != -1) {  
                output.write(buf, 0, length);  
        }  
        is.close();
        output.close();
	} catch (FileUploadException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  

	}
}
