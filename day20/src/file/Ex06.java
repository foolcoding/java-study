package file;

import java.io.File;	// 파일 혹은 디렉토리(폴더)를 활용하기 위한 클래스
import java.io.FileWriter;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		File f1 = new File("a.txt");			// 현재폴더에서의 a.txt
		File f2 = new File("C://windows");		// 절대경로를 이용한 디렉토리
		File f3 = new File(f2, "notepad.exe");	// 다른 디렉토리 내부에 있는 notepad.exe
		
		System.out.println("f1이 실제로 존재하는가 " + f1.exists());
		System.out.println("f2이 실제로 존재하는가 " + f2.exists());
		System.out.println("f3이 실제로 존재하는가 " + f3.exists());
		System.out.println();	// File 클래스로 객체를 생성하는 것은 실제 파일 존재와는 상관이 없다
		
		System.out.println("f1이 파일인가 : " + f1.isFile());
		System.out.println("f2이 파일인가 : " + f2.isFile());
		System.out.println("f3이 파일인가 : " + f3.isFile());
		System.out.println();	// 텍스트 혹은 실행파일 등을 말한다
		
		System.out.println("f1이 디렉토리인가 : " + f1.isDirectory());
		System.out.println("f2이 디렉토리인가 : " + f2.isDirectory());
		System.out.println("f3이 디렉토리인가 : " + f3.isDirectory());
		System.out.println();	// 폴더를 말한다
		
		if(f1.exists() == false) {
			f1.createNewFile();
		}
		
		FileWriter fw = new FileWriter(f1);
		fw.append("Hello ");
		fw.append("world\n");
		fw.flush();
		fw.close();
		
		Runtime rt = Runtime.getRuntime();
		Process pro = rt.exec("notepad " + f1.getName());
		Thread.sleep(2000);
		pro.destroy();
		
		if(f1.exists()) {
			f1.delete();
		}
		
		
	}
}
