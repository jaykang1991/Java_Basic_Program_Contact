import java.util.Scanner;

public class SmartPhoneMain {
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			printMenu();
			String choiceMenu = sc.nextLine();
			
			if(choiceMenu.equals("1")) {
				smartPhone.addContact(smartPhone.inputContactData(1));
			} else if(choiceMenu.equals("2")) {
				smartPhone.addContact(smartPhone.inputContactData(2));
			} else if(choiceMenu.equals("3")) {
				smartPhone.printAllContact();
			} else if(choiceMenu.equals("4")) {
				System.out.print("검색할 이름: ");
				smartPhone.searchContact(sc.nextLine());
			} else if(choiceMenu.equals("5")) {
				System.out.print("삭제할 이름: ");
				smartPhone.deleteContact(sc.nextLine());
			} else if(choiceMenu.equals("6")) {
				
				System.out.print("수정할 이름: ");
				String name = sc.nextLine();
				Contact contact = smartPhone.searchContact(name);
				
				if (contact != null) {
					if (contact instanceof CompanyContact) {
						smartPhone.editContact(name, smartPhone.inputContactData(1));
					} else if (contact instanceof CustomerContact) {
						smartPhone.editContact(name, smartPhone.inputContactData(2));
					}
				}
			} else if(choiceMenu.equals("7")) {
				System.out.println("시스템 종료");
				return;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
	}
	public static void printMenu() {
		System.out.println("Contact ----------------------");
		System.out.println(">> 1. 연락처등록(회사)");
		System.out.println(">> 2. 연락처등록(거래처)");
		System.out.println(">> 3. 모든 연락처 출력");
		System.out.println(">> 4. 연락처 검색");
		System.out.println(">> 5. 연락서 삭제");
		System.out.println(">> 6. 연락처 수정");
		System.out.println(">> 7. 프로그램 종료");
		System.out.println("-------------------------");
	}
}
