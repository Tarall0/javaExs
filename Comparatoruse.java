import java.util.*;

// Using Comparator interfate in order to get sorted the Collection (List<String>) str 

public class Comparatoruse {
	
	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		
		str.add("String 1");
		str.add("This is string 2");
		str.add("This is another strings");
		str.add("This is string");
		str.add("also this");
		
		Comparator<String> com = (s1, s2) -> {
			if(s1.length()>s2.length()) {
				return 1;
			}
			else {
				return -1;
			}
		};
		
		System.out.println("Strings ordered by lenght using Comparator interface");
		Collections.sort(str, com);
		
		int n = 0;
		for(String s : str) {
			n++;
			System.out.println(n+" String: '"+s+"'"+" / Lenght: "+s.length());
		}
	}
	

}
