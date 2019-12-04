package com.manthan.project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

@WebServlet("/Upload3")
@MultipartConfig
public class UploadServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// To send files or data over to a server
		MultipartRequest mr = new MultipartRequest(req, "D:\\Resumes");
		// System.out.println("Resume Uploaded");

		// To print the msg on server
		if (mr != null) {
			req.setAttribute("msg", "Resume uploaded successfully");
		} else {
			req.setAttribute("msg", "Not uploaded");
		}
		req.getRequestDispatcher("./Upload").forward(req, resp);
	}
}