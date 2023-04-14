//0404 Class1~10
package java1;

//class만 단독 사용가능
public class Class1 { //class없이 method 사용 X
//필드공간 (전역변수, 전역객체)
//static : 메모리를 직접적으로 핸들링하는 속성
	static int money = 10000; //클래스 변수
	
	public static void main(String[] args) { //main 실행 메소드
//		String name = "유관순"; //지역변수
		
		Adata ad = new Adata(); //해당 클래스를 객체로 변환
		Bdata bd = new Bdata();
		
		System.out.println(ad.a); //해당 객체에 있는 변수값을 로드
		System.out.println(bd.a);
		System.out.println(money);
		
		
		Cdata cd = new Cdata(); 
		cd.aa = 10; //Cdata 클래스 안에 변수를 호출후 값을 이관
		cd.bb = 30;
		cd.cc = cd.aa + cd.bb;
		System.out.println(cd.cc);
	}

}

class Adata { //보조 class는 앞에 아무것도 쓰지않음
	String a = "홍길동";
}
class Bdata {
	String a = "이순신";
}
class Cdata {
	int aa; //숫자 할당
	int bb; //숫자 할당
	int cc; //결과값
}
