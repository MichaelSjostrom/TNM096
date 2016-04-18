import java.util.Arrays;
import java.util.PriorityQueue;

public class Solver {
	
	String[] sol = {"1", "2", "3", "4", "5", "6", "7", "8", "0"};
	
	private Board init;
	
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
		
		int[] blocks = new int[3];
		
		//Hårdkodat for now..

		blocks[0] = 0;
		blocks[1] = 1;
		blocks[2] = 3;
		blocks[3] = 4;
		blocks[4] = 2;
		blocks[5] = 5;
		blocks[6] = 7;
		blocks[7] = 8;
		blocks[8] = 6;
		
		Board initial = new Board(blocks);
		
		System.out.println(initial.toString());
		
		initial.isGoal();
		initial.equals(initial);
		
		PriorityQueue<Board> pq = new PriorityQueue<Board>();
		
		System.out.println("hamming result: " +  initial.hamming());
		
		pq.add(initial);
		
		while(!initial.isGoal()){
			
			createChilds(initial);
			break;
		}
		
		
	}
	
	/*private static void createChilds(Board b) {
		
		int pos = 0, test = 0;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(b.blocks[i][j] == 0){
					pos = (i + j + test);
					i = 3;
					j = 3;
				}
				if(j == 2) test+= 2;
			}	
		}
		
		
		b.addToQueue(up(b, pos));
		b.addToQueue(down(b, pos));
		b.addToQueue(left(b, pos));
		b.addToQueue(right(b, pos));
		
		
*/

}
