package interviewsk;

import java.util.*;

public class DuplicateEntry {

	public static String duplicateEntry(String s)
	{	
		int index = s.indexOf(";");
	
		String subString = s.substring(index+1); 
		
		
		String newarr[] = subString.split(",");
		System.out.println(Arrays.toString(newarr));
		Set<String> hm=new HashSet<>();
		
		for(int i=0;i<newarr.length;i++)
		{
			if(hm.contains(newarr[i]))
				return newarr[i];
			else 
				hm.add(newarr[i]);
		}
		return null;
	}
	public static void main(String args[])
	{
		String s = "5;1,2,2,1,3";
		System.out.println(duplicateEntry(s));
	}

}
