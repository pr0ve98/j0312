package t4_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception4_MultiException3 {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.Object");
			System.out.println("java.lang 패키지 안에 Object 클래스가 있습니다.");
			
			
			FileInputStream is = new FileInputStream("D:\\javaclass\\java\\works\\j0312\\src\\t4_exception\\Exception1_ClassNotFount.java");
			System.out.println("찾는 파일이 존재합니다.");
			
			System.out.println("잠시 쉬었다가 갑니다.");
			Thread.sleep(1000);
			System.out.println("계속 진행합니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스파일 확인 "+e.getMessage());
		} catch (FileNotFoundException e) {
			System.out.println("파일 확인 "+e.getMessage());
		} catch (InterruptedException e) {
			System.out.println("스레드 확인 "+e.getMessage());
		} finally {
			System.out.println("작업 끝");
		}
		
	}
}
