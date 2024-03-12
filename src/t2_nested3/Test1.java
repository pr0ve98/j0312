package t2_nested3;

// 중첩클래스: 로컬 클래스(메소드 안에 정의하는 클래스)
public class Test1 {
	int su = 500;

	public Test1() {
		System.out.println("이곳은 Test1 클래스입니다.");
	}

	public void modTest1() {
		System.out.println("이곳은 Test1 클래스의 modTest1메소드입니다.");
	}

	public void modClass() { // 메소드 안의 영역은 메소드 안에서만 쓰고 버려지는 것 그래서 Aa 클래스 앞에 public 을 쓰면 error 발생
		int atom = 900;
		System.out.println("이곳은 Test1 클래스의 modClass()의 메소드입니다.");
		System.out.println("이곳은 Test1 클래스의 modClass()의 메소드안의 atom 변수입니다. " + atom);

		class Aa {
			int suA = 550;

			public Aa() {
				System.out.println("이곳은 중첩클래스 Aa 클래스입니다.");
			}

			public void modTest1A() {
				System.out.println("이곳은 중첩클래스 Aa 클래스의 modTest1A메소드입니다.");
			}
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		Aa aa = new Aa(); // 메소드 안의 영역이므로 밖의 Aa클래스 와는 관계가 없다.
		System.out.println("중첩클래스 안의 suA: " + aa.suA);
		aa.modTest1A();
	}

	public void modClass2() {
		class Aa {}
	}
	
	public void modClass3() {
		class Bb {}
	}
}

class Aa {
	public Aa() {
		System.out.println("이곳은 Aa 클래스입니다.");
	}
}
