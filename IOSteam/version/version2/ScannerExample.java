package com.version2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		File file=new File("D:\\Files\\Bashi.txt");
		try(Scanner scanner=new Scanner(file);) {
			
				while(scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
				
			
		}
		}
		   catch(FileNotFoundException e) {
			   System.out.println(e);
		   }
		   catch(IOException e) {
			   System.out.println(e);
		   }
			
		
	}

}
