package t4_exception;

import java.io.IOException;
import java.io.InputStreamReader;

//일반 예외 (컴파일러에서 확인 가능)
public class Exception1_IOException {
	public static void main(String[] args) {
		
		try {
			InputStreamReader is = new InputStreamReader(System.in);
			System.out.print("업로드할 파일명을 입력하세요.> ");
			is.read();
			System.out.println("파일을 정상적으로 읽어들였습니다.");
		} catch (IOException e) {
			System.out.println("파일 읽기 실패!");
			e.printStackTrace();
		}
	}
}
