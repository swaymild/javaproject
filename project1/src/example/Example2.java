package example;

//class : 틀, 메소드 : 재료, 객체 : 제품, 인스턴스 : 제품의 박스

public class Example2 {
	
	final int data1 = 20; //final 상수
	String abc = "홍길동";
	
	public static void main(String[] args) {
		
		final int data2 = 50; //메소드 안에 상수선언
//		System.out.println(data1);
		//field에 있는 값을 main 직접 핸들링 못함
		Example2 ex = new Example2(); //객체 생성 및 인스턴스로 등록
		System.out.println(ex.data1);
		ex.abc = "이순신";
		ex.aaa();

	}
	
	public void aaa() { //확장 메소드에서는 핸들링 가능
		this.abc = "강감찬";
		System.out.println(abc);
		System.out.println(data1);
	}

}
