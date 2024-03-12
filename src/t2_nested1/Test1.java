package t2_nested1;

// 중첩클래스: 인스턴스 멤버 클래스
public class Test1 {
	int su = 100;
	
	public Test1() {
		System.out.println("이곳은 Test1 클래스입니다.");
	}
	
	public void modTest1() {
		System.out.println("이곳은 Test1 클래스의 modTest1메소드입니다.");
	}
	
	public class Aa {
//		int su = 100; // Test1과 다른 클래스여서 사용 가능
		int suA = 200;
//		static int suB = 250; // 인스턴스 안에는 static 사용 불가
		
		public Aa() {
			System.out.println("이곳은 중첩클래스 Aa 클래스입니다.");
		}
		
		public void modTest1A() {
			System.out.println("이곳은 중첩클래스 Aa 클래스의 modTest1A메소드입니다.");
		}
		
//		public static void modTest1B() {} // 인스턴스 안에는 static 사용 불가
	}
}

class Aa {
	public Aa() {
		System.out.println("이곳은 Aa 클래스입니다.");
	}
}
