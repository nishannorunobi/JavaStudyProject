package reader.writer.stram;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("input.txt");
		byte[] b = new byte[]{49,50,51};
		os.write(b,1,2);
		
		InputStream is = new FileInputStream("input.txt");
		is.mark(2);
		int bit;
		while((bit=is.read())!=-1){
			System.out.print((char)bit+"=");
			System.out.print(bit);
			System.out.println();
		}
		System.out.println(bit);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("input.txt")));
		char[] ch = new char[]{'a','b','c'};
		bw.write(ch,1,2);
		BufferedReader br = new BufferedReader(new FileReader(new File("input.txt")));
		
		int x;
		while((x = br.read())!=-1){
			System.out.print((char)x+"=");
			System.out.print(x);
			System.out.println();
		}
		System.out.println(x);
	}

}
