package _2000;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class _2480 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] arr = { br.readLine().replace(" ", "") };

		char[] strArr = arr[0].toCharArray();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (char c : strArr) {
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}

		Comparator<Entry<Character, Integer>> comparator = new Comparator<Entry<Character, Integer>>() {
			@Override
			public int compare(Entry<Character, Integer> e1, Entry<Character, Integer> e2) {
				return e1.getValue().compareTo(e2.getValue());
			}
		};

		Entry<Character, Integer> maxEntry = Collections.max(hm.entrySet(), comparator);

		if (maxEntry.getValue() == 3) {
			System.out.println(10000 + Character.getNumericValue(maxEntry.getKey()) * 1000);
		} else if (maxEntry.getValue() == 2) {
			System.out.println(1000 + Character.getNumericValue(maxEntry.getKey()) * 100);
		} else {
			System.out.println(Character.getNumericValue(Collections.max(hm.keySet())) * 100);
		}

		bw.flush();
		bw.close();
		br.close();
	}

}
