import java.util.Scanner;

public class calsNumPart2 {
   public static void main(String[] args) {
      Scanner stdin = new Scanner(System.in);
      double mostNum = 0;
      double secondNum = 0;
      double thirdNum = 0;
      double totalNum = 0;
      double currentNum = 0;
      while (stdin.hasNextLine()) {
         String next = stdin.nextLine();
         if (next.equals("")) {
            if (currentNum > mostNum) {
               thirdNum = secondNum;
               secondNum = mostNum;
               mostNum = currentNum;
            } else if (currentNum > secondNum) {
               thirdNum = secondNum;
               secondNum = currentNum;
            } else if (currentNum > thirdNum) {
               thirdNum = currentNum;
            }
            currentNum = 0;
         } else {
            currentNum += Double.parseDouble(next);
         }
      }
      if (currentNum != 0) {
         if (currentNum > mostNum) {
            thirdNum = secondNum;
            secondNum = mostNum;
            mostNum = currentNum;
         } else if (currentNum > secondNum) {
            thirdNum = secondNum;
            secondNum = currentNum;
         } else if (currentNum > thirdNum) {
            thirdNum = currentNum;
         }
         currentNum = 0;
      }
      totalNum = mostNum + secondNum + thirdNum;
      System.out.println(totalNum);
      stdin.close();
   }
}
