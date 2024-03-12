package t2_nested1;

//import t2_nested1.Test1.Aa;

public class Test1Run {
	public static void main(String[] args) {
		// 중첩 클래스는 바깥쪽 클래스를 먼저 생성해야 안에 있는 중첩클래스를 사용할 수 있다
		
		Test1 t1 = new Test1();
		System.out.println("Test1클래스의 su필드: "+t1.su);
		t1.modTest1();
		System.out.println();
		
		Aa aa = new Aa();
		System.out.println();
		
		// 중첩클래스 생성
//		Aa t1a = t1.new Aa(); // 임포트하면 이렇게도 쓸 수 있다
		Test1.Aa t1a = t1.new Aa();
		System.out.println("중첩클래스 안의 suA필드: "+t1a.suA);
		t1a.modTest1A();
		
	}
}
