
public class Solver {
	
	private Solver(){}
	
	public static Board right(Board b, int pos){
		
		if(pos % 3 < 2)
			return new Board(b, pos, pos + 1);
		
		return null;
		
	}
	
}
