package _10000;

import java.io.*;

public class _10926 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String n = br.readLine();

		bw.write(n + (char) 63 + (char) 63 + (char) 33);
		bw.flush();
		bw.close();
		br.close();
	}

}
