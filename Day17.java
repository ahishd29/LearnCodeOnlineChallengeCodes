package codeOnline30dayChallenge;

import java.util.HashMap;
import java.util.Set;

public class Day17 {

	
				public static void dup(String value) {
					String item[] = value.split(" ");
					HashMap<String,Integer> map = new HashMap<>();
					for(String t:item) {
						if(map.containsKey(t)) {
							map.put(t, map.get(t)+1);
							
						}
						else {
							map.put(t, 1);
						}
					}
					Set<String> keys = map.keySet();
					for(String key:keys) {
						if(map.get(key)>1) {
							System.out.println(key+ " ");
						}
					}
				}
				
				public static void main(String[] args) {
					String stu = "Aman Ankit Deepak Amit Ankit Vansh Aman Sagar";
					dup(stu);
	}

}
