package main;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;

public class calsNum {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner stdin = new Scanner(System.in);
		Point head = new Point();
		Point tail = new Point();
		int posVisited = 1;
		while(stdin.hasNextLine()) {
			String next = stdin.nextLine();
			StringTokenizer st = new StringTokenizer(next);
			String direction = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			switch(direction) {
				case "L":
					for (int i = 0; i < num; i++) {
					   head.moveLeft(1);
					   //System.out.println("head: " + head.getX() + ", " + head.getY());
					   if (tail.getX() - 2 == head.getX() && tail.getY() + 1 == head.getY()) {
					      tail.moveUpLeft();
					      if (!tail.hasVisited())
					         posVisited++;
					   }
					   if (tail.getX() - 2 == head.getX() && tail.getY() - 1 == head.getY()) {
					      tail.moveDownLeft();
					      if (!tail.hasVisited())
					         posVisited++;
					   }
					   while (tail.getX() - 1 > head.getX()) {
					      tail.moveLeft(1);
					      if (!tail.hasVisited())
					         posVisited++;
					   }
					   //System.out.println("tail: " + tail.getX() + ", " + tail.getY());
					   //System.out.println("posNum: " + posVisited);
					}
					break;
				case "R":
					for (int i = 0; i < num; i++) {
					   head.moveRight(1);
					   //System.out.println("head: " + head.getX() + ", " + head.getY());
					   if (tail.getX() + 2 == head.getX() && tail.getY() + 1 == head.getY()) {
					      tail.moveUpRight();
					      if (!tail.hasVisited())
					         posVisited++;
					   }
					   if (tail.getX() + 2 == head.getX() && tail.getY() - 1 == head.getY()) {
					      tail.moveDownRight();
					      if (!tail.hasVisited())
					         posVisited++;
					   }
					   while (tail.getX() + 1 < head.getX()) {
					      tail.moveRight(1);
					      if (!tail.hasVisited())
					         posVisited++;
					   }
					   //System.out.println("tail: " + tail.getX() + ", " + tail.getY());
					   //System.out.println("posNum: " + posVisited);
					}
					break;
				case "U":
					for (int i = 0; i < num; i++) {
					   head.moveUp(1);
					   //System.out.println("head: " + head.getX() + ", " + head.getY());
					   if (tail.getY() + 2 == head.getY() && tail.getX() + 1 == head.getX()) {
					      tail.moveUpRight();
					      if (!tail.hasVisited())
					         posVisited++;
					   }
					   if (tail.getY() + 2 == head.getY() && tail.getX() - 1 == head.getX()) {
					      tail.moveUpLeft();
					      if (!tail.hasVisited())
					         posVisited++;
					   }
					   while (tail.getY() + 1 < head.getY()) {
					      tail.moveUp(1);
					      if (!tail.hasVisited())
					         posVisited++;
					   }
					   //System.out.println("tail: " + tail.getX() + ", " + tail.getY());
					   //System.out.println("posNum: " + posVisited);
					}
					break;
				case "D":
					for (int i = 0; i < num; i++) {
					   head.moveDown(1);
					   //System.out.println("head: " + head.getX() + ", " + head.getY());
					   if (tail.getY() - 2 == head.getY() && tail.getX() + 1 == head.getX()) {
					      tail.moveDownRight();
					      if (!tail.hasVisited())
					         posVisited++;
					   }
					   if (tail.getY() - 2 == head.getY() && tail.getX() - 1 == head.getX()) {
					      tail.moveDownLeft();
					      if (!tail.hasVisited())
					         posVisited++;
					   }
					   while (tail.getY() - 1 > head.getY()) {
					      tail.moveDown(1);
					      if (!tail.hasVisited())
					         posVisited++;
					   }
					   //System.out.println("tail: " + tail.getX() + ", " + tail.getY());
					   //System.out.println("posNum: " + posVisited);
					}
					break;
			}

		}
		System.out.println(posVisited);
	}
}

package main;

public class Point {
	public int x;
	public int y;
	public int[] Xs;
	public int[] Ys;
	public int positionNum;
	public Point() {
		this.x = 0;
		this.y = 0;
		this.Xs = new int[100000];
		this.Ys = new int[100000];
		this.positionNum = 0;
		Xs[positionNum] = 0;
		Ys[positionNum] = 0;
		positionNum++;
	}
	
	public void moveUp(int up) {
		for (int i = 0; i < up; i++) {
		   this.y++;
		   Xs[positionNum] = this.x;
		   Ys[positionNum] = this.y;
		   positionNum++;
		}
	}
	public void moveDown(int down) {
		for (int i = 0; i < down; i++) {
		   this.y--;
		   Xs[positionNum] = this.x;
		   Ys[positionNum] = this.y;
		   positionNum++;
		}
	}
	public void moveLeft(int left) {
		for (int i = 0; i < left; i++) {
		   this.x--;
		   Xs[positionNum] = this.x;
		   Ys[positionNum] = this.y;
		   positionNum++;
		}
	}
	public void moveRight(int right) {
		for (int i = 0; i < right; i++) {
		   this.x++;
		   Xs[positionNum] = this.x;
		   Ys[positionNum] = this.y;
		   positionNum++;
		}
	}
	public void moveDownLeft() {
	   this.x--;
	   this.y--;
	   Xs[positionNum] = this.x;
		Ys[positionNum] = this.y;
		positionNum++;
	}
	public void moveDownRight() {
	   this.x++;
	   this.y--;
	   Xs[positionNum] = this.x;
	   Ys[positionNum] = this.y;
	   positionNum++;
	}
	public void moveUpLeft() {
	   this.x--;
	   this.y++;
	   Xs[positionNum] = this.x;
	   Ys[positionNum] = this.y;
	   positionNum++;
	}
	public void moveUpRight() {
	   this.x++;
	   this.y++;
	   Xs[positionNum] = this.x;
	   Ys[positionNum] = this.y;
	   positionNum++;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public boolean hasVisited() {
		boolean visited = false;
		for (int i = 0; i < positionNum - 1; i++) {
			if (Xs[i] == this.x && Ys[i] == this.y) {
				visited = true;
				break;
			}
		}
		return visited;
	}
}
