package t4_exception;

public class Exception5_Throw2 {
	public static void main(String[] args) {
		try {
			findMethod();
			System.out.println("찾는 클래스가 있습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("찾는 클래스가 없습니다. "+e.getMessage());
		} finally {
			System.out.println("작업끝!");
		}
	}

	private static void findMethod() throws ClassNotFoundException {
			Class.forName("java.lang.String1");
			System.out.println("계속 진행중...");
	}
		
}
