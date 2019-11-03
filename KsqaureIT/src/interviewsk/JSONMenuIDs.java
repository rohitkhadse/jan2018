package interviewsk;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JSONMenuIDs {

	
	public static void main(String[] args)
	{
		List<String> menuitem = new ArrayList<String>();
		menuitem.add("{\"menu\": {\"header\": \"menu\", \"items\": [{\"id\": 27}, {\"id\": 0, \"label\": \"Label 0\"}, null, {\"id\": 93}, {\"id\": 85}, {\"id\": 54}, null, {\"id\": 46, \"label\": \"Label 46\"}]}}");
		menuitem.add("{\"menu\": {\"header\": \"menu\", \"items\": [{\"id\": 81}]}}");
		menuitem.add("{\"menu\": {\"header\": \"menu\", \"items\": [{\"id\": 70, \"label\": \"Label 70\"}, {\"id\": 85, \"label\": \"Label 85\"}, {\"id\": 93, \"label\": \"Label 93\"}, {\"id\": 2}]}}");
		
		for (int x=0; x < menuitem.size(); x++) {
			
			String lineSeparator = menuitem.get(x);
			lineSeparator = lineSeparator.trim().substring(38, lineSeparator.length() - 3);
			Pattern pat = Pattern.compile("\\{(.*?)\\}");
			Matcher mat = pat.matcher(lineSeparator);
			int res = 0;
			while (mat.find()) {
				
				String[] infoMenu = mat.group(1).trim().split(",");
				if (infoMenu.length == 2 && infoMenu[1].contains("label")) {
					if (infoMenu[0].contains("id")) {
						String[] ids = infoMenu[0].trim().split(":");
						res += Integer.valueOf(ids[1].trim());
					}
				}
			}
			System.out.println(res);
		}		
	}
}
