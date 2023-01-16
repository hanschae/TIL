package basic05_collection;

public class GenericMain {

	public GenericMain() {
		
		/*
		ProductVO vo1 = new ProductVO();
		//vo1.setProductName("ƒƒ«ª≈Õ");
		
		vo1.setProductName(new MemberVO(1234,"AAA","±‚»π∫Œ","010-1234-5678"));
		
		MemberVO vo = (MemberVO)vo1.getProductName();
		System.out.println(vo.toString());
		*/
		
		ProductVO<MemberVO> vo1 = new ProductVO<MemberVO>();
		ProductVO<String> vo2 = new ProductVO<String>();
		
		vo1.setProductName(new MemberVO());
		//vo1.setProductName(new String());
		
		vo2.setProductName("≥√¿Â∞Ì");
		//vo2.setProductName(new MemberVO());
		
	}
	public void start() {
		
	}
	public static void main(String[] args) {
		new GenericMain().start();

	}

}
