package solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
	
	
	

	public static void main(String[] args) {
		List<String> magazine = new ArrayList<String>();
		List<String> note = new ArrayList<String>();
		
		magazine.add("apgo");
		magazine.add("clm");
		magazine.add("w");
		magazine.add("lxkvg");
		magazine.add("mwz");
		magazine.add("elo");
		magazine.add("bg");
		magazine.add("elo");
		magazine.add("lxkvg");
		magazine.add("apgo");
		magazine.add("w");
		magazine.add("elo");
		magazine.add("bg");
		
		note.add("elo");
		note.add("lxkvg");
		note.add("bg");
		note.add("mwz");
		note.add("clm");
		note.add("w");
		
		checkMagazine(magazine, note);
		
	}

	
	
	public static void checkMagazine(List<String> magazine, List<String> note) {
	    
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		
		for (int i = 0; i < magazine.size(); i++) {
			if (hashMap.containsKey(magazine.get(i))) {
				hashMap.put(magazine.get(i), hashMap.get(magazine.get(i)) + 1);
			} else {
				hashMap.put(magazine.get(i), 1);
			}
		}
		
		boolean existsWord = true;
		
		for (String words : note) {
			
			if (!hashMap.containsKey(words)) {
				existsWord = false;
				break;
			} else {
				if (hashMap.get(words) > 1) {
					hashMap.put(words, hashMap.get(words) - 1);
				} else {
					hashMap.remove(words);
				}
			}
			
		}
		
		if (existsWord) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	    }
}
