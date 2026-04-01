package com.version;



import java.io.FileNotFoundException;


import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample2 {

	public static void main(String[] args) {
		try (PrintWriter pw=new PrintWriter("D:\\Files\\Bashi.txt");
				
				){
			
			String data="Bashi is a good boy\n";
			data=data + "Bashi from karachi\n";
			data=data+"mounica is from Jammala Madugu";
			pw.write(data);
			
			
			
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}