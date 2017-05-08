package np.r.vo;

public class CipherText {
	
	private String key;
	private String text;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public CipherText(String key, String text) {
		super();
		this.key = key;
		this.text = text;
	}
	

}
