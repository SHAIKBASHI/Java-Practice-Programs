package com.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter port Number");
		int port=obj.nextInt();
		try {
			ServerSocket ss=new ServerSocket(port);
			System.out.println("Serve started...waiting to receive request...");
			Socket s=ss.accept();
			InputStream is=s.getInputStream();
			int number=is.read();
			System.out.println("Data from Client"+number);
			int fact=1;
			for(int i=1;i<=number;i++) {
				fact=fact*i;
			}
			OutputStream os=s.getOutputStream();
			os.write(fact);
		}catch(IOException e) {
			System.out.println(e);
			
		}

	}

}
