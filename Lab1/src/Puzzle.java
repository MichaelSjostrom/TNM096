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
	  
	  public static int getHeuristic(int[] array) {
		    int heuristic = 0;
		    
		    //TODO Implement our distanceFunction
		    /*for(int i = 0; i < array.length; i++) {
		      if (array[i] != 0)
		        heuristic += getManhattanDistance(i, array[i]);
		    }*/
		    return heuristic;
		  }
}
