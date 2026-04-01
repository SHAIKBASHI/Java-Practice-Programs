package com.version3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialzationExample {

	public static void main(String[] args) {
		try(FileOutputStream fos=new FileOutputStream("D:\\Files\\ATM.txt");
				ObjectOutputStream obs=new ObjectOutputStream(fos);
				){
			ATMCard card=new ATMCard("044410100132616","12/30",297,4544);
			obs.writeObject(card);
		}catch(FileNotFoundException e) {
			
			System.out.println(e);
			
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
