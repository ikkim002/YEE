import java.util.*;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		String id = "a";
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 :");
		s = scan.next();
		if (s.equalsIgnoreCase(id))
			System.out.println("로그인성공");
		else
			System.out.println("로그인 실패");
	}

}
