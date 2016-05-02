import java.util.List;

public class Clause {
	
	private List<String> literals;
	
	public Clause(List<String> literals){
		this.literals = literals;
	}
	
	public List<String> getLiterals(){
		return literals;
	}
	
	public void setLiterals(List<String> literals){
		this.literals = literals;
	}

}
