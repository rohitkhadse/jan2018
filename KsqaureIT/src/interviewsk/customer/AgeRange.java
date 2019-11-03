package interviewsk.customer;

public enum AgeRange {
	
	MIN(16),MAX(80);
	
	int age;
	
	AgeRange(int age){
		this.age = age; 	
	}

	public int getValue(){
		return this.age;
	}
}
