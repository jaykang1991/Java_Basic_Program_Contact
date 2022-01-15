import java.util.Scanner;

public class Contact {
	private String name; 
	private String phoneNumber;
	private String email; 
	private String address;
	private String birthdate; 
	private String group;
	
	public Contact(String name, String phoneNumber, String email, 
			String address, String birthdate, String group) {
		this.name = name; this.phoneNumber = phoneNumber; 
		this.email = email; this.address = address; this.birthdate = birthdate;
		this.group = group;
	}
	public void printInfo() {
		System.out.printf("이름 : %s\n전화번호 : %s\n이메일 : %s\n주소 : %s\n생일 : %s\n그룹 : %s\n",
										this.name, this.phoneNumber, this.email, this.address,this.birthdate, this.group);
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthdate() {
		return this.birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getGroup() {
		return this.group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
}
