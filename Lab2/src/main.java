import java.util.ArrayList;
import java.util.List;

public class main {
	
	public static void main(String[] args) {
		
		List<String> c1 = new ArrayList<String>();
		List<String> c2 = new ArrayList<String>();
		
		c1.add("-A");
		c1.add("B");
		c2.add("A");
		c2.add("C");
		
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
