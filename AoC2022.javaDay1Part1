import java.util.Scanner;

public class calsNum {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		double mostNum = 0;
		double currentNum = 0;
		while(stdin.hasNextLine()) {
		   String next = stdin.nextLine();
			if (next.equals("")) {
				if (currentNum > mostNum)
					mostNum = currentNum;
				currentNum = 0;
			} else {
				currentNum += Double.parseDouble(next);
			}
		}
		System.out.println(mostNum);
		stdin.close();
	}
}
