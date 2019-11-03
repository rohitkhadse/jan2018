package interviewsk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;


import java.util.*;

public class sorthk {

	public static void main(String[] args) {
		int arr [] = {2, 5, 2, 8, 5, 6, 8, 8};
		sorthk.customSort(arr);

  }

 private static void customSort(int[] arr) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		int count = 0;
		for(int i: arr) {
			count = 1;
			if(hashMap.get(i) !=  null) {
				count = hashMap.get(i);
				count++;
				
			}
			hashMap.put(i, count);
			ts.add(count);
		}
		java.util.Iterator<Integer> itr =  ts.iterator();
		int key = 0;
		ArrayList<Integer> ascElems = new ArrayList<Integer>();
		
		/*while(itr.hasNext()) {
			count = itr.next();
			java.util.Iterator<Integer> iterator = hashMap.keySet().iterator(); 
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			while(iterator.hasNext()) {
				key = iterator.next();
				if(hashMap.get(key) == count) {
					for(int i=0;i<count;i++) {
						arrayList.add(key);
					}
				}
			}
			
			Collections.sort(arrayList);
			ascElems.addAll(arrayList);
		}*/
		
		for(int a : ts){
			count=a;
			java.util.Iterator<Integer> iterator = hashMap.keySet().iterator(); 
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			while(iterator.hasNext()) {
				key = iterator.next();
				if(hashMap.get(key) == count) {
					for(int i=0;i<count;i++) {
						arrayList.add(key);
					}
				}
			}
			
			
			Collections.sort(arrayList);
			ascElems.addAll(arrayList);
			
		}
		
		//ascElems.stream().forEach(System.out::println);
		for(int i: ascElems){
			System.out.println(i);
		}
	}
}