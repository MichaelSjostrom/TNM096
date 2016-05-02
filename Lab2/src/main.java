import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class main {
	
	public static void main(String[] args) {
		
		String[] c1 = {"-A", "B"};
		String[] c2 = {"A", "C"};
		Collection<String> clause1;
		Collection<String> clause2;
		
		makeNegative(c1);
		
		clause1 = new ArrayList(Arrays.asList(c1));
		clause2 = new ArrayList(Arrays.asList(c2));
		
		for(String s : clause1){
			System.out.println(s);
		}
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
