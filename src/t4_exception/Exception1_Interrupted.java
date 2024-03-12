package t4_exception;

//일반 예외 (컴파일러에서 확인 가능)
public class Exception1_Interrupted {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		System.out.print("금주의 로또 번호는 : ");
		atom: for(int i=0; i<6; i++) {
			int rand = (int)(Math.random()*45)+1;
			for(int j=0; j<1; j++) {
				if(lotto[j] == rand) {
					
				}
			}
			System.out.print(".....");
			try {Thread.sleep(1000); } catch (InterruptedException e) {}
			System.out.print(rand + " / ");
		}
	}
}
