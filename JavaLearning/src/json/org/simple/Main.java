package json.org.simple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ParseException, IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("input5.txt")));
		StringBuilder builder = new StringBuilder();
		String line = "";
		String nl = System.getProperty("line.separator");
		while((line=br.readLine())!=null){
			builder.append(line+nl);
		}
		System.out.println(builder.toString());
		JSONParser parser = new JSONParser();
		JSONObject jsonObject = (JSONObject) parser.parse(builder.toString());
		System.out.println(jsonObject);
		
	}

}

