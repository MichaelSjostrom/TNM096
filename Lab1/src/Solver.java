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
		
		int[] blocks = new int[9];
		
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
		
		/*while(!initial.isGoal()){
			
			createChilds(initial);
			break;
		}*/
		
		
	}
	
	private static void createChilds(Board b) {
		
		int pos = 0, test = 0;
		for(int i = 0; i < 9; i++){
			if(b.blocks[i] == 0) {
				pos = i;
				break;
			}
		}
		
		b.addToQueue(up(b, pos));
		b.addToQueue(down(b, pos));
		b.addToQueue(left(b, pos));
		b.addToQueue(right(b, pos));
		
		
		
	}
	
	private static Board up(Board b, int pos){
		if(pos > 2){
			int newVal = b.blocks[pos - 3];
			b.blocks[pos] = newVal;
			b.blocks[pos - 3] = 0;
			
			return b;
		}
		return null;
	}
	private static Board down(Board b, int pos){
		if(pos < 6){
			int newVal = b.blocks[pos + 3];
			b.blocks[pos] = newVal;
			b.blocks[pos + 3] = 0;
			
			return b;
		}
		return null;
	}
	private static Board left(Board b, int pos){
		if(pos % 3 > 0){
			int newVal = b.blocks[pos - 1];
			b.blocks[pos] = newVal;
			b.blocks[pos - 1] = 0;
			
			return b;
		}
		return null;
	}
	private static Board right(Board b, int pos){
		if(pos % 3 < 2){
			int newVal = b.blocks[pos + 1];
			b.blocks[pos] = newVal;
			b.blocks[pos + 1] = 0;
			
			return b;
		}
		return null;
	}

}
