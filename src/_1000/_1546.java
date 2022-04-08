package _1000;

import java.io.*;
import java.util.*;

public class _1546 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		ArrayList<Integer> al = new ArrayList<Integer>();
		int n = Integer.parseInt(br.readLine());
		int sum = 0;

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(st.nextToken());
			al.add(x);
			sum += x;
		}
		
		bw.write(String.valueOf(sum * 100.0 / Collections.max(al) / n));

		bw.flush();
		bw.close();
		br.close();
	}

}
