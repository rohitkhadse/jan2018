package interviewsk;

import java.util.*;
import java.io.*;

public class MyClass {
    	static int[][] board = new int[256][256];

    
    public static void setCol(String col, String val){
	for (int i = 0; i < 256; i++) {
		board[i][Integer.parseInt(col)] = Integer.parseInt(val);
	}
}
public static void setRow(String row,String val){	
	for (int i = 0; i < 256; i++) {
		board[Integer.parseInt(row)][i] = Integer.parseInt(val);
	}
}
public static void queryCol(String col){
	int sum = 0;
	for (int i = 0; i < 256; i++) {
		sum += board[i][Integer.parseInt(col)];
	}
	System.out.println(sum);
} 
public static void queryRow(String row){
	int sum = 0;
	for (int i = 0; i < 256; i++) {
		sum += board[Integer.parseInt(row)][i];
	}
	System.out.println(sum);
}

    public static void main(String[] args) throws IOException {
	Scanner scanner = new Scanner(System.in);
	int next = scanner.nextInt();
	String line="";
	for(int i = 0;i<255;i++)
		for(int j=0; j<255;j++)
			board[i][j] = 0;
		
	while(scanner.hasNext()){
		String[] input = line.split(" ");
			
		switch(input[0]){
			case "SetCol" : setCol(input[1],input[2]);
							break;
			case "SetRow" : setRow(input[1],input[2]);
							break;
			case "QueryCol": queryCol(input[1]);
							break;
			case "QueryRow": queryRow(input[1]);
							break;
			default: System.out.println("Invalid Case");
		}	
	}
}	
	

}