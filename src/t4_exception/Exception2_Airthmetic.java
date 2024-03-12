package t4_exception;

// 실행 예외
public class Exception2_Airthmetic {
	public static void main(String[] args) {
		int su1 = 10, su2 = 0;
		
		try {
			System.out.println("10 / 0 = "+ (su1/su2));
			System.out.println("정상처리");
		} catch (ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("예외처리 "+e.getMessage());
		}
		System.out.println("작업끝!");
	}
}
