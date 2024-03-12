package t2_nested2;

public class Test1Run {
	public static void main(String[] args) {
		System.out.println("이곳은 Test1Run클래스의 main메소드입니다.");
		System.out.println();
		
		// 정적 멤버 클래스여도 바깥 클래스를 생성해야함
		Test1 t1 = new Test1();
		System.out.println("su: "+t1.su);
		t1.modTest1();
		System.out.println();
		
		new Aa(); // 외부(일반) 클래스
		System.out.println();
		
//		t1.new Aa(); // 인스턴스
		Test1.Aa t1a = new Test1.Aa(); // 중첩 정적 멤버 클래스
		// hip 영역에서 가져온 것
		System.out.println("saB: "+t1a.suB);
		t1a.modTest1A();
		t1a.modTest1B();
		System.out.println();
		// static 은 객체를 생성 안 해도 되는데 생성한 t1a 변수를 사용해 불러서 노란줄(별로 좋지 않음)
		
		// 메소드에서 가져온 것
		System.out.println("suB: "+ Test1.Aa.suB);
		Test1.Aa.modTest1B();
	}
}
