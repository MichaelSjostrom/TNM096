import java.util.Arrays;
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
	
	public int[] blocks = new int[9];

	private List<Board> neighbors;
	
	//Temp solution for size
	private int size = 9;
	int[] goalBoard;
	
	/** The number of moves since the start. */
	private int g;

	/** The number of moves to the goal. */
	private int h;
	
	public Board(int[] blocks){
		this.blocks = blocks;
		
	    this.g = 0;
	    //TODO implement getHeurustic
	    this.h = Puzzle.getHeuristic(this.blocks);

		goalBoard = new int[9];
		goalBoard[0] = 1;
		goalBoard[1] = 2;
		goalBoard[2] = 3;
		goalBoard[3] = 4;
		goalBoard[4] = 5;
		goalBoard[5] = 6;
		goalBoard[6] = 7;
		goalBoard[7] = 8;
		goalBoard[8] = 0;
	}
	
	public int hamming(){
		int ham = 0;
		/*int test = 1;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				
				System.out.println(i + j + test + " == " + blocks[i][j]);
				
				int kalle = (i + j + test);
				if(blocks[i][j] == kalle) ham++;
				
				if(i + j + test == 9 && blocks[i][j] == 0) ham++;

				if(j == 2) test+= 2;
			}
		}
		*/
		return ham;
	}
	
	public boolean isGoal(){
		
		int[] p = this.blocks;
	    for (int i = 1; i < p.length - 1; i++)
	      if(p[i-1] > p[i]) return false;

	    return (p[0] == 1);
	}
	
	public boolean isSolvable(){
		return false;
	}
	
	public boolean equals(Board y){
		
		boolean equals = true;
		
		for(int i = 0; i < size; i++){
				
				if(this.blocks[i] != y.blocks[i]){
					equals = false;
					break;
				}
		}
		
		return equals;
	}
	
	public void addToQueue(Board b){
		if(b != null && neighbors.indexOf(b) == -1){
			//add to queue.. 
		}
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
		for(int i = 1; i < blocks.length+1; i++){			
				daBoard += " " + Integer.toString(this.blocks[i-1]);
				
				if(i%3 == 0)
					daBoard += '\n';
		}
		
		return daBoard;
	}
	
	  /**
	   * This method returns the g(n) part of the cost function. It is the
	   * amount of steps that the current state is at.
	   * @return int - The g(n) of the current state.
	   */
	  public int g() {
	    return this.g;
	  }

	  /**
	   * This method returns the h(n) part of the cost function. It is the
	   * heuristic (steps to the goal state) for the current state.
	   * @return int - The h(n) of the current state.
	   */
	  public int h() {
	    return this.h;
	  }

	  /**
	   * The f(n) or total cost of the current state. This is calculated by
	   * retrieving the g + h of the state.
	   * @return int - The f(n) of the current state.
	   */
	  public int f() {
	    return g() + h();
	  }
	
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Board board = (Board) o;
    return Arrays.equals(blocks, board.blocks);
  }
}
