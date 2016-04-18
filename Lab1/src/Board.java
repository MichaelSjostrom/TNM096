
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
	//Temp solution for size
	private int size = 3;
	int[][] goalBoard;
	
	public Board(int[][] blocks){
		this.blocks = blocks;
		//size = this.blocks[0].length;
		//System.out.println(size + '\n');
		goalBoard = new int[3][3];
		goalBoard[0][0] = 1;
		goalBoard[0][1] = 2;
		goalBoard[0][2] = 3;
		goalBoard[1][0] = 4;
		goalBoard[1][1] = 5;
		goalBoard[1][2] = 6;
		goalBoard[2][0] = 7;
		goalBoard[2][1] = 8;
		goalBoard[2][2] = 0;
	}
	
	public int hamming(){
		return 0;
	}
	
	public boolean isGoal(){
		
		boolean goal = true;
		//rows
		for(int i = 0; i < size; i++){
			//columns
			for(int j = 0; j < size; j++){					
				if(this.blocks[i][j] != goalBoard[i][j]){
					goal = false;
					System.out.println("is NOT goal");
					break;
				}
			}
			if(goal == false)
				break;
		}
		
		if(goal)
			System.out.println("is goal");
		
		return goal;
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
		//rows
		for(int i = 0; i < size; i++){
			//columns
			for(int j = 0; j < size; j++){					
				daBoard += " " + Integer.toString(this.blocks[i][j]);

				if(j == 2)
					daBoard += '\n';
			}
		}
		
		return daBoard;
	}
}
