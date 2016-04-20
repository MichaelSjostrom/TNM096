
public class Solver {
	
	private Solver(){}
	
	public static Board right(Board b, int pos){
		
		if(pos % 3 < 2)
			return new Board(b, pos, pos + 1);
		
		return null;
		
	}
	
	public static Board left(Board b, int pos){
		
		if(pos % 3> 0)
			return new Board(b, pos, pos - 1);
		
		return null;
		
	}
	
	public static Board up(Board b, int pos){
		
		if(pos > 2)
			return new Board(b, pos, pos - 3);
		
		return null;
		
	}
	
	public static Board down(Board b, int pos){
		
		if(pos < 6)
			return new Board(b, pos, pos + 3);
		
		return null;
	}
	
}
