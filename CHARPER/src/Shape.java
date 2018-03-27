
public class Shape {
	private int x;
	private int y;

	public int getx() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	void print() {
		System.out.println("x좌표: " + x + "  y좌표: " + y);

	}
}

class Rectangle extends Shape {
	private int width;
	private int height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	double area() {
		return (double) width * height;
	}

	void draw() {
		System.out.println("(" + this.getx() + "," + this.getY() + ") 위치에 " + "가로:" + width + "세로:" + height);
	}
}

class RectangleTest {
	public static void main(String args[]) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();

		r1.setX(8);
		r1.setY(9);
		r2.setWidth(10);
		r2.setHeight(20);

		r1.print();
		r1.draw();
		r2.print();
		r2.draw();
	}
}