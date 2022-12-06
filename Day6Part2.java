package main;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Day6Part2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner stdin = new Scanner(System.in);
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
		int messageNum = diff(key, startNum + 10) + 1;
		System.out.println(messageNum);
	}
	
	public static int diff(String key, int startNum) {
		int returnNum = 0;
		for (int i = startNum - 1; i < key.length(); i++) {
			if (key.charAt(i) != key.charAt(i - 1) && key.charAt(i) != key.charAt(i - 2) && key.charAt(i) != key.charAt(i - 3) &&
				key.charAt(i) != key.charAt(i - 4) && key.charAt(i) != key.charAt(i - 5) && key.charAt(i) != key.charAt(i - 6) &&
				key.charAt(i) != key.charAt(i - 7) && key.charAt(i) != key.charAt(i - 7) && key.charAt(i) != key.charAt(i - 8) &&
				key.charAt(i) != key.charAt(i - 9) && key.charAt(i) != key.charAt(i - 10) && key.charAt(i) != key.charAt(i - 11) &&
				key.charAt(i) != key.charAt(i - 12) && key.charAt(i) != key.charAt(i - 13) &&
				key.charAt(i - 1) != key.charAt(i - 2) && key.charAt(i - 1) != key.charAt(i - 3) && key.charAt(i - 1) != key.charAt(i - 4)
				&& key.charAt(i - 1) != key.charAt(i - 5) && key.charAt(i - 1) != key.charAt(i - 6) && key.charAt(i - 1) != key.charAt(i - 7)
				&& key.charAt(i - 1) != key.charAt(i - 8) && key.charAt(i - 1) != key.charAt(i - 9) && key.charAt(i - 1) != key.charAt(i - 10)
				&& key.charAt(i - 1) != key.charAt(i - 11) && key.charAt(i - 1) != key.charAt(i - 12) && key.charAt(i - 1) != key.charAt(i - 13)
				&& key.charAt(i - 2) != key.charAt(i - 3) && key.charAt(i - 2) != key.charAt(i - 4)
				&& key.charAt(i - 2) != key.charAt(i - 5) && key.charAt(i - 2) != key.charAt(i - 6) && key.charAt(i - 2) != key.charAt(i - 7)
				&& key.charAt(i - 2) != key.charAt(i - 8) && key.charAt(i - 2) != key.charAt(i - 9) && key.charAt(i - 2) != key.charAt(i - 10)
				&& key.charAt(i - 2) != key.charAt(i - 11) && key.charAt(i - 2) != key.charAt(i - 12) && key.charAt(i - 2) != key.charAt(i - 13)
				&& key.charAt(i - 3) != key.charAt(i - 4) && key.charAt(i - 3) != key.charAt(i - 5)
				&& key.charAt(i - 3) != key.charAt(i - 6) && key.charAt(i - 3) != key.charAt(i - 7) && key.charAt(i - 3) != key.charAt(i - 7)
				&& key.charAt(i - 3) != key.charAt(i - 8) && key.charAt(i - 3) != key.charAt(i - 9) && key.charAt(i - 3) != key.charAt(i - 10)
				&& key.charAt(i - 3) != key.charAt(i - 11) && key.charAt(i - 3) != key.charAt(i - 12) && key.charAt(i - 3) != key.charAt(i - 13)
				&& key.charAt(i - 4) != key.charAt(i - 5) && key.charAt(i - 4) != key.charAt(i - 6)
				&& key.charAt(i - 4) != key.charAt(i - 7) && key.charAt(i - 4) != key.charAt(i - 8) && key.charAt(i - 4) != key.charAt(i - 9)
				&& key.charAt(i - 4) != key.charAt(i - 10) && key.charAt(i - 4) != key.charAt(i - 11) && key.charAt(i - 4) != key.charAt(i - 12)
				&& key.charAt(i - 4) != key.charAt(i - 13) && key.charAt(i - 5) != key.charAt(i - 6)
				&& key.charAt(i - 5) != key.charAt(i - 7) && key.charAt(i - 5) != key.charAt(i - 8) && key.charAt(i - 5) != key.charAt(i - 9)
				&& key.charAt(i - 5) != key.charAt(i - 10) && key.charAt(i - 5) != key.charAt(i - 11) && key.charAt(i - 5) != key.charAt(i - 12)
				&& key.charAt(i - 5) != key.charAt(i - 13) && key.charAt(i - 6) != key.charAt(i - 7)
				&& key.charAt(i - 6) != key.charAt(i - 8) && key.charAt(i - 6) != key.charAt(i - 9) && key.charAt(i - 6) != key.charAt(i - 10)
				&& key.charAt(i - 6) != key.charAt(i - 11) && key.charAt(i - 6) != key.charAt(i - 12) && key.charAt(i - 6) != key.charAt(i - 13)
				&& key.charAt(i - 7) != key.charAt(i - 8) && key.charAt(i - 7) != key.charAt(i - 9)
				&& key.charAt(i - 7) != key.charAt(i - 10) && key.charAt(i - 7) != key.charAt(i - 11) && key.charAt(i - 7) != key.charAt(i - 12)
				&& key.charAt(i - 7) != key.charAt(i - 13) && key.charAt(i - 8) != key.charAt(i - 9)
				&& key.charAt(i - 8) != key.charAt(i - 10) && key.charAt(i - 8) != key.charAt(i - 11) && key.charAt(i - 8) != key.charAt(i - 12)
				&& key.charAt(i - 8) != key.charAt(i - 13) && key.charAt(i - 9) != key.charAt(i - 10)
				&& key.charAt(i - 9) != key.charAt(i - 11) && key.charAt(i - 9) != key.charAt(i - 12) && key.charAt(i - 9) != key.charAt(i - 13)
				&& key.charAt(i - 10) != key.charAt(i - 11) && key.charAt(i - 10) != key.charAt(i - 12)
				&& key.charAt(i - 10) != key.charAt(i - 13) && key.charAt(i - 11) != key.charAt(i - 12)
				&& key.charAt(i - 11) != key.charAt(i - 13) && key.charAt(i - 12) != key.charAt(i - 13)) {
					returnNum = i;
					break;
			}
		}
		return returnNum;
	}
}
