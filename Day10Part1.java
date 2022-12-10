package main;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class AOC {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner stdin = new Scanner(new File("input.txt"));
		PrintWriter prt = new PrintWriter("output.txt");
		int cycle = 0;
		int register = 1;
		int finalStrength = 0;
		while (stdin.hasNextLine()) {
			String next = stdin.nextLine();
			StringTokenizer st = new StringTokenizer(next);
			if (next.equals("noop")) {
				cycle++;
				//prt.println("cycle: " + cycle + "(noop)");
				if (cycle == 20 || cycle == 60 || cycle == 100 || cycle == 140 || cycle == 180 || cycle == 220) {
					finalStrength += (register * cycle);
					System.out.println(register * cycle);
					System.out.println(register);
					System.out.println(cycle);
					System.out.println(finalStrength);
				}
			}
			else {
				String temp = st.nextToken();
				int mult = Integer.parseInt(st.nextToken());
				cycle += 1;
				//prt.println("cycle: " + cycle);
				if (cycle == 20 || cycle == 60 || cycle == 100 || cycle == 140 || cycle == 180 || cycle == 220) {
					finalStrength += (register * cycle);
					System.out.println(register * cycle);
					System.out.println(register);
					System.out.println(cycle);
					System.out.println(finalStrength);
				}
				cycle += 1;
				if (cycle == 20 || cycle == 60 || cycle == 100 || cycle == 140 || cycle == 180 || cycle == 220) {
					finalStrength += (register * cycle);
					System.out.println(register * cycle);
					System.out.println(register);
					System.out.println(cycle);
					System.out.println(finalStrength);
				}
				register += mult;
			}
		}
		System.out.println(finalStrength);
		prt.close();
	}
}
