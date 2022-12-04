package main;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class CalsNum {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner stdin = new Scanner(new File("input.txt"));
		int containCnt = 0;
		while (stdin.hasNextLine()) {
			String elf = stdin.nextLine();
			String elf1 = "";
			String elf2 = "";
			int letterCnt = 0;
			while (elf.charAt(letterCnt) != ',') {
				elf1 += elf.charAt(letterCnt);
				letterCnt++;
			}
			letterCnt += 1;
			while (letterCnt < elf.length()) {
				elf2 += elf.charAt(letterCnt);
				letterCnt++;
			}
			if (contains(elf1, elf2))
				containCnt++;
		}
		System.out.println(containCnt);
	}
	
	public static boolean contains (String elf1, String elf2) {
		int cnt = 0;
		int elf1sec1 = 0;
		int elf1sec2 = 0;
		int elf2sec1 = 0;
		int elf2sec2 = 0;
		String elf1sec1Str  = "";
		String elf1sec2Str  = "";
		String elf2sec1Str  = "";
		String elf2sec2Str  = "";
		while (elf1.charAt(cnt) != '-') {
			elf1sec1Str += elf1.charAt(cnt);
			cnt++;
		}
		cnt += 1;
		while (cnt < elf1.length()) {
			elf1sec2Str += elf1.charAt(cnt);
			cnt++;
		}
		cnt = 0;
		while (elf2.charAt(cnt) != '-') {
			elf2sec1Str += elf2.charAt(cnt);
			cnt++;
		}
		cnt += 1;
		while (cnt < elf2.length()) {
			elf2sec2Str += elf2.charAt(cnt);
			cnt++;
		}
		elf1sec1 = Integer.parseInt(elf1sec1Str);
		elf1sec2 = Integer.parseInt(elf1sec2Str);
		elf2sec1 = Integer.parseInt(elf2sec1Str);
		elf2sec2 = Integer.parseInt(elf2sec2Str);
		if (elf1sec1 >= elf2sec1 && elf1sec2 <= elf2sec2)
			return true;
		if (elf2sec1 >= elf1sec1 && elf2sec2 <= elf1sec2)
			return true;
		return false;
	}
}
