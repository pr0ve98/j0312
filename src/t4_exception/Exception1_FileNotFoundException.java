package t4_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//일반 예외 (컴파일러에서 확인 가능)
public class Exception1_FileNotFoundException {
	public static void main(String[] args) {
		
		
		try {
//			FileInputStream is = new FileInputStream("test1.txt");
			FileInputStream is = new FileInputStream("D:\\javaclass\\java\\works\\j0312\\src\\t4_exception\\Exception1_ClassNotFount.java");
			System.out.println("Exception1_ClassNotFount.java 파일이 존재합니다.");
		} catch (FileNotFoundException e) {
			System.out.println("Exception1_ClassNotFount.java 파일이 없습니다.");
			e.printStackTrace();
		}
		System.out.println("작업끝!");
			
	}
}
