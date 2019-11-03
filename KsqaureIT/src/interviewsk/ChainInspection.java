package interviewsk;
import java.io.*;
import java.util.*;

public class ChainInspection {

public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
				
		//Scanner fileScanner = new Scanner(file);
		Scanner fileScanner = new Scanner(System.in);
				
		while(fileScanner.hasNextLine()){
			String line = fileScanner.nextLine();
			if(!line.equalsIgnoreCase("")){
				Map<String,String> chn = new TreeMap<String,String>();
				boolean badChn = false;
				String ele[] = line.split(";");
				for(String pr : ele){
					String items[] = pr.split("-");
					if(items[0].equalsIgnoreCase(items[1])){
						badChn = true;
					}else{
						if(!chn.containsKey(items[0])){
							chn.put(items[0], items[1]);
						}else{
							// bad chain
							badChn = true;
							break;
						}
					}
				}
				
				int linksUsed = 1;
				int chainLength = chn.size();
				String val = (String) chn.get("BEGIN");
				if(chn.get("BEGIN") == null){
					badChn = true;
				}else{
					while(!val.equalsIgnoreCase("END") && linksUsed < chainLength){
						val = (String) chn.get(val);
						linksUsed++;
					}
				}
				
				if(!badChn && linksUsed == chainLength && val.equals("END")){
					System.out.println("GOOD");
				}else{
					System.out.println("BAD");
				}
			}
		}		
		fileScanner.close();
	}
}
