package Week_1;

public class Find_the_Index_of_the_First_Occurrence_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		optimal tc:-O(n*m)
		
		String haystack = "sadbutsad";
		String needle = "but";
		if(needle.length()==0) {
			System.out.println(0);
			return;
		}
		for(int i=0;i<haystack.length()-needle.length();i++) {
			if(haystack.substring(i,i+needle.length()).equals(needle)) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
		
//		using method(O(n*m))
		System.out.println(haystack.indexOf(needle));
	}

}
