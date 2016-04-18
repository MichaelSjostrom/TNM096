import java.util.List;

public class Board {
	/*public Board(int[][] blocks)           // construct a board from an N-by-N array of blocks
	    // (where blocks[i][j] = block in row i, column j)
	public int size()                      // board size N
	public int hamming()                   // number of blocks out of place
	public int manhattan()                 // sum of Manhattan distances between blocks and goal
	public boolean isGoal()                // is this board the goal board?
	public boolean isSolvable()            // is the board solvable?
	public boolean equals(Object y)        // does this board equal y?
	public Iterable<Board> neighbors()     // all neighboring boards
	public String toString()               // string representation of the board (in the output format specified below)*/
	
	public int[][] blocks;
	private int size;
	private List<Board> neighbors;
	
	
	public Board(int[][] blocks){
		this.blocks = blocks;
		size = blocks[0].length;
	}
	
	public int hamming(){
		int ham = 0;
		int test = 1;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				
				System.out.println(i + j + test + " == " + blocks[i][j]);
				
				int kalle = (i + j + test);
				if(blocks[i][j] == kalle) ham++;
				
				if(i + j + test == 9 && blocks[i][j] == 0) ham++;

				if(j == 2) test+= 2;
			}
		}
		
		return ham;
	}
	
	public boolean isGoal(){
		return false;
	}
	
	public boolean isSolvable(){
		return false;
	}
	
	public boolean equals(Object y){
		return false;
	}
	
	public Iterable<Board> neighbors(){
		return null;
	}
	
	public void addNeighbor(Board b){
		this.neighbors.add(b);
	}
	
	public int getBoardSize(){
		return size;
	}
	
	public String toString(){
		
		String daBoard = "";
		//rows
		for(int i = 0; i < 3; i++){
			//columns
			for(int j = 0; j < 3; j++){					
				daBoard += " " + Integer.toString(this.blocks[i][j]);

				if(j == 2)
					daBoard += '\n';
			}
		}
		
		return daBoard;
	}
}
