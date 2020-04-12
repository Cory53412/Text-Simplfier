package ie.gmit.sw;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
	
	public HashMap<String,String>map;
	
	public Menu(Map<String,String>map) {
		this.map = (HashMap<String, String>) map;
		
		Scanner sc = new Scanner(System.in);
		String userInput;
		
		menuOptions();
		userInput = sc.nextLine();
		
		String result=  simplifier(userInput);
		System.out.println("\nSimplfied Text:" + result+ "\n");
	}
	
	public void menuOptions() {
		System.out.println("Enter text:");
	
	}
	
	public String simplifier (String text) {
		String[] words = text.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(String word: words) {
			if(map.containsKey(word)) {//Big 0 of O(log n)
				word = map.get(word);
			}
			sb.append(word + " ");//Big 0 of 0(n)
		}
		return sb.toString();
		
	}
	
}
