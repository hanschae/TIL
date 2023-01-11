package pac;

public class Information {
	int num = 1234;
	protected String userid = "legochj";
	
	protected Information(){
		System.out.println("Information의 생성자 메소드");
	}
	
	String getUserid() {
		return userid;
	}
	public static Information getInstance() {
		return new Information();
	}
	
		
}
