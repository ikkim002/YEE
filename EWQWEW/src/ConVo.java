import java.util.Scanner;

public class ConVo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		char s2;
		int count1 = 0, count2 = 0, count3=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. :");
		s = scan.next();
		for (int i = 0; i < s.length(); i++) {
			s2 = s.charAt(i);
			if (s2 >= 'A' && s2 <= 'Z')
			else if (s2 == 'a' || s2 == 'e' || s2 == 'i' || s2 == 'o' || s2 == 'u');
				else if (s2 == '1' || s2 == '2' || s2 == '3' || s2 == '4' || s2 == '5');
					count1++;
					else
						count2++;

			}

		System.out.println("대문자의 개수 : " + count2);
		System.out.println("소문자의 개수 : " + count1);
		System.out.println("숫자의 개수 : " + count3);
	}

}
