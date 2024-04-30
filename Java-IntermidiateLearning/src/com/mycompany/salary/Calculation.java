package com.mycompany.salary;

import java.util.HashMap;
import java.util.Map;

public class Calculation {
	
	public static void main(String[] args) {
		
		String word="Bangladesh";
		char c[]=word.toLowerCase().toCharArray();
		HashMap<Character , Integer> hm= new HashMap<Character , Integer>();
		
		for(char n:c) {
			if(hm.containsKey(n)) {
				hm.put(n, hm.get(n)+1);
			}else {hm.put(n, 1);
				
			}
			
		}
		
		for(Map.Entry<Character , Integer> value:hm.entrySet()) {
			System.out.println(value.getKey()+ "="   + value.getValue());
		}
	}

}
