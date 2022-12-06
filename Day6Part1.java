package main;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Day6Part1 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner stdin = new Scanner(new File("input.txt"));
		String key = "";
		while (stdin.hasNextLine()) {
			String next = stdin.nextLine();
			key += next;
		}
		int startNum = 0;
		for (int i = 3; i < key.length(); i++) {
			if (key.charAt(i) != key.charAt(i - 1) && key.charAt(i) != key.charAt(i - 2) && key.charAt(i) != key.charAt(i - 3) 
				&& key.charAt(i - 1) != key.charAt(i - 2) && key.charAt(i - 1) != key.charAt(i - 3) && key.charAt(i - 2) != key.charAt(i - 3)) {
				startNum = i + 1;
				break;
			}
		}
		System.out.println(startNum);
	}
}
