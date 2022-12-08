package main;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class calsNum {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner stdin = new Scanner(System.in);
		int visTotal = 0;
		String[] trees = new String[100];
		int cnt = 0;
		while(stdin.hasNextLine()) {
			String next = stdin.nextLine();
			trees[cnt] = next;
			cnt++;
		}
		visTotal += trees[0].length() * 2;
		visTotal += cnt * 2;
		visTotal -= 4;
		for (int i = 1; i < cnt - 1; i++) {
		   for (int j = 1; j < trees[0].length() - 1; j++) {
		      if (visibleHorizontal(trees, i, j) || visibleVertical(trees, i, j, cnt))
		         visTotal++;
		   }
		}
		System.out.println(visTotal);
	}
	public static boolean visibleHorizontal(String[] trees, int rowNum, int lineNum) {
	   boolean vis = true;
	   boolean vis2 = true;
	   boolean finalVis = false;
	   int checkNum = Integer.parseInt(String.valueOf(trees[rowNum].charAt(lineNum)));
	   for (int i = lineNum - 1; i >= 0; i--) {
	      int num = Integer.parseInt(String.valueOf(trees[rowNum].charAt(i)));
	      if (checkNum <= num) {
	         vis = false;
	         break;
	      }
	   }
	   for (int i = lineNum + 1; i < trees[0].length(); i++) {
	      int num = Integer.parseInt(String.valueOf(trees[rowNum].charAt(i)));
	      if (checkNum <= num) {
	         vis2 = false;
	         break;
	      }
	   }
	   if (vis || vis2)
	      finalVis = true;
	   return finalVis;
	}
	public static boolean visibleVertical(String[] trees, int rowNum, int lineNum, int lineCnt) {
	   boolean vis = true;
	   boolean vis2 = true;
	   boolean finalVis = false;
	   int checkNum = Integer.parseInt(String.valueOf(trees[rowNum].charAt(lineNum)));
	   for (int i = rowNum - 1; i >= 0; i--) {
	      int num = Integer.parseInt(String.valueOf(trees[i].charAt(lineNum)));
	      if (checkNum <= num) {
	         vis = false;
	         break;
	      }
	   }
	   for (int i = rowNum + 1; i < lineCnt; i++) {
	      int num = Integer.parseInt(String.valueOf(trees[i].charAt(lineNum)));
	      if (checkNum <= num) {
	         vis2 = false;
	         break;
	      }
	   }
	   if (vis || vis2)
	      finalVis = true;
	     return finalVis;
	}
}
