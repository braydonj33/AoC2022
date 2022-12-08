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
		//for (int i = 1; i < trees[0].length() - 1; i++) {
		//   visTotal += visibleVertical(trees, i, cnt);
		//}
		System.out.println(visTotal);
	}
	
   /*public static int visibleVertical(String[] trees, int num, int lineCnt) {
	   int visCnt = 0;
	   boolean vis = true;
	   boolean vis2 = true;
	   for (int i = 1; i < lineCnt - 1; i++) {
	      int intNum = Integer.parseInt(String.valueOf(trees[i].charAt(num)));
	      for (int j = i - 1; j >= 0; j--) {
	         int num2 = Integer.parseInt(String.valueOf(trees[j].charAt(num)));
	         if (intNum <= num2)
	            vis = false;
	      }
	      for (int j = i + 1; j < lineCnt; j++) {
	         int num2 = Integer.parseInt(String.valueOf(trees[j].charAt(num)));
	         if (intNum <= num2)
	            vis2 = false;
	      }
	      if (vis || vis2)
	         visCnt++;
	   }
	   return visCnt;
	}*/
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
