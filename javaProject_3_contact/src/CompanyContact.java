
public class CompanyContact extends Contact {
	
	private String comName;
	private String deptName;
	private String role;
	
	public CompanyContact(String name, String phoneNumber, String email, String address, String birthdate,
			String group) {
		super(name, phoneNumber, email, address, birthdate, group);
	}
	public CompanyContact(String name, String phoneNumber, String email, String address, String birthdate,
			String group, String comName, String deptName, String role) {
		super(name, phoneNumber, email, address, birthdate, group);
		this.comName = comName;
		this.deptName = deptName;
		this.role = role;
	}
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.printf("회사이름: %s\n부서이름: %s\n직급: %s\n",
				this.comName, this.deptName, this.role);
	}
	public String getComName() {
		return this.comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public String getDeptName() {
		return this.deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
