import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class main {
	
	public static void main(String[] args) {
		
		String[] c1 = {"-A", "B", "K"};
		String[] c2 = {"A", "-B", "C"};
		ArrayList<String> clause1;
		ArrayList<String> clause2;
		
		makeNegative(c1);
		
		clause1 = new ArrayList(Arrays.asList(c1));
		clause2 = new ArrayList(Arrays.asList(c2));
		
		System.out.println("Cluase1 = ");
		for(String s : clause1){
			System.out.println(s);
		}
		
		ArrayList<ArrayList<String>> result = removeOpposites(clause1, clause2);
		
		System.out.println("Result(0) = " + result.get(0));
		System.out.println("Result(1) = " + result.get(1));
		
	}
	
	public static ArrayList<ArrayList<String>> removeOpposites(ArrayList<String> clause1, ArrayList<String> clause2){
		
		ArrayList<String> clause1copy = new ArrayList<>(clause1);
		ArrayList<String> clause2copy = new ArrayList<>(clause2);
		
		for(int i = 0; i<clause1.size(); i++){
			for(int j = 0; j<clause2.size(); j++){
				if(clause1.get(i).equals(clause2.get(j)) && clause1.get(i).contains("-")){
					clause1copy.remove(clause1.get(i));
					clause2copy.remove(clause2.get(j));
				}
			}
		}
		
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		result.add(clause1copy);
		result.add(clause2copy);
		
		return result;
	}
	
	//Take the negative value of the hole array
	private static void makeNegative(String[] c1) {
		for(int i = 0, len = c1.length; i < len; ++i){
			if(!c1[i].contains("-")) {
				c1[i] = "-" + c1[i];
			}
			else {
				c1[i] = c1[i].replace("-", "");
			}
		}
	}
	
	
	
	
}
