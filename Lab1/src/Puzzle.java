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
		return heuristic;
	}
	
	public int manhattan(Board board){
		int size = board.blocks.length;
		int outOfPlace = 0;
		
		for(int i = 0; i < size; i++){
			if(board.blocks[i] != i+1 && board.blocks[i] != 0){
				for(int j = 1; j < size + 1; j++){
					if(board.blocks[i] == j){
						if(i > j) 
							
					}
				}
			}
		}
		
		return 0;
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
		
		int pos = findIndex();
		
		Solver.up(this.currentBoard, pos);
		Solver.down(this.currentBoard, pos);
		Solver.left(this.currentBoard, pos);
		Solver.right(this.currentBoard, pos);
		
	}
	
	public int findIndex(){
		for(int i = 0; i < 9; i++)
			if(this.currentBoard.getNumber(i) == 0)
				return i;
		
		return 1;
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

		// H�rdkodat for now..

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
		//Puzzle mPuzzle2 = new Puzzle(input2);

		//System.out.println(mPuzzle2.initialBoard.toString());
		
		mPuzzle1.solve();

	}
}