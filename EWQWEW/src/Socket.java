import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.net.ServerSocket;
import java.util.Scanner;

import org.omg.IOP.TransactionService;

public class Socket {
	public static void main(String[] args) throws Exception {
		System.out.println("Ω√¿€");
		int id = 0;
		ServerSocket ss = new ServerSocket(1010);

		try {

			while (true) {
				id++;
				Socket a = new Socket();

			}

		} finally {

			ss.close();

		}

	}

	public InputStream getInputStream() {
		// TODO Auto-generated method stub
		return null;
	}

	public Writer getOutputStream() {
		// TODO Auto-generated method stub
		return null;
	}

}

class Translator {
	Socket socket;
	int id2;

	public Translator(Socket socket, int id) {
		this.socket = socket;
		this.id2 = id	;
	
		try{
			
				while(true) {
					Scanner aw = new Scanner(new InputStreamReader(
							socket.getInputStream()));
					
					
		
					
					
					
					
					aw.close();
				}
			}
		}	
	}