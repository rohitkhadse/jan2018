package interviewsk.customer;

public class TestCustomer {

	public static void main(String[] args) {
		
		
		CustomerHandler custHandler =  new CustomerHandler();
		for(int i=0;i<10;i++){
			Customer cust = new Customer();
			
			cust.id = "id " + i;
			cust.name = "custName "+i;
			
			if(i%2==0){
				cust.gender = "Male"; 
			}
			else{
				cust.gender = "Female";
			}
			
			cust.age = (int) ((Math.random()*((80-16)+1)) + 16);
			
			if(i==7){
				cust.age = 90;
			}
			
			Address ad = new Address();
			ad.street = "Street "+i;
			ad.city = "City " + i;
			ad.state = "State" + i;
			ad.zipcode = "Zipcode "+i;
			
			cust.address = ad;
			
			try {
				custHandler.addCustomer(cust);
			} catch (Exception e) {
				e.printStackTrace();
			}		
		}

		System.out.println(custHandler.sortCustomers());
		
		System.out.println(AgeRange.MIN.getValue());
		
		System.out.println(AgeRange.MAX.getValue());
	}

}
