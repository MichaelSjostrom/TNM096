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
	
	/*@Override
	public int hashCode(){
		int ret = 0;
		 
		for(int i = 0, len = this.getLiterals().size(); i < len; ++i){
			if(this.getLiterals().get(i).charAt(0) == '-'){
				ret += (int)this.getLiterals().get(i).charAt(1);
			}
			ret += (int)this.getLiterals().get(i).charAt(0);
		}
		
		return ret;
	}
	*/
	@Override
	public boolean equals(Object c){
		if(c instanceof Clause){
			Clause test = (Clause)c;
			
			if(test.getLiterals().size() != this.getLiterals().size()){
				return false;
			}
			
			for(int i = 0, len = test.getLiterals().size(); i < len; ++i){
				boolean kalle = false;
				for(int j = 0; j < len; ++j){
					if(test.getLiterals().get(i).equals(this.getLiterals().get(j))){
						kalle = true;
					}
				}
				if(!kalle) {
					return false;
				}
			}
			return true;

		}
		
		return false;
	}

}
