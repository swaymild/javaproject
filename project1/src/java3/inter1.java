//0412 Abstract2~4(ab1), Interface1(inter1,inter2), Interface2~3(user1,user2), List1~3
package java3;

public interface inter1 {
	String names = "홍길동"; //전역변수
	public void z1();
	
	//일반 메소드를 선언 default
	default void z1_1(int a,int b) { 
		int c = a + b;
		System.out.println(c);
	}
}
