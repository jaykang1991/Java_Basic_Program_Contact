import java.util.Scanner;

public class SmartPhone {

	Contact[] contacts;
	int countOfContact = 0;
	Scanner in;
	
	public void SmartPhone() {
		contacts = new Contact[10];
		in = new Scanner(System.in);
	}
	
	public Contact inputContactData(int type) {
		System.out.print("이름: ");
		String name = in.nextLine();
		System.out.print("전화번호: ");
		String phoneNumber = in.nextLine();
		System.out.print("이메일: ");
		String email = in.nextLine();
		System.out.print("주소: ");
		String address = in.nextLine();
		System.out.print("생일: ");
		String birthdate = in.nextLine();
		System.out.print("그룹: ");
		String group = in.nextLine();
		Contact contact = null;
		
		if(type == 1) {
			System.out.print("회사이름: ");
			String comName = in.nextLine();
			System.out.print("부서이름: ");
			String deptName = in.nextLine();
			System.out.print("직급: ");
			String role = in.nextLine();
			contact = new CompanyContact(name, phoneNumber, email, address, birthdate, group, comName, deptName, role);
		} else if(type ==2) {
			System.out.print("거래처회사이름: ");
			String customerName = in.nextLine();
			System.out.print("취급품목: ");
			String item = in.nextLine();
			System.out.print("직급: ");
			String role = in.nextLine();
			contact = new CustomerContact(name, phoneNumber, email, address, birthdate, group, customerName, item, role);
		} 
		return contact;
	}
	
	public void addContact(Contact contact) {
		contacts[countOfContact] = contact;
		countOfContact ++;
	}
	public void printContact(Contact contact) {
		contact.printInfo();
	}
	public void printAllContact() {
		for(int i = 0; i < countOfContact; i++) {
			printContact(contacts[i]);
		}
	}
	public Contact searchContact(String name) {
		for(int i = 0; i < countOfContact; i++) {
			Contact contact = contacts[i];
			if (contact.getName().contentEquals(name)) {
				printContact(contact);
				return contact;
			}
		}
		System.out.println("연락처가 없습니다.");
		return null;
	}
	public void deleteContact(String name) {
		for(int i = 0; i < countOfContact; i++) {
			Contact contact = contacts[i];
			if(contact.getName().contentEquals(name)) {
				for(int j = i; j < countOfContact; j++) {
					contacts[j] = contacts[j+1];
				}
				countOfContact --;
				return;
			}
		}
	}
	public void editContact(String name, Contact newContact) {
		for(int i = 0; i < countOfContact; i++) {
			if (contacts[i].getName().contentEquals(name)) {
				contacts[i] = newContact;
				return;
			}
		}
	}
	
	
}




















