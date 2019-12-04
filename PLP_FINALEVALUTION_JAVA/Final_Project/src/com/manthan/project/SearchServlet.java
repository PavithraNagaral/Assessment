package com.manthan.project;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

@WebServlet("/search2")
public class SearchServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// create array list containing all files where search value is found
		ArrayList<File> filearray = new ArrayList<File>();

		// Taking the path of files
		File f = new File("D:\\Resumes");

		// getting the word for search
		String s = req.getParameter("search");

		// checking the directory
		if (f.exists() && f.isDirectory()) {
			File arg[] = f.listFiles();

			// loop to search a word in all file
			for (File file : arg) {
				if (file.isFile()) {
					try {
						PDDocument doc = PDDocument.load(file); // load an existing pdf document
						PDFTextStripper pdfStrippper = new PDFTextStripper(); // retrive data from pdf
						String s1 = pdfStrippper.getText(doc);

						String s2 = s1.replace("\n", " ").replace("\r", " "); // replace line breaks and space in a string
																				
						if (s2.contains(s)) {
							// System.out.println(file);
							filearray.add(file);
						 }
					  } catch (Exception e) {
					}
				}
			}//end of for loop
        }//end of if
		
		req.setAttribute("filearr", filearray);
		req.getRequestDispatcher("./search").forward(req, resp);
		
	}//end of doget method
}//end of class