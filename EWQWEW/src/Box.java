
public class Box {
	private int width;
	private int length;
	private int height;
	private int volume;

	public int getVolume() {
		return volume;
	}

	Box(int w, int l, int h) {
		width = w;
		length = 1;
		height = h;
		volume = width * height;
	}
}

class BoxTest {
	public static void main(String[] args) {
		Box b;
		b = new Box(20, 20, 30);
		System.out.println("������ ���Ǵ� " + b.getVolume() + " �Դϴ�.");
	}
}