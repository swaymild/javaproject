package example;

import java.util.*;

public class Example7 {

	Integer userno[] = new Integer[7];
//	Integer userno[] = {1,2,3,4,5,6,7}; //for in은 값이 있어야 반복문 가능
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*
		 사용자가 총 7개의 숫자를 입력합니다.
		 7개 숫자 중 짝수값이 몇개 입력되었는지 출력하시오.
		 또한 최종 배열값도 출력합니다.
		 */
		Example7 ex = new Example7();
//		ex.no();
		
		ex.abc();
	}

//	public void no() {
//		System.out.println(Arrays.toString(userno));
//		System.out.println("숫자를 7개 입력하세요");
//		int node = 0;
//		int count = 0;
//		for(int f:this.userno) {
//			Integer a = sc.nextInt();
//			this.userno[node] = a;
//			if(a % 2 == 0) {
//				count++;
//			}
//			node++;
//		}
//		System.out.printf("사용자가 입력한 숫자중 짝수값은 %d 개 입니다\n",count);
//		System.out.println(Arrays.toString(userno));
//		sc.close();
//	}
	
	public void abc() {
	      
		int w = 0;
	    int count = 0;
	    System.out.println("7개의 숫자를 입력하세요"); //메시지는 1번만 출력
	    while(w < 7) { //7번반복
	    	Integer a = sc.nextInt(); //입력값 7번 출력
	    	this.userno[w] = a;
	    	if(a % 2 == 0) {  //사용자가 입력한 값이 짝수일경우
	    		count++; //+1씩 증가(카운팅)
	        }
	        w++;
	    }
	    System.out.println(Arrays.toString(this.userno) +"\n짝수는: "+ count + "개 입니다");
	    sc.close();
	   
	}
	
}
