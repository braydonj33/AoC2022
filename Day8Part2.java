package main;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class calsNum {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner stdin = new Scanner(System.in);
		int highestScenic = 0;
		String[] trees = new String[100];
		int cnt = 0;
		while(stdin.hasNextLine()) {
			String next = stdin.nextLine();
			trees[cnt] = next;
			cnt++;
		}
		for (int i = 1; i < cnt - 1; i++) {
		   for (int j = 1; j < trees[0].length() - 1; j++) {
		      int scenic = -1;
		      if (visibleHorizontal(trees, i, j) || visibleVertical(trees, i, j, cnt))
		         scenic = checkScenic(trees, i, j, cnt);
		         if (scenic > highestScenic)
		            highestScenic = scenic;
		   }
		}
		System.out.println(highestScenic);
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
	public static int checkScenic(String[] trees, int rowNum, int lineNum, int lineCnt) {
	   int scenicL = 0;
	   int scenicR = 0;
	   int scenicU = 0;
	   int scenicD = 0;
	   int checkNum = Integer.parseInt(String.valueOf(trees[rowNum].charAt(lineNum)));
	   for (int i = lineNum - 1; i >= 0; i--) {
	      int num = Integer.parseInt(String.valueOf(trees[rowNum].charAt(i)));
	      if (checkNum > num)
	         scenicL++;
	      else {
	         scenicL++;
	         break;
	      }
	   }
	   for (int i = lineNum + 1; i < trees[0].length(); i++) {
	      int num = Integer.parseInt(String.valueOf(trees[rowNum].charAt(i)));
	      if (checkNum > num) 
	         scenicR++;
	      else {
	         scenicR++;
	         break;
	      }
	   }
	   for (int i = rowNum - 1; i >= 0; i--) {
	      int num = Integer.parseInt(String.valueOf(trees[i].charAt(lineNum)));
	      if (checkNum > num) 
	         scenicU++;
	      else {
	         scenicU++;
	         break;
	      }
	   }
	   for (int i = rowNum + 1; i < lineCnt; i++) {
	      int num = Integer.parseInt(String.valueOf(trees[i].charAt(lineNum)));
	      if (checkNum > num) 
	         scenicD++;
	      else {
	         scenicD++;
	         break;
	      }
	   }
	   return scenicL * scenicR * scenicU * scenicD;
	}
}
