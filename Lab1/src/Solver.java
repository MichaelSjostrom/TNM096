import java.util.Arrays;
import java.util.PriorityQueue;

public class Solver {
	
	String[] sol = {"1", "2", "3", "4", "5", "6", "7", "8", "0"};
	
	public Solver(){}
	
	public Solver(Board init){}
	
	public int moves(){
		return 1;
	}
	
	public Iterable<String> solution(){
		return Arrays.asList(sol);
	}
	
	public static void main(String[] args){ // some code here
		System.out.println("running");
		
		int[][] blocks = new int[3][3];
		
		//Hårdkodat for now..
		blocks[0][0] = 0;
		blocks[0][1] = 1;
		blocks[0][2] = 3;
		blocks[1][0] = 4;
		blocks[1][1] = 2;
		blocks[1][2] = 5;
		blocks[2][0] = 7;
		blocks[2][1] = 8;
		blocks[2][2] = 6;
		
		int[][] blocks2 = new int[3][3];
		
		blocks2[0][0] = 1;
		blocks2[0][1] = 2;
		blocks2[0][2] = 3;
		blocks2[1][0] = 4;
		blocks2[1][1] = 5;
		blocks2[1][2] = 6;
		blocks2[2][0] = 7;
		blocks2[2][1] = 8;
		blocks2[2][2] = 0;
		
		Board initial = new Board(blocks);
		Board initial2 = new Board(blocks2);
		
		System.out.println(initial.toString());
		
		initial.isGoal();
		initial2.isGoal();
		initial.equals(initial);
		
		PriorityQueue<Board> pq = new PriorityQueue<Board>();
		
		pq.add(initial);
		
	}	
}
