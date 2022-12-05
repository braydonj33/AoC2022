package main;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Day5Part1 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner stdin = new Scanner(new File("input.txt"));
		String stack1 = "";
		String stack2 = "";
		String stack3 = "";
		String stack4 = "";
		String stack5 = "";
		String stack6 = "";
		String stack7 = "";
		String stack8 = "";
		String stack9 = "";
		int lineNum = 0;
		while (lineNum < 8) {
			String next = stdin.nextLine();
			if (next.equals(""))
				break;
			if (next.charAt(1) != ' ')
				stack1 = next.charAt(1) + stack1;
			if (next.charAt(5) != ' ')
				stack2 = next.charAt(5) + stack2;
			if (next.charAt(9) != ' ')
				stack3 = next.charAt(9) + stack3;
			if (next.charAt(13) != ' ')
				stack4 = next.charAt(13) + stack4;
			if (next.charAt(17) != ' ')
				stack5 = next.charAt(17) + stack5;
			if (next.charAt(21) != ' ')
				stack6 = next.charAt(21) + stack6;
			if (next.charAt(25) != ' ')
				stack7 = next.charAt(25) + stack7;
			if (next.charAt(29) != ' ')
				stack8 = next.charAt(29) + stack8;
			if (next.charAt(33) != ' ')
				stack9 = next.charAt(33) + stack9;
		lineNum += 1;
		}
		while (stdin.hasNextLine()) {
			String next = stdin.nextLine();
			if (next.equals(""))
				continue;
			if (next.charAt(1) == '1')
				continue;
			int moveNum;
			int fromStack;
			int toStack;
			if (next.charAt(6) == ' ') {
				moveNum = Integer.parseInt(String.valueOf(next.charAt(5)));
				fromStack = Integer.parseInt(String.valueOf(next.charAt(12)));
				toStack = Integer.parseInt(String.valueOf(next.charAt(17)));
			} else {
				fromStack = Integer.parseInt(String.valueOf(next.charAt(13)));
				toStack = Integer.parseInt(String.valueOf(next.charAt(18)));
				moveNum = Integer.parseInt(String.valueOf(next.charAt(5))) * 10;
				moveNum += Integer.parseInt(String.valueOf(next.charAt(6)));
			}
			String fromStackStr = "";
			switch (fromStack) {
			case 1:
				fromStackStr = stack1;
				stack1 = moveFrom(stack1, moveNum);
				break;
			case 2:
				fromStackStr = stack2;
				stack2 = moveFrom(stack2, moveNum);
				break;
			case 3:
				fromStackStr = stack3;
				stack3 = moveFrom(stack3, moveNum);
				break;
			case 4:
				fromStackStr = stack4;
				stack4 = moveFrom(stack4, moveNum);
				break;
			case 5:
				fromStackStr = stack5;
				stack5 = moveFrom(stack5, moveNum);
				break;
			case 6:
				fromStackStr = stack6;
				stack6 = moveFrom(stack6, moveNum);
				break;
			case 7:
				fromStackStr = stack7;
				stack7 = moveFrom(stack7, moveNum);
				break;
			case 8:
				fromStackStr = stack8;
				stack8 = moveFrom(stack8, moveNum);
				break;
			case 9:
				fromStackStr = stack9;
				stack9 = moveFrom(stack9, moveNum);
				break;
			}
			switch (toStack) {
			case 1:
				stack1 = moveTo(fromStackStr, stack1, moveNum);
				break;
			case 2:
				stack2 = moveTo(fromStackStr, stack2, moveNum);
				break;
			case 3:
				stack3 = moveTo(fromStackStr, stack3, moveNum);
				break;
			case 4:
				stack4 = moveTo(fromStackStr, stack4, moveNum);
				break;
			case 5:
				stack5 = moveTo(fromStackStr, stack5, moveNum);
				break;
			case 6:
				stack6 = moveTo(fromStackStr, stack6, moveNum);
				break;
			case 7:
				stack7 = moveTo(fromStackStr, stack7, moveNum);
				break;
			case 8:
				stack8 = moveTo(fromStackStr, stack8, moveNum);
				break;
			case 9:
				stack9 = moveTo(fromStackStr, stack9, moveNum);
				break;
			}
		}
		System.out.println(stack1);
		System.out.println(stack2);
		System.out.println(stack3);
		System.out.println(stack4);
		System.out.println(stack5);
		System.out.println(stack6);
		System.out.println(stack7);
		System.out.println(stack8);
		System.out.println(stack9);
	}
	
	public static String moveFrom(String stack, int moveNum) {
		String returnStack = "";
		for (int i = 0; i < stack.length() - moveNum; i++) {
			returnStack += stack.charAt(i); 
		}
		return returnStack;
	}
	
	public static String moveTo(String fromStack, String toStack, int moveNum) {
		String returnStack = toStack;
		if (moveNum > fromStack.length())
			moveNum = fromStack.length();
		for (int i = 0; i < moveNum; i++) {
			returnStack += fromStack.charAt(fromStack.length() - i - 1);
		}
		return returnStack;
	}
}
