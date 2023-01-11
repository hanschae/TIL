// interface 클래스를 활용하기 위해서는 implements 키워드로 인터페이스를 상속받는다
// 인터페이스는 여러개를 상속받을 수 있다
// 인터페이스에서 인터페이스를 상속받을때는 extends 키워드로 기술한다 (1개만)
// 상속받은 모든 추상메소드는 오버라이딩이 되어야한다
public class InterfaceMain implements InterfaceTest, InterfaceBoard {

	public InterfaceMain() {	}

	@Override
	public void write() {
		System.out.println("게시판 글쓰기");
	}

	@Override
	public void show() {
		System.out.println("글내용보기");
		
	}

	@Override
	public int getName() {
		// TODO Auto-generated method stub
		return MAX;
	}
	
	@Override
	public void edit() {
		System.out.println("수정하기");
	}
	
	public static void main(String args[]) {
		InterfaceMain im = new InterfaceMain();
		im.write();
		System.out.println(im.getName());
		System.out.println(im.MAX);
		System.out.println(InterfaceTest.MAX);
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}

}
