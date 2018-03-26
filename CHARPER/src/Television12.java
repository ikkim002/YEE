
public class Television12 {
	private String model;

	void setModel(String b) {
		model = b;
	}

	String getmodel() {
		return model;
	}
}

class Television12Test {
	public static void main(String[] args) {
		Television12 t = new Television12();
		t.getmodel();
		String b = t.getmodel();
	}
}