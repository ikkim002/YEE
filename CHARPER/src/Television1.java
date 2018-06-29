
public class Television1 {
	private String model;

	void setModel(String b) {
		model = b;
	}

	String getmode() {
		return model;
	}
	public static void main(String[] args) {
		Television t = new Television();
		t.setModel("STV- 101");
		String b = t.getModel();
	}
}