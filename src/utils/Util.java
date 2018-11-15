package utils;

import java.io.BufferedReader;
import java.io.FileReader;

public class Util {
	
	public static String loadFile(String path) {
		StringBuilder builder = new StringBuilder();
		
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line;
			while((line = br.readLine()) != null) {
				builder.append(line + "\n");}
			br.close();
			
		} catch (Exception e) {e.printStackTrace();}
		
		return builder.toString();
	}
	
	public static int parseInt(String number) {
		try {
			return Integer.parseInt(number);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	
}
