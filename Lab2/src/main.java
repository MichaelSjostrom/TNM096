import java.util.ArrayList;
import java.util.List;

public class main {
	
	private static String[] literals;
	private static String[] literals2;
	
	private static int[] nots;
	private static int[] nots2;
	
	public static void main(String[] args) {
		
		String[] clauses = {"notC!&B", "notA!&notB"};
		Boolean running = true;
		
		while(true){
			for(int i = 0, len = clauses.length; i < len; ++i){
				for(int j = i + 1, len2 = clauses.length; j < len2; ++j){
					check(clauses[i], clauses[j]);
				}
				
			}
			break;
		}
		
		System.out.println("done");
		System.exit(0);
	}

	private static boolean check(String c1, String c2) {
		
		checkAndOr(c1, c2);
		
		nots = new int[literals.length];
		nots2 = new int[literals2.length];
		
		checkForNots();
		
		remove();
		
		for(int i = 0, len = literals.length; i < len; ++i){
			System.out.println(literals[i]);
		}
		for(int i = 0, len = literals2.length; i < len; ++i){
			System.out.println(literals2[i]);
		}
		
		return false;
	}
	
	private static void remove() {
		for(int i = 0, len = literals.length; i < len; ++i){
			for(int j = 0, len2 = literals2.length; j < len2; ++j){
				if(literals[i].equals(literals2[j])){
					if(nots[i] != nots2[j]){
						literals[i] = "";
						literals2[j] = "";
					}
				}
			}
		}
	}

	private static void checkForNots() {
		
		for(int i = 0, len = literals.length; i < len; ++i){
			if(isNegative(literals[i]))
				nots[i] = 1;
			else {
				nots[i] = 0;
				literals[i] = literals[i].split("not")[1];
			}
		}
		
		for(int i = 0, len = literals2.length; i < len; ++i){
			if(isNegative(literals2[i]))
				nots2[i] = 1;
			else {
				nots2[i] = 0;
				literals2[i] = literals2[i].split("not")[1];
			}
		}

		
	}

	private static void checkAndOr(String c1, String c2) {
		
		String and = "&", or = "!" + and;
		
		String splitter;
		
		if(c1.contains(or)) 
			splitter = or;
		else splitter = and;
		
		literals = c1.split(splitter);
		
		String splitter2;
		
		if(c2.contains(or)) 
			splitter2 = or;
		else splitter2 = and;
		
		literals2 = c2.split(splitter2);
		
		
	}

	private static boolean isNegative(String splitMe){
		
		if(splitMe.contains("not")){
			return false;
		}
		return true;
	}
	
}
