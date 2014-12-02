package json.org.simple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main2 {
     public static void main(String[] args) {
 		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(new File("input5.txt")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		StringBuilder sb = new StringBuilder();
 		String line = "";
 		String nl = System.getProperty("line.separator");
 		try {
			while((line=br.readLine())!=null){
				sb.append(line+nl);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 JSONParser parser = new JSONParser();
 		JSONObject jObject = null;
		try {
			jObject = (JSONObject) parser.parse(sb.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		JSONArray books = (JSONArray) jObject.get("book");
 		System.out.println(books);
 		//for(int index = 0;index<books.size();index++){
 			JSONObject firstBook = (JSONObject) books.get(1);
 			System.out.println(firstBook);
 			String name = (String) firstBook.get("name");
 			System.out.println(name);
 			JSONObject authors = (JSONObject) firstBook.get("authors");
 			System.out.println(authors);
 			JSONArray authorssss = (JSONArray) firstBook.get("authors");
 			System.out.println(authorssss);
 			/*for(int i = 0;i<authors.size(); i++){
 				JSONObject auObj = (JSONObject) authors.get(i);
 				System.out.println(auObj);
 				
 			}*/
 			
 		//}
     }
 
}