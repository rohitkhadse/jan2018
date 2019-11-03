package interviewsk;

public class MissingWord {

	public static void main(String[] args) {
		String s ="I am using HackerRank to improve programming";
		String t="am HackerRank to improve";
		
//		String s ="I like like you";
//		String t="like";
		
	    //missingwords(s,t);
		
		String[] solution = missingwordsReturnArr(s, t);
		for(String str:solution){
			System.out.println(str);
		}

	}

	private static void missingwords(String s, String t) {
		String s2[] = t.split(" ");
		for(String str:s2){
			//s = s.replace(str, "");
			s = s.replaceFirst(str, "");
			
		}
		
		System.out.println(s.replaceAll("\\s{2,}", " "));
		
	}
	
	private static String[] missingwordsReturnArr(String s, String t) {
		String s2[] = t.split(" ");
		for(String str:s2){
			//s = s.replace(str, "");
			s = s.replaceFirst(str, "");	
		}
		String newstr = s.replaceAll("\\s{2,}", " ");
		System.out.println(newstr);
		String newarr[] = newstr.split(" ");
		return newarr;
		
	}

}
