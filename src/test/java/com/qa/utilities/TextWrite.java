package com.qa.utilities;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class TextWrite {
	
	public void main (String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("C:\\Users\\Priji\\eclipse-workspace\\orangehrm\\src\\test\\resources\\textWrite.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Selenium with Java");
		bw.write("Selenium with Python");
		bw.write("Selenium with C#");
		System.out.println("Writing task is completed");
		bw.close();
	}
	
}
