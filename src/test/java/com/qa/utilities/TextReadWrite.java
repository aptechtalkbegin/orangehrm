package com.qa.utilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextReadWrite {


	//Approach-1 FileReader and BufferedReader classes
	public void textReadOne() throws IOException
	{
		FileReader fr = new FileReader("C:\\Users\\Priji\\eclipse-workspace\\orangehrm\\src\\test\\resources\\textRead.txt");
		BufferedReader br= new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
			br.close();
	}
	
	//Approach-2 using scanner and file classes

	public void textReadTwo() throws FileNotFoundException
	{
		File file= new File("user.dir"+"\\eclipse-workspace\\orangehrm\\src\\test\\resources\\textRead.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
	
	}
	
	
	//Approach-1 Writing into a text file using FileWriter and BufferedWriter classes

		public void textWrite() throws IOException
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

