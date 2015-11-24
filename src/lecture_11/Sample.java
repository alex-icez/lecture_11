package lecture_11;

import java.util.HashMap;
import java.util.LinkedList;

public class Sample {
	public static void main(String[] args) {
		HashMap<Integer, LinkedList<String>> map = new HashMap<>();
		int key;
		for(int i1 = 0; i1 < 10; i1++)
			for(int i2 = 0; i2 < 10; i2++)
				for(int i3 = 0; i3 < 10; i3++) {
					key = i1 + i2 + i3;
					if (!map.containsKey(key)) 
						map.put(key, new LinkedList<>());
					map.get(key).add("" + i1 + i2 + i3);
				}
		for(LinkedList<String> list : map.values()) 
			for(String p1 : list)
				for(String p2 : list)
					System.out.println(p1 + p2);
			
			
	}
}
