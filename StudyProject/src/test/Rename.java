package test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Rename {

	public Rename() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String path = "/home/nishan/moteel/all images/all images/loader/loader/";
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		String [] names = new String[listOfFiles.length];
		//Arrays.sort(listOfFiles);
		//System.out.println(listOfFiles);
		//TreeSet<String> nameList = (ArrayList<String>) Arrays.asList(names);
		//TreeSet<String> sortedList = nameList;
		for (int i = 0; i < listOfFiles.length; i++) {

			if (listOfFiles[i].isFile()) {
				//path = path+"\\";
				names[i] = listOfFiles[i].getName();
				/*File f = new File(path+listOfFiles[i].getName()); 
				if(listOfFiles[i].getName().contains("loader")){
					System.out.println(listOfFiles[i].getName());
				}*/
				// f.renameTo(new File("c:\\Projects\\sample\\"+i+".txt"));
			}
		}
		printArray(names);
		Arrays.sort(names);
		System.out.println("================");
		printArray(names);
	}
	private static void printArray(String names[]){
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
