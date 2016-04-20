import java.util.Comparator;
import java.util.HashSet;
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

	/** A Hash set containing the states that have been visited. */
	public final HashSet<Board> visited = new HashSet<Board>();

	/**
	 * Constructor for puzzle class.
	 * 
	 * @param puzzleInput
	 *            Valid sliding puzzle in 2D array format.
	 */
	public Puzzle(int[] puzzleInput) {
		this.initialBoard = new Board(puzzleInput);
		this.currentBoard = this.initialBoard;
	}

	public static int getHeuristic(int[] array) {
		int heuristic = 0;

		// TODO Implement our distanceFunction
		/*
		 * for(int i = 0; i < array.length; i++) { if (array[i] != 0) heuristic
		 * += getManhattanDistance(i, array[i]); }
		 */
		
		heuristic = hamming(array);
		
		return heurisitic;
	}

	/**
	 * This method handles adding the next state to the queue. It will only add
	 * the next state to the queue if it is a valid move and the state has not
	 * been visited previously.
	 * 
	 * @param nextState
	 */
	private void addToQueue(Board nextBoard) {
		if (nextBoard != null && !this.visited.contains(nextBoard))
			this.queue.add(nextBoard);
	}

	public void solve() {
		queue.clear();
		queue.add(this.initialBoard);
		
		hamming();
		
		while(!queue.isEmpty()){
			
			int pos = findIndex();
			
			this.currentBoard = queue.poll();
			
			visited.add(currentBoard);
			
			if(currentBoard.isGoal()){
				System.out.println("done");
			}
			
			addToQueue(Solver.up(this.currentBoard, pos));
			addToQueue(Solver.down(this.currentBoard, pos));
			addToQueue(Solver.left(this.currentBoard, pos));
			addToQueue(Solver.right(this.currentBoard, pos));
			break;
		}
		
		System.out.println("All done");
	}
	
	public int findIndex(){
		for(int i = 0; i < 9; i++)
			if(this.currentBoard.getNumber(i) == 0)
				return i;
		
		return 1;
	}
	
	public static int hamming(int[] array){
		
		int diff = 0;
		
		for(int i = 0; i < array.length; i++){
			
			int temp = array[i];
			if(temp != 0){
				if(temp != i + 1) diff++;	
			}	
		}
		
		return diff;
	}

	public static void main(String[] args) { // some code here
		System.out.println("running");

		int[] input1 = new int[9];

		input1[0] = 0;
		input1[1] = 1;
		input1[2] = 3;
		input1[3] = 4;
		input1[4] = 2;
		input1[5] = 5;
		input1[6] = 7;
		input1[7] = 8;
		input1[8] = 6;
		
		int[] input2 = new int[9];

		// Hårdkodat for now..
		input2[0] = 1;
		input2[1] = 2;
		input2[2] = 3;
		input2[3] = 4;
		input2[4] = 5;
		input2[5] = 6;
		input2[6] = 7;
		input2[7] = 8;
		input2[8] = 0;

		Puzzle mPuzzle1 = new Puzzle(input1);

		mPuzzle1.solve();

	}
}
