import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class main {
	
	public static void main(String[] args) {
		
		
		List<String> c1 = new ArrayList<String>();
		List<String> c2 = new ArrayList<String>();
		List<String> c3 = new ArrayList<String>();

		
		c1.add("-A");
		c1.add("B");
		c1.add("C");
		
		c2.add("A");
		c2.add("D");
		c2.add("-C");
		
		c3.add("A");
		c3.add("-D");
		c3.add("C");
		
		List<Clause> listOfClauses = new ArrayList<Clause>();

		Clause clause1 = new Clause(c1);
		Clause clause2 = new Clause(c2);
		Clause clause3 = new Clause(c3);
		
		listOfClauses.add(clause1);
		listOfClauses.add(clause2);
		listOfClauses.add(clause3);
		
		ArrayList<Clause> KB = new ArrayList<Clause>();
		
		for(int i = 0, len = listOfClauses.size(); i < len - 1; ++i){
			for(int j = i + 1; j < len; ++j){
				Clause s = listOfClauses.get(i);
				Clause s2 = listOfClauses.get(j);
				Clause negCop = makeNegative(s);
				System.out.println("before");
				ArrayList<Clause> result = getResolvents(negCop, s2);
				
				for(Clause c : result){
					if(c.getLiterals().isEmpty()) {
						KB.add(c);
						System.out.println("All Done");
						break;
					}
					if(!KB.contains(c))
						KB.add(c);
				}
					
			}
		}
		
		for(Clause s : KB)
				System.out.println(s.getLiterals());
		
		System.exit(0);
		
	}
	
	//Reurns the resolvent of Clause1 and Clause2
	public static ArrayList<Clause> getResolvents(Clause clause1, Clause clause2){
		
		Clause clause1copy = new Clause(clause1.getLiterals());
		Clause clause2copy = new Clause(clause2.getLiterals());
		
		for (Iterator<String> iterator1 = clause1copy.getLiterals().iterator(); iterator1.hasNext();) {
		    String string1 = iterator1.next();
		    for (Iterator<String> iterator2 = clause2copy.getLiterals().iterator(); iterator2.hasNext();){
		    	String string2 = iterator2.next();
		    	
		    	//If clauses contains the same values.
			    if (string1.equals(string2)) {

			        // Remove the current element from the iterator and the list.
			        iterator1.remove();
			        iterator2.remove();
			    }
		    }
		}
		
		ArrayList<Clause> result = new ArrayList<Clause>();
		result.add(makeNegative(clause1copy));
		result.add(clause2copy);
		
		return result;
	}
	
	//Take the negative value of the hole array
	private static Clause makeNegative(Clause c1) {
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
		
		return new Clause(temp);
	}
}
