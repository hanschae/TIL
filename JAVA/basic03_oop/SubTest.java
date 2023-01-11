
public class SubTest extends SuperTest{
	public SubTest(int a){
		super(a);
	}
	public SubTest() {
		//a=10;
		//this.a=10;
		//super.a=10;
		
		// this(10) 이랑 super(10)은 첫행에 써야함
		//this(10);
		super(10);
	}
	
	public static void main (String a[]) {
		SubTest st = new SubTest();
		System.out.println(st.a);
	}
}
