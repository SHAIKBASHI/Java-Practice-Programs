package com.version;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		try (FileOutputStream fos=new FileOutputStream("D:\\Files\\Neha.txt");
				DataOutputStream dos=new DataOutputStream(fos);
				){
			
			String data="Neha is a good girl\n";
			data=data + "Neha likes Dhuranadar\n";
			data=data+"mounica is from Jammala Madugu";
			dos.writeBytes(data);
			
			
			
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}