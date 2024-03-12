package t4_exception;

// 일반 예외 (컴파일러에서 확인 가능)
public class Exception1_ClassNotFount {
	public static void main(String[] args) {
		
//		java.lang.Object
		
		try {
			Class.forName("java.lang.Object2");
			System.out.println("java.lang 패키지에는 Object2 클래스가 있습니다.");
		} catch (ClassNotFoundException e) {
//			System.out.println("java.lang 패키지에는 Object2 클래스가 없습니다.");
//			e.printStackTrace(); // error 메세지를 정확히 알고 싶다면 e.printStackTrace()
			System.out.println("java.lang 패키지에는 Object2 클래스가 없습니다. : "+e.getMessage()); // 요약한 내용 (e.getMessage())
		}
		System.out.println("작업 끝~");
	}
}
