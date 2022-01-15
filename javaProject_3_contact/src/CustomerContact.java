
public class CustomerContact extends Contact {
	
	private String customerName;
	private String item;
	private String role;
	
	public CustomerContact(String name, String phoneNumber, String email, String address, String birthdate,
			String group) {
		super(name, phoneNumber, email, address, birthdate, group);
	}
	public CustomerContact(String name, String phoneNumber, String email, String address, String birthdate,
			String group, String customerName, String item, String role) {
		super(name, phoneNumber, email, address, birthdate, group);
		this.customerName = customerName;
		this.item = item;
		this.role = role;
	}
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.printf("회사이름: %s\n부서이름: %s\n직급: %s\n",
				this.customerName, this.item, this.role);
	}
	public String getCutomerName() {
		return this.customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getItem() {
		return this.item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
