import java.net.ServerSocket;
import java.io.*;

public class Socket {
	public static void main(String args[]) throws Exception {
		System.out.println("실행중임 ");
		int asd=0;
		ServerSocket abc = new ServerSocket(4000);
		
		try{
			while(true) {
				asd++;
				Translator t = new Translator(abc.accept(),asd);
				t.start();
				
			}finally {
				abc.close();
			
				
			}
		}
	}
}