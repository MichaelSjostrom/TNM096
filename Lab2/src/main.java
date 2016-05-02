import java.util.ArrayList;
import java.util.List;

public class main {
	
	public static void main(String[] args) {
		
		
		List<String> c1 = new ArrayList<String>();
		List<String> c2 = new ArrayList<String>();

		
		c1.add("-A");
		c1.add("B");
		c1.add("K");
		
		c2.add("A");
		c2.add("C");
		c2.add("-K");
		
		List<Clause> listOfClauses = new ArrayList<Clause>();

		Clause clause1 = new Clause(c1);
		Clause clause2 = new Clause(c2);
		
		listOfClauses.add(clause1);
		listOfClauses.add(clause2);
		
		for(int i = 0, len = listOfClauses.size(); i < len - 1; ++i){
			Clause s = listOfClauses.get(i);
			makeNegative(s);
		}
		
		for(Clause s : listOfClauses){
			for(String k : s.getLiterals()){
				System.out.println(k);
			}
		}
		
		ArrayList<Clause> result = removeOpposites(clause1, clause2);
		
		System.out.println("Result(0) = " + result.get(0).getLiterals());
		System.out.println("Result(1) = " + result.get(1).getLiterals());
		
	}
	
	
	public static ArrayList<Clause> removeOpposites(Clause clause1, Clause clause2){
		
		Clause clause1copy = new Clause(clause1.getLiterals());
		Clause clause2copy = new Clause(clause2.getLiterals());
		
		for(int i = 0; i<clause1.getLiterals().size(); i++){
			for(int j = 0; j<clause2.getLiterals().size(); j++){
				if(clause1.getLiterals().get(i).equals(clause2.getLiterals().get(j)) && clause1.getLiterals().get(i).contains("-")){
					clause1copy.getLiterals().remove(clause1.getLiterals().get(i));
					clause2copy.getLiterals().remove(clause2.getLiterals().get(j));
				}
			}
		}
		
		ArrayList<Clause> result = new ArrayList<Clause>();
		result.add(clause1copy);
		result.add(clause2copy);
		
		return result;
	}
	
	//Take the negative value of the hole array
	private static void makeNegative(Clause c1) {
		List<String> temp = new ArrayList<String>();
		for(String s : c1.getLiterals()){
			String k = "";
			if(!s.contains("-")) {
				k = "-" + s;
			}
			else {
				k = s.replace("-", "");
			}
			temp.add(k);
		}
		c1.setLiterals(temp);
	}
}
