package main;
import java.util.Scanner;
public class Day3Part1 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int priorityTotal = 0;
		while(stdin.hasNextLine()) {
			String next = stdin.nextLine();
         String first = "";
         String second = "";
         for (int i = 0; i < next.length() / 2; i++) {
            if (first.indexOf(next.charAt(i)) == -1)
               first += next.charAt(i);
         }
         for (int i = next.length() / 2; i < next.length(); i++) {
            if (second.indexOf(next.charAt(i)) == -1)
               second += next.charAt(i);
         }
         
         for (int i = 0; i < first.length(); i++) {
            for (int j = 0; j < second.length(); j++) {
               if (first.charAt(i) == second.charAt(j)) {
                  priorityTotal += priority(second.charAt(j));
                  break;
               }
            }
         }
		}
		System.out.println(priorityTotal);
	}
	
   public static int priority(char ch) {
      int priority = 0;
      switch (ch) {
         case 'a':
            priority = 1;
            break;
         case 'b':
            priority = 2;
            break;
         case 'c':
            priority = 3;
            break;
         case 'd':
            priority = 4;
            break;
         case 'e':
            priority = 5;
            break;
         case 'f':
            priority = 6;
            break;
         case 'g':
            priority = 7;
            break;
         case 'h':
            priority = 8;
            break;
         case 'i':
            priority = 9;
            break;
         case 'j':
            priority = 10;
            break;
         case 'k':
            priority = 11;
            break;
         case 'l':
            priority = 12;
            break;
         case 'm':
            priority = 13;
            break;
         case 'n':
            priority = 14;
            break;
         case 'o':
            priority = 15;
            break;
         case 'p':
            priority = 16;
            break;
         case 'q':
            priority = 17;
            break;
         case 'r':
            priority = 18;
            break;
         case 's':
            priority = 19;
            break;
         case 't':
            priority = 20;
            break;
         case 'u':
            priority = 21;
            break;
         case 'v':
            priority = 22;
            break;
         case 'w':
            priority = 23;
            break;
         case 'x':
            priority = 24;
            break;
         case 'y':
            priority = 25;
            break;
         case 'z':
            priority = 26;
            break;
         case 'A':
            priority = 27;
            break;
         case 'B':
            priority = 28;
            break;
         case 'C':
            priority = 29;
            break;
         case 'D':
            priority = 30;
            break;
         case 'E':
            priority = 31;
            break;
         case 'F':
            priority = 32;
            break;
         case 'G':
            priority = 33;
            break;
         case 'H':
            priority = 34;
            break;
         case 'I':
            priority = 35;
            break;
         case 'J':
            priority = 36;
            break;
         case 'K':
            priority = 37;
            break;
         case 'L':
            priority = 38;
            break;
         case 'M':
            priority = 39;
            break;
         case 'N':
            priority = 40;
            break;
         case 'O':
            priority = 41;
            break;
         case 'P':
            priority = 42;
            break;
         case 'Q':
            priority = 43;
            break;
         case 'R':
            priority = 44;
            break;
         case 'S':
            priority = 45;
            break;
         case 'T':
            priority = 46;
            break;
         case 'U':
            priority = 47;
            break;
         case 'V':
            priority = 48;
            break;
         case 'W':
            priority = 49;
            break;
         case 'X':
            priority = 50;
            break;
         case 'Y':
            priority = 51;
            break;
         case 'Z':
            priority = 52;
            break;
         default:
            priority = 0;
            break;
      }
      return priority;
   }
}
