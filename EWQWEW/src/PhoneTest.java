import java.io.IOException;
import java.util.Scanner;

public class PhoneTest {
	
	static String fname = "C:\\temp\\juso.txt";
	
	static class address {
		String name;
		String age;
		String Phone;
		
		address(String s1,String s2,String s3) { 
		this.name = s1;
		this.age = s2;
		this.Phone = s3;
			}
	}
															
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			
			Scanner scan = new Scanner(System.in);
			String select = "";
			System.out.println("\n### 친구 연락처 관리 ### \n");
			
			while (select != "4") {
				print_menu();
				select=scan.next();
				
				switch (select) {
				case "1":
		
					view_juso();
					break;
				case"2":
					
					add_juso();
					break;
					
				case "3":
				
					delete_juso();
					break;
					
				case "4":
				return;
				default:
					System.out.println("\n 잘못 입력 다시 선택\n");
	
			}
		}
	}
}