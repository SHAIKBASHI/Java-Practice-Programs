package com.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter ip address");
		String ip=obj.next();
		System.out.println("Enter port number");
		int port =obj.nextInt();
		try {
			Socket s=new Socket(ip,port);
			OutputStream os=s.getOutputStream();
			os.write(5);
			InputStream is=s.getInputStream();
			int result=is.read();
			System.out.println("Result from server is"+result);
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
