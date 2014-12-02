package java.persistence.serializable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main implements Serializable{
	String name;
	SubMain subMain;
	public Main() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws FileNotFoundException, IOException{
		Main man1 = new Main();
		man1.name = "Main1";
		man1.subMain = new SubMain("Submain1");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("test.xml")));
		oos.writeObject(man1);
		
	}
	
	
}
class SubMain implements Serializable{
	public SubMain(String title){
		this.title = title;
	}
	String title;
}