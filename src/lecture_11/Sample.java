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
					if (!map.containsKey(i1 + i2 + i3)) 
						map.put(key, value)
		
				}
	}
}
