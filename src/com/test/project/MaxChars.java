package com.test.project;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MaxChars {
	
	public static void main(String args[]) {
		
		String str1 = "sahana";
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<str1.length()-1; i++) {
			char curChar = str1.charAt(i);
			if(map.containsKey(curChar))
				map.put(curChar, map.get(curChar)+1);
			else
				map.put(curChar, 1);
				
		}
		
		System.out.println(map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getKey());
	}

}
