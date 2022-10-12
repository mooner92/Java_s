import java.util.*;
abstract class Sprite {
	int x=3, y=3;
	abstract void move(char c);
}
class Main extends Sprite {
	void move(char c) {
		if( c=='h') --x;
		else if(c=='j') --y;
		else if(c=='k') ++y;
		else if(c=='l') ++x;
	}
}

class Monster extends Sprite {
	public Monster() {
		x = y =7;
	}
	void move(char c) {
		x += (Math.random()-0.5)>0 ? 1: -1;
		y += (Math.random()-0.5)>0 ? 1: -1;
	}
}

public class hw_n_goldgame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] board = new String[10][17];
		for(int i=0;i<10;i++) {
			for(int j=0;j<17;j++) {
				board[i][j] = " ";
			}
		}
		board[7][2] = "G"; //골드 위치
		Main me = new Main();
		board[me.y][me.x] = "@"; //주인공 위치
		Monster m = new Monster();
		board[m.y][m.x] = "M"; //몬스터 위치
		while(true) {
			System.out.print("###################\n");
			for(int i=0;i<10;i++) {
				System.out.print("#");
				for(int j=0;j<17;j++) {
					System.out.print(board[i][j]);
				}
				System.out.print("#\n");
			}
			System.out.print("###################\n");
			System.out.print("왼쪽(h), 위쪽(j), 아래쪽(k), 오른쪽(l): ");
			char input = sc.next().charAt(0);
			board[me.y][me.x] = " ";
			me.move(input);
			board[m.y][m.x] = " ";
			int my= m.y, mx = m.x;
			m.move(input);
			if(m.y<10 && m.x<17) {			
				board[me.y][me.x] = "@";
				board[m.y][m.x] = "M";
			}else {
				board[me.y][me.x] = "@";
				board[my][mx] = "M";
			}
			if(me.y == 7 && me.x ==2) {
				System.out.println("골드 획득! \nYOU WIN");
				break;
			}
			if(me.y == m.y && me.x == m.x) {
				System.out.println("몬스터에게 잡혔습니다! \nGAME OVER");
				break;
			}		
		}
	}
}