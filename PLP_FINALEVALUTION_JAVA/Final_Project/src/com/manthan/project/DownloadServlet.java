package com.manthan.project;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/download2")
public class DownloadServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// resp.setContentType("text/html");

		// prints text data to character stream
		PrintWriter p = resp.getWriter();
		String filename = req.getParameter("filename");
		String filepath = "D:\\Resumes\\";
		//sets the content type of the server being sent to the client
		resp.setContentType("APPLICATION/pdf");
		resp.setHeader("content-disposition", "attachment:filename=\"" + filename + "\"");
		FileInputStream f1 = new FileInputStream(filepath + filename); //read data from a file
		
		int i;
		while ((i = f1.read()) != -1)
			p.write(i);
		p.close();
		f1.close();
		
	}//end of doget method
}//end of class
