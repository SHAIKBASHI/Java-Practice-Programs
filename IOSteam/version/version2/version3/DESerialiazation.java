package com.version3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class DESerialiazation {

	public static void main(String[] args) {
			try(FileInputStream fis=new FileInputStream("D:\\Files\\ATM.txt");
					ObjectInputStream ois=new ObjectInputStream(fis);
					){
				
				 ATMCard card=(ATMCard)ois.readObject();
				System.out.println(card);
				}catch(FileNotFoundException e) {
				
				System.out.println(e);
				
			}catch(IOException e) {
				System.out.println(e);
			}
			catch(ClassNotFoundException e) {
				System.out.println(e);
			}

	}

}
