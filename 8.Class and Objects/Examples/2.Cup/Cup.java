
public class Cup {
	private int size;
	private String content;

	public Cup(int size, String content) {
		if (32 != size && 16 != size && 8 != size) {
			throw new IllegalArgumentException("Argument is not correct");
		}

		this.size = size;
		this.content = content;
	}

	public void setSize(int size) {
		if (32 != size && 16 != size && 8 != size) {
			throw new IllegalArgumentException("Argument is not correct");
		}

		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}
}