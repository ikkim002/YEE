import java.util.Scanner;

public class PhoneTest {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		String name;
		String age;
		String Phone;
		
			Scanner scan = new Scanner(System.in);
			String select = "";
			System.out.println("\n### ģ�� ����ó ���� ### \n");
			
			while (select != "4") {
				print_menu();
				
				System.out.println("����ó ���");
				select = scan.next();
				System.out.println("����ó ���");
				select = scan.next();
				System.out.println("����ó ����");
				select = scan.next();
				
				switch (select) {
				case "1":
					for(int a;a<0; a++ );
				}else{
					System.out.println("");
					view_juso();
					
					break;
				case"2":
					for(int );
				}else if{
					System.out.println("");
					add_juso();
				
					break;
					
				case "3":
					for(int );
				}else if{
					System.out.println("");
					delete_juso();
					
					break;
					
				case "4":
					System.out.println();
				return;
				default:
					System.out.println("\n �߸� �Է� �ٽ� ����\n");
				}
			}
		}
	}