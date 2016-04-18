import java.util.Arrays;

public class Solver {
	
	String[] foo = {"hej", "hej2"};
	
	public Solver(){}
	
	public Solver(Board init){}
	
	public int moves(){
		return 1;
	}
	
	public Iterable<String> neighbors(){
		return Arrays.asList(foo);
	}
	
	public static void main(String[] args){ // some code here
		System.out.println("running");
	}
	
	
	
	
	
}
