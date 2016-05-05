import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class main {
	
	public static void main(String[] args) {
		
		
		List<String> c1 = new ArrayList<String>();
		List<String> c2 = new ArrayList<String>();
		List<String> c3 = new ArrayList<String>();

		
		/*c1.add("-A");
		c1.add("B");
		c1.add("C");
		
		c2.add("A");
		c2.add("D");
		c2.add("-C");
		
		c3.add("A");
		c3.add("-D");
		c3.add("C");*/
		
		c1.add("A");
		c1.add("B");
		c1.add("C");
		
		c2.add("A");
		c2.add("B");
		c2.add("C");
		
		c3.add("A");
		c3.add("B");
		c3.add("C");
		
		List<Clause> listOfClauses = new ArrayList<Clause>();

		Clause clause1 = new Clause(c1);
		Clause clause2 = new Clause(c2);
		Clause clause3 = new Clause(c3);
		
		listOfClauses.add(clause1);
		listOfClauses.add(clause2);
		listOfClauses.add(clause3);
		
		ArrayList<Clause> KB = new ArrayList<Clause>();
		ArrayList<Clause> newClauses = new ArrayList<Clause>();
		
		boolean kalle = true;
		while(true && kalle){
			for(int i = 0, len = listOfClauses.size(); i < len - 1; ++i){
				for(int j = i + 1; j < len; ++j){
					Clause s = listOfClauses.get(i);
					Clause s2 = listOfClauses.get(j);
					
					Clause negCop = makeNegative(s);
					Clause result = getResolvents(negCop, s2);
					
					//getResolvents returns null if result will contain contradiction 
					if(result != null){
						if(result.getLiterals().isEmpty()){
							newClauses.add(result);
							System.out.println("Found empty");
							kalle = false;
						}
						
						newClauses.add(result);
					}
										
				}
			}
			
			if(KB.containsAll(newClauses) || newClauses.isEmpty()){
				System.out.println("Cannot resolve more..");
				kalle = false;
			}else{
				KB.addAll(newClauses);
				listOfClauses.clear();
				listOfClauses.addAll(newClauses);
				newClauses.clear();
			}
		}
		System.out.println("=======>>>");
		for(Clause s : KB){
			System.out.println(s.getLiterals());
		}
			
		System.exit(0);
		
	}
	
	//Reurns the resolvent of Clause1 and Clause2
	public static Clause getResolvents(Clause clause1, Clause clause2){
		
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
		
		ArrayList<String> temp = new ArrayList<String>();
		clause1copy = makeNegative(clause1copy);
		for(String s : clause1copy.getLiterals()){
			temp.add(s);
		}
		for(String s : clause2copy.getLiterals()){
			if(!temp.contains(s))
				temp.add(s);
		}
		
		return new Clause(temp);
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
