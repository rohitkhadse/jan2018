package interviewsk.customer;

public class Customer implements Comparable<Customer>{
	String id;
	int age;
	String name;
	String gender;
	
	Address address;

	/*public Customer(String id, int age, String name, String gender, Address address) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.address = address;
	}*/

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + ", address=" + 
	address.toString()	+ "]\n";
		
	}
	
	@Override
	public int compareTo(Customer obj){
		Customer c = (Customer) obj;
		
		if(this.age == c.age){
			return 0;
		}
		else if(this.age > c.age){
			return 1;
		}
		else{
			return -1;
		}
	}
	
	
}
