package main;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.io.PrintWriter;

public class Day7 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner stdin = new Scanner(new File("input.txt"));
		PrintWriter prt = new PrintWriter("output.txt");
		Point head = new Point();
		Point k1 = new Point();
		Point k2 = new Point();
		Point k3 = new Point();
		Point k4 = new Point();
		Point k5 = new Point();
		Point k6 = new Point();
		Point k7 = new Point();
		Point k8 = new Point();
		Point tail = new Point();
		while(stdin.hasNextLine()) {
			
			String next = stdin.nextLine();
			StringTokenizer st = new StringTokenizer(next);
			String direction = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			/*switch(direction) {
				case "L":
					for (int i = 0; i < num; i++) {
					   head.moveLeft(1);
					   prt.println("left");
					   prt.println("head: " + head.getX() + ", " + head.getY());
					   k1.checkDiagonals(head);
					   while (!k1.closeLeft(head)) {
					      k1.moveLeft(1);
					   }
					   k2.checkDiagonals(k1);
					   while (!k2.closeLeft(k1)) {
					      k2.moveLeft(1);
					   }
					   k3.checkDiagonals(k2);
					   while (!k3.closeLeft(k2)) {
					      k3.moveLeft(1);
					   }
					   k4.checkDiagonals(k3);
					   while (!k4.closeLeft(k3)) {
					      k4.moveLeft(1);
					   }
					   k5.checkDiagonals(k4);
					   while (!k5.closeLeft(k4)) {
					      k5.moveLeft(1);
					   }
					   k6.checkDiagonals(k5);
					   while (!k6.closeLeft(k5)) {
					      k6.moveLeft(1);
					   }
					   k7.checkDiagonals(k6);
					   while (!k7.closeLeft(k6)) {
					      k7.moveLeft(1);
					   }
					   k8.checkDiagonals(k7);
					   while (!k8.closeLeft(k7)) {
					      k8.moveLeft(1);
					   }
					   if (!tail.tailCheckDiagonals(k8))
					   		posVisited++;
					   while (!tail.closeLeft(k8)) {
					      tail.moveLeft(1);
					      if (!tail.hasVisited())
					         posVisited++;
					   }
					   prt.println("k1: " + k1.getX() + ", " + k1.getY());
					   prt.println("k2: " + k2.getX() + ", " + k2.getY());
					   prt.println("k3: " + k3.getX() + ", " + k3.getY());
					   prt.println("k4: " + k4.getX() + ", " + k4.getY());
					   prt.println("k5: " + k5.getX() + ", " + k5.getY());
					   prt.println("k6: " + k6.getX() + ", " + k6.getY());
					   prt.println("k7: " + k7.getX() + ", " + k7.getY());
					   prt.println("k8: " + k8.getX() + ", " + k8.getY());
					   prt.println("tail: " + tail.getX() + ", " + tail.getY());
					   prt.println("posNum: " + posVisited);
					}
					break;
				case "R":
					for (int i = 0; i < num; i++) {
					   head.moveRight(1);
					   prt.println("right");
					   prt.println("head: " + head.getX() + ", " + head.getY());
					   k1.checkDiagonals(head);
					   while (!k1.closeRight(head)) {
					      k1.moveRight(1);
					   }
					   k2.checkDiagonals(k1);
					   while(!k2.closeRight(k1)) {
					      k2.moveRight(1);
					   }
					   k3.checkDiagonals(k2);
					   while(!k3.closeRight(k2)) {
					      k3.moveRight(1);
					   }
					   k4.checkDiagonals(k3);
					   while(!k4.closeRight(k3)) {
					      k4.moveRight(1);
					   }
					   k5.checkDiagonals(k4);
					   while(!k5.closeRight(k4)) {
					      k5.moveRight(1);
					   }
					   k6.checkDiagonals(k5);
					   while(!k6.closeRight(k5)) {
					      k6.moveRight(1);
					   }
					   k7.checkDiagonals(k6);
					   while(!k7.closeRight(k6)) {
					      k7.moveRight(1);
					   }
					   k8.checkDiagonals(k7);
					   while(!k8.closeRight(k7)) {
					      k8.moveRight(1);
					   }
					   if (!tail.tailCheckDiagonals(k8))
						   posVisited++;
					   while(!tail.closeRight(k8)) {
					      tail.moveRight(1);
					      if (!tail.hasVisited())
					         posVisited++;
					   }
					   prt.println("k1: " + k1.getX() + ", " + k1.getY());
					   prt.println("k2: " + k2.getX() + ", " + k2.getY());
					   prt.println("k3: " + k3.getX() + ", " + k3.getY());
					   prt.println("k4: " + k4.getX() + ", " + k4.getY());
					   prt.println("k5: " + k5.getX() + ", " + k5.getY());
					   prt.println("k6: " + k6.getX() + ", " + k6.getY());
					   prt.println("k7: " + k7.getX() + ", " + k7.getY());
					   prt.println("k8: " + k8.getX() + ", " + k8.getY());
					   prt.println("tail: " + tail.getX() + ", " + tail.getY());
					   prt.println("posNum: " + posVisited);
					}
					break;
				case "U":
					for (int i = 0; i < num; i++) {
					   head.moveUp(1);
					   prt.println("up");
					   prt.println("head: " + head.getX() + ", " + head.getY());
					   k1.checkDiagonals(head);
					   while (!k1.closeUp(head)) {
					      k1.moveUp(1);
					   }
					   k2.checkDiagonals(k1);
					   while (!k2.closeUp(k1)) {
					      k2.moveUp(1);
					   }
					   k3.checkDiagonals(k2);
					   while (!k3.closeUp(k2)) {
					      k3.moveUp(1);
					   }
					   k4.checkDiagonals(k3);
					   while (!k4.closeUp(k3)) {
					      k4.moveUp(1);
					   }
					   k5.checkDiagonals(k4);
					   while (!k5.closeUp(k4)) {
					      k5.moveUp(1);
					   }
					   k6.checkDiagonals(k5);
					   while (!k6.closeUp(k5)) {
					      k6.moveUp(1);
					   }
					   k7.checkDiagonals(k6);
					   while (!k7.closeUp(k6)) {
					      k7.moveUp(1);
					   }
					   k8.checkDiagonals(k7);
					   while (!k8.closeUp(k7)) {
					      k8.moveUp(1);
					   }
					   if (!tail.tailCheckDiagonals(k8))
					   		posVisited++;
					   while (!tail.closeUp(k8)) {
					      tail.moveUp(1);
					      if (!tail.hasVisited())
					         posVisited++;
					   }
					   prt.println("k1: " + k1.getX() + ", " + k1.getY());
					   prt.println("k2: " + k2.getX() + ", " + k2.getY());
					   prt.println("k3: " + k3.getX() + ", " + k3.getY());
					   prt.println("k4: " + k4.getX() + ", " + k4.getY());
					   prt.println("k5: " + k5.getX() + ", " + k5.getY());
					   prt.println("k6: " + k6.getX() + ", " + k6.getY());
					   prt.println("k7: " + k7.getX() + ", " + k7.getY());
					   prt.println("k8: " + k8.getX() + ", " + k8.getY());
					   prt.println("tail: " + tail.getX() + ", " + tail.getY());
					   prt.println("posNum: " + posVisited);
					}
					break;
				case "D":
					for (int i = 0; i < num; i++) {
					   head.moveDown(1);
					   prt.println("down");
					   prt.println("head: " + head.getX() + ", " + head.getY());
					   k1.checkDiagonals(head);
					   while (!k1.closeDown(head)) {
					      k1.moveDown(1);
					   }
					   k2.checkDiagonals(k1);
					   while (!k2.closeDown(k1)) {
					      k2.moveDown(1);
					   }
					   k3.checkDiagonals(k2);
					   while (!k3.closeDown(k2)) {
					      k3.moveDown(1);
					   }
					   k4.checkDiagonals(k3);
					   while (!k4.closeDown(k3)) {
					      k4.moveDown(1);
					   }
					   k5.checkDiagonals(k4);
					   while (!k5.closeDown(k4)) {
					      k5.moveDown(1);
					   }
					   k6.checkDiagonals(k5);
					   while (!k6.closeDown(k5)) {
					      k6.moveDown(1);
					   }
					   k7.checkDiagonals(k6);
					   while (!k7.closeDown(k6)) {
					      k7.moveDown(1);
					   }
					   k8.checkDiagonals(k7);
					   while (!k8.closeDown(k7)) {
					      k8.moveDown(1);
					   }
					   if (!tail.tailCheckDiagonals(k8))
						   posVisited++;
					   while (!tail.closeDown(k8)) {
					      tail.moveDown(1);
					      if (!tail.hasVisited())
					         posVisited++;
					   }
					   prt.println("k1: " + k1.getX() + ", " + k1.getY());
					   prt.println("k2: " + k2.getX() + ", " + k2.getY());
					   prt.println("k3: " + k3.getX() + ", " + k3.getY());
					   prt.println("k4: " + k4.getX() + ", " + k4.getY());
					   prt.println("k5: " + k5.getX() + ", " + k5.getY());
					   prt.println("k6: " + k6.getX() + ", " + k6.getY());
					   prt.println("k7: " + k7.getX() + ", " + k7.getY());
					   prt.println("k8: " + k8.getX() + ", " + k8.getY());
					   prt.println("tail: " + tail.getX() + ", " + tail.getY());
					   prt.println("posNum: " + posVisited);
					}
					break;
			}*/
			for (int i = 0; i < num; i++) {
				switch (direction) {
					case "U":
						head.moveUp(1);
						break;
					case "D":
						head.moveDown(1);
						break;
					case "L":
						head.moveLeft(1);
						break;
					case "R":
						head.moveRight(1);
						break;
				}
				k1.closeSides(head);
				k2.closeSides(k1);
				k3.closeSides(k2);
				k4.closeSides(k3);
				k5.closeSides(k4);
				k6.closeSides(k5);
				k7.closeSides(k6);
				k8.closeSides(k7);
				tail.tailCloseSides(k8);
				prt.println("head: " + head.getX() + ", " + head.getY());
				prt.println("k1: " + k1.getX() + ", " + k1.getY());
				prt.println("k2: " + k2.getX() + ", " + k2.getY());
				prt.println("k3: " + k3.getX() + ", " + k3.getY());
				prt.println("k4: " + k4.getX() + ", " + k4.getY());
				prt.println("k5: " + k5.getX() + ", " + k5.getY());
				prt.println("k6: " + k6.getX() + ", " + k6.getY());
				prt.println("k7: " + k7.getX() + ", " + k7.getY());
				prt.println("k8: " + k8.getX() + ", " + k8.getY());
				prt.println("tail: " + tail.getX() + ", " + tail.getY());
				prt.println("posNum: " + tail.getVisits());
			}
		}
		System.out.println(tail.getVisits());
		prt.close();
	}
}

package main;

public class Point {
	public int x;
	public int y;
	public int[] Xs;
	public int[] Ys;
	public int positionNum;
	public int visitNum;
	public Point() {
		this.x = 0;
		this.y = 0;
		this.Xs = new int[20000000];
		this.Ys = new int[20000000];
		this.positionNum = 0;
		Xs[positionNum] = 0;
		Ys[positionNum] = 0;
		positionNum++;
		this.visitNum = 1;
	}
	
	public void moveUp(int up) {
		for (int i = 0; i < up; i++) {
		   this.y++;
		   Xs[positionNum] = this.x;
		   Ys[positionNum] = this.y;
		   positionNum++;
		   if (!this.hasVisited())
			   this.visitNum++;
		}
	}
	public void moveDown(int down) {
		for (int i = 0; i < down; i++) {
		   this.y--;
		   Xs[positionNum] = this.x;
		   Ys[positionNum] = this.y;
		   positionNum++;
		   if (!this.hasVisited())
			   this.visitNum++;
		}
	}
	public void moveLeft(int left) {
		for (int i = 0; i < left; i++) {
		   this.x--;
		   Xs[positionNum] = this.x;
		   Ys[positionNum] = this.y;
		   positionNum++;
		   if (!this.hasVisited())
			   this.visitNum++;
		}
	}
	public void moveRight(int right) {
		for (int i = 0; i < right; i++) {
		   this.x++;
		   Xs[positionNum] = this.x;
		   Ys[positionNum] = this.y;
		   positionNum++;
		   if (!this.hasVisited())
			   this.visitNum++;
		}
	}
	public void moveDownLeft() {
	   this.x--;
	   this.y--;
	   Xs[positionNum] = this.x;
	   Ys[positionNum] = this.y;
	   positionNum++;
	   if (!this.hasVisited())
		   this.visitNum++;
	}
	public void moveDownRight() {
	   this.x++;
	   this.y--;
	   Xs[positionNum] = this.x;
	   Ys[positionNum] = this.y;
	   positionNum++;
	   if (!this.hasVisited())
		   this.visitNum++;
	}
	public void moveUpLeft() {
	   this.x--;
	   this.y++;
	   Xs[positionNum] = this.x;
	   Ys[positionNum] = this.y;
	   positionNum++;
	   if (!this.hasVisited())
		   this.visitNum++;
	}
	public void moveUpRight() {
	   this.x++;
	   this.y++;
	   Xs[positionNum] = this.x;
	   Ys[positionNum] = this.y;
	   positionNum++;
	   if (!this.hasVisited())
		   this.visitNum++;
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
	public boolean closeLeft(Point k1) {
	   boolean close = true;
	   if (this.x - 1 > k1.x)
	      close = false;
	   return close;
	}
	public boolean closeRight(Point k1) {
	   boolean close = true;
	   if (this.x + 1 < k1.x)
	      close = false;
	   return close;
	}
	public boolean closeUp(Point k1) {
	   boolean close = true;
	   if (this.y + 1 < k1.y)
	      close = false;
	   return close;
	}
	public boolean closeDown(Point k1) {
	   boolean close = true;
	   if (this.y - 1 > k1.y)
	      close = false;
	   return close;
	}
	public void addVisit() {
		this.visitNum++;
	}
	public int getVisits() {
		return this.visitNum;
	}
	public void checkDiagonals(Point k1) {
		if (this.getX() - 2 == k1.getX() && this.getY() + 1 == k1.getY())
			this.moveUpLeft();
		else if (this.getX() - 2 == k1.getX() && this.getY() - 1 == k1.getY())
			this.moveDownLeft();
		else if (this.getX() + 2 == k1.getX() && this.getY() + 1 == k1.getY())
			this.moveUpRight();
		else if (this.getX() + 2 == k1.getX() && this.getY() - 1 == k1.getY())
			this.moveDownRight();
		else if (this.getY() + 2 == k1.getY() && this.getX() + 1 == k1.getX())
			this.moveUpRight();
		else if (this.getY() + 2 == k1.getY() && this.getX() - 1 == k1.getX())
			this.moveUpLeft();
		else if (this.getY() - 2 == k1.getY() && this.getX() + 1 == k1.getX())
			this.moveDownRight();
		else if (this.getY() - 2 == k1.getY() && this.getX() - 1 == k1.getX())
			this.moveDownLeft();
		else if (this.getX() + 2 == k1.getX() && this.getY() + 2 == k1.getY())
			this.moveUpRight();
		else if (this.getX() + 2 == k1.getX() && this.getY() - 2 == k1.getY())
			this.moveDownRight();
		else if (this.getX() - 2 == k1.getX() && this.getY() + 2 == k1.getY())
			this.moveUpLeft();
		else if (this.getX() - 2 == k1.getX() && this.getY() - 2 == k1.getY())
			this.moveDownLeft();
	}
	public void tailCheckDiagonals(Point k1) {
		boolean moved = false;
		if (this.getX() - 2 == k1.getX() && this.getY() + 1 == k1.getY()) {
			this.moveUpLeft();
			moved = true;
		}
		else if (this.getX() - 2 == k1.getX() && this.getY() - 1 == k1.getY()) {
			this.moveDownLeft();
			moved = true;
		}
		else if (this.getX() + 2 == k1.getX() && this.getY() + 1 == k1.getY()) {
			this.moveUpRight();
			moved = true;
		}
		else if (this.getX() + 2 == k1.getX() && this.getY() - 1 == k1.getY()) {
			this.moveDownRight();
			moved = true;
		}
		else if (this.getY() + 2 == k1.getY() && this.getX() + 1 == k1.getX()) {
			this.moveUpRight();
			moved = true;
		}
		else if (this.getY() + 2 == k1.getY() && this.getX() - 1 == k1.getX()) {
			this.moveUpLeft();
			moved = true;
		}
		else if (this.getY() - 2 == k1.getY() && this.getX() + 1 == k1.getX()) {
			this.moveDownRight();
			moved = true;
		}
		else if (this.getY() - 2 == k1.getY() && this.getX() - 1 == k1.getX()) {
			this.moveDownLeft();
			moved = true;
		}
		else if (this.getX() + 2 == k1.getX() && this.getY() + 2 == k1.getX()) {
			this.moveUpRight();
			moved = true;
		}
		else if (this.getX() + 2 == k1.getX() && this.getY() - 2 == k1.getX()) {
			this.moveDownRight();
			moved = true;
		}
		else if (this.getX() - 2 == k1.getX() && this.getY() + 2 == k1.getY()) {
			this.moveUpLeft();
			moved = true;
		}
		else if (this.getX() - 2 == k1.getX() && this.getY() - 2 == k1.getY()) {
			this.moveDownLeft();
			moved = true;
		}
		//if (moved)
		//	return true;
		//return false;
	}
	public void closeSides(Point k1) {
		this.checkDiagonals(k1);
		if (this.x + 1 != k1.x && this.x - 1 != k1.x && this.y + 1 != k1.y && this.y - 1 != k1.y) {
			if (this.x < k1.x - 1) {
				this.moveRight(1);
			}
			else if (this.x > k1.x + 1) {
				this.moveLeft(1);
			}
			else if (this.y < k1.y - 1) {
				this.moveUp(1);
			}
			else if (this.y > k1.y + 1) {
				this.moveDown(1);
			}
		}
	}
	public void tailCloseSides(Point k1) {
		boolean diagonal = false;
		this.checkDiagonals(k1);

			if (this.x < k1.x - 1) {
				this.moveRight(1);
				//if (!this.hasVisited())
				//	this.visitNum++;
			}
			else if (this.x > k1.x + 1) {
				this.moveLeft(1);
				//if (!this.hasVisited())
				//	this.visitNum++;
			}
			else if (this.y < k1.y - 1) {
				this.moveUp(1);
				//if (!this.hasVisited())
				//	this.visitNum++;
			}
			else if (this.y > k1.y + 1) {
				this.moveDown(1);
				//if (!this.hasVisited())
				//	this.visitNum++;
			}
	}
}
