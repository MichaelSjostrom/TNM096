
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
	
	
	public Board(int[][] blocks){
		this.blocks = blocks;
		size = blocks[0].length;
	}
	
	public int hamming(){
		return 0;
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
	
	public int getBoardSize(){
		return size;
	}
	
	public String toString(){
		
		String daBoard = "";
		
		
		return null;
	}
}
