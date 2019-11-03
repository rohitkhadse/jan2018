package interviewsk.customer;

import java.util.ArrayList;
import java.util.Collections;

public class CustomerHandler {
	ArrayList<Customer> customers = new ArrayList<Customer>();
	
	void addCustomer(Customer customer) throws Exception{
		if(customer !=null){
			if(customer.age < AgeRange.MIN.getValue() || customer.age > AgeRange.MAX.getValue()){
				throw new Exception("Age range not met for "+ customer.age);
			}
			customers.add(customer);
		}
		
	}
	
	ArrayList<Customer> sortCustomers(){
		Collections.sort(customers);
		return customers;
	}

}
