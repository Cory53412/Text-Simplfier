package ie.gmit.sw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Parser {
	public HashMap<String,String> map = new HashMap();
	
	public void parsing(String file1,String file2) throws IOException {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/google-1000.txt"));
			BufferedReader mr = new BufferedReader(new FileReader("src/MobyThesaurus2.txt"));
			
			String word,line = null;
			
			while((word = br.readLine()) != null && (line= mr.readLine()) != null)
			{
				String words[] = line.split(",");
				for(String input : words) 
				{
					map.put(input, word);//Big O of 0(log n)
				}
			}
			br.close();
			mr.close();
			
		} catch ( Exception E){
			System.out.println("Sorry exception occured.");
		}
		
	}
	
	public Map<String,String>map(){
		return this.map;
	}
}// last bracket


