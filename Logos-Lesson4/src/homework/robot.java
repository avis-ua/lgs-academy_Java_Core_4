package homework;

public class robot {
	private String text;
	private String type;
	
	robot (String text, String type){
		this.text = text;
		this.type = type;
	}
	
	void work() {
		System.out.println(text);
	}
	

	@Override
	public String toString() {
//		return "robot [text=" + text + ", type=" + type + "]";
		return "robot [" + type + ":  " + text + "]";
	}

	
}
