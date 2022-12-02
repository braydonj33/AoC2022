package main;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class RPSPart2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner stdin = new Scanner(System.in);
		int score = 0;
		while(stdin.hasNextLine()) {
			String elf = stdin.next();
			String me = stdin.next();
			score += score(elf, me);
		}
		System.out.println(score);
	}
	
	public static int score(String elf, String me) {
		int score = 0;
		if (elf.equals("A") && me.equals("Y"))
			score = 4;
		if (elf.equals("B") && me.equals("Y"))
			score = 5;
		if (elf.equals("C") && me.equals("Y"))
			score = 6;
		if (elf.equals("A") && me.equals("X"))
			score = 3;
		if (elf.equals("B") && me.equals("X"))
			score = 1;
		if (elf.equals("C") && me.equals("X"))
			score = 2;
		if (elf.equals("A") && me.equals("Z"))
			score = 8;
		if (elf.equals("B") && me.equals("Z"))
			score = 9;
		if (elf.equals("C") && me.equals("Z"))
			score = 7;
		return score;
	}
}
