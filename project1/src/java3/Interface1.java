//0412 Abstract2~4(ab1), Interface1(inter1,inter2), Interface2~3(user1,user2), List1~3
package java3;

public class Interface1 {

	//interface 사용법(inter1, inter2)
	//Interface의 특징 : class가 없음 (추상 메소드)
	public static void main(String[] args) {
		
	key k = new key();	
	k.z1();
	k.z2();
	
	}

}

/*
 Interface 상속을 받기위해서는 implements를 이용함 (extends X)
 Interface : 부품이며 해당 부품을 조립하여 프로그램을 완성하는 형태
 또한 여러개의 interface를 한번에 로드할 수 있음
 
 단점 : 일반 메소드를 생성하지 못함
 단, 강제로 메소드를 생성할 수 있음 (default 이용시)
 
 동일한 변수를 사용시 this를 사용하지 못하며, 해당 interface 메소드 이름을
 입력 후 해당 변수명을 적용해야함
 예시)인터페이스이름.변수명
 */
class key implements inter1, inter2 {
	@Override
	public void z1() {
//		System.out.println(this.names);
		System.out.println(inter1.names);
	}
	@Override
	public void z2() {
//		System.out.println(this.names);
		System.out.println(inter2.names);
	}
	@Override
	public String z3() {
		return null;
	}
	@Override
	public void z1_1(int a, int b) { //일반 메소드 사용 유/무 자유로움
		inter1.super.z1_1(a, b);
	}
}