
public class main {
	
	public static String removeOpposite(String part, String cl){
		
		String tempCl = cl.replace(part, "");
		
		return tempCl;
	}
	
	public static boolean checkIfOpposite(String part, String cl){
		String tempPart = part.substring(1);

		if(cl.contains(tempPart)){
			return true;
		}
		
		return false;
	}
	
	public static String checkIfNOT(String check){
		String literal = "";
		int index;
		index = check.indexOf("-");
		if(index != -1){

			literal = check.substring(index, index+2);
			return literal;
		}
					
		return "";
	}
	
	public static String[] findResolvent(String cl1, String cl2){
		String resolvent[] = {"", ""};
		
		String check1 = "";
		String check2 = "";

		String first = cl1;
		String second = cl2;
		
		check1 = checkIfNOT(first);
		check2 = checkIfNOT(second);
		
		if(check1 != "" && checkIfOpposite(check1, second)){
			String tempPart = check1.substring(1);
			System.out.println("tempPart = " + tempPart);
			first = removeOpposite(check1, first);
			second = removeOpposite(tempPart, second);
			
			
			System.out.println("first = " + first);
			System.out.println("second = " + second);
		}
		else if(check2 != "" && checkIfOpposite(check2, first)){
			String tempPart = check2.substring(1);
			System.out.println("tempPart = " + tempPart);
			
			
			first = removeOpposite(tempPart, first);
			second = removeOpposite(check2, second);
			
			System.out.println("first = " + first);
			System.out.println("second = " + second);
		}
		
		resolvent[0] = first;
		resolvent[1] = second;
		
		return resolvent;
	}
	
	public static void main(String[] args) {
		
		String list1 = "A OR B OR C";
		String list2 = "-B OR A OR Q";
		String result[] = {""};

		result = findResolvent(list1, list2);
		System.out.println("result = " + result[0] + " | " + result[1]);

		
	}

}
