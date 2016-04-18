import java.util.Arrays;

public class Solver {
	
	String[] foo = {"hej", "hej2"};
	
	public Solver(){}
	
	public Solver(Board init){}
	
	public int moves(){
		return 1;
	}
	
	public Iterable<String> neighbors(){
		return Arrays.asList(foo);
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
		
		Board initial = new Board(blocks);
		
	}	
}
