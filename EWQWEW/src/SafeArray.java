import java.util.Scanner;

public class SafeArray {
	private int a[];
	public int length;

	public SafeArray(int size) {

		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		
	
		a = new int[size];
		length = size;
	}

	public int get(int index) {
		if (index >= 0 && index < length) {
			return a[index];
		}
		return -1;
	}

	public void put(int index, int value) {
		if (index >= 0 && index < length) {
			a[index] = value;
		} else
			System.out.println("�߸��� �ε���" + index);
	}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			SafeArray array = new SafeArray(3);

			for (int i = 0; i < (array.length + 1); i++) {
				array.put(i, i * 10);
			}
		}

	}