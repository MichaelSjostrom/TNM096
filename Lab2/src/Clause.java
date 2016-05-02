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
	
	@Override
	public boolean equals(Object c){
		
		if(c instanceof Clause){
			Clause test = (Clause)c;
			
			for(int i = 0, len = test.literals.size(); i < len; ++i){
				if(test.literals.get(i) != this.literals.get(i))
					return false;
			}
			return true;
			
		}
		return false;
	}

}
