import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TicTacToeServer {
	
	public static void main(String[] args) throws Exception {
		
		ServerSocket ss = new ServerSocket(9001);
		System.out.println("Tic Tac Toe ������ ���� �Ǿ����ϴ�.");
		
		try {
			while (true) {
				Game game = new Game();
				
				Player1 player1 = new Player1(game, ss.accept(), '��');
				Player1 player2 = new Player1(game, ss.accept(), '��');
				
				player1.setOther(player2);
				player2.setOther(player1);
				
				player1.start();
				player2.start();
				System.out.println("�� ����� �����ϴ�. ");
			}
		} finally {
			ss.close();
		}
	}
}

class Game {
	char[][] boards = new char[5][5];
	
	public void setBoard(int i, int j, char playerMark) {
		boards[i][j] = playerMark;
		
	}
	
	public char getBoard(int i , int j) {
		return boards[i][j];
		
	}
	
	public void printBoard() {
		for (int k = 0; k < 5 ; k++) {
			System.out.println(" "+ boards[k][0] + "�� " + boards[k][1] + "�� " + boards[k][2]+ boards[k][3] + "�� " + boards[k][4] );
			if(k != 2)
				System.out.println("---��---��---��---��---");
		}
	}
}

class Player1 extends Thread {
	Game game;
	Socket socket;
	BufferedReader input;
	PrintWriter output;
	char playerMark;
	Player1 other;
	
	public Player1(Game game, Socket socket , char playerMark) {
		this.game = game;
		this.socket = socket;
		this.playerMark = playerMark;
		try {
			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			output = new PrintWriter(socket.getOutputStream(), true);
			output.println("START " +playerMark);
			output.println("PRINT �ٸ� ����ڸ� ��ٸ��ϴ� .");
		} catch (IOException e) {
			System.out.println("������ ���������ϴ�. "+ e);
		}
	}	
			

	public void setOther(Player1 other) {		
			this.other = other;
			
	}
	
	public void run() {
		try {
			output.println("PRINT ��� ����ڰ� ����Ǿ����ϴ�. ");
			
			if(playerMark == 'X') {
				output.println("PRINT ��� �����Դϴ�.");
				
			
				
			}
			
			while (true) {
				String command = input.readLine();
				if (command == null)
					continue;
			if (command.startsWith("MOVE")) {
				int i = Integer.parseInt(command.substring(5,6));
				int j = Integer.parseInt(command.substring(7, 8));
				game.setBoard(i, j, playerMark);
				game.printBoard();
				other.output.println("OTHER " + i + " " + j );
				output.println("PRINT ��ٸ�����!");
				other.output.println("PRINT ��� �����Դϴ�.");
			} else if (command.startsWith("QUIT")) {
				return;
				
				}
			}
		} catch (IOException e ) {
			System.out.println("������ ���������ϴ�. " + e);
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				System.out.println("�ٽ� �Ͻðڽ��ϱ�.?");
		}
	}
	}
}