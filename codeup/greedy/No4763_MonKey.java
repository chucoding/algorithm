package codeup.greedy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class No4763_MonKey {
	public static void main(String[] args) {
		File file = new File("G:/test/INPUT.TXT");

		FileInputStream fis = null;
		StringBuffer sb = new StringBuffer(); 
		
		int in = -1;
		int len = 0;
		
		try {
			fis = new  FileInputStream(file);

			while((in = fis.read()) != -1) {
				sb.append((char)in);
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(sb.charAt(0));
	}
}
