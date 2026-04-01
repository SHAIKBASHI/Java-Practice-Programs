package com.version;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		try (FileWriter writer = new FileWriter("D:\\Files\\Mounica.txt");){
			String data = "Mounika is a good girl\n";
			data =data+ "Mounika like bobbatulu\n";
			data = data+"Mounika from Bihar";
			writer.write(data);
			int ch = 0;
			
			}
		
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}
