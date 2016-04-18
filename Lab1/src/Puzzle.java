import java.util.Comparator;
import java.util.PriorityQueue;

public class Puzzle {
	  /** The initial state of the puzzle. */
	  public Board initialBoard;

	  /** The current state of the puzzle. */
	  public Board currentBoard;

	  /** The initial capacity of the queue. */
	  static final int CAPACITY = 100;

	  /** The A * Search priority queue used to solve the puzzle. */
	  public final PriorityQueue<Board> queue = new PriorityQueue<Board>(CAPACITY, new Comparator<Board>() {
	    @Override
	    public int compare(Board o1, Board o2) {
	      return o1.f() - o2.f();
	    }
	  });
	  
	  /**
	   * Constructor for puzzle class.
	   * @param puzzleInput Valid sliding puzzle in 2D array format.
	   */
	  public Puzzle(int[] puzzleInput) {
	    this.initialBoard = new Board(puzzleInput);
	    this.currentBoard = this.initialBoard;
	  }
	  
	  public static int getHeuristic(int[] array) {
		    int heuristic = 0;
		    
		    //TODO Implement our distanceFunction
		    /*for(int i = 0; i < array.length; i++) {
		      if (array[i] != 0)
		        heuristic += getManhattanDistance(i, array[i]);
		    }*/
		    return heuristic;
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
			
			int[] blocks2 = new int[9];
			
			//Hårdkodat for now..

			blocks2[0] = 1;
			blocks2[1] = 2;
			blocks2[2] = 3;
			blocks2[3] = 4;
			blocks2[4] = 5;
			blocks2[5] = 6;
			blocks2[6] = 7;
			blocks2[7] = 8;
			blocks2[8] = 0;
			
			
			
			Board initial = new Board(blocks);
			Board initial2 = new Board(blocks2);
			
			System.out.println(initial.toString());
			System.out.println(initial.isGoal());
			
			System.out.println(initial2.toString());
			System.out.println(initial2.isGoal());
			
			//initial.equals(initial);
			
			PriorityQueue<Board> pq = new PriorityQueue<Board>();
			
			System.out.println("hamming result: " +  initial.hamming());
			
			pq.add(initial);
			
			while(!initial.isGoal()){
				
				break;
			}
				
		}
}
