import java.util.Date;

public class Employee {
	// defining fields
	protected String EmployeeName; // has default value null
	protected String EmployeeNumber; // has default value null
	protected Date HireDate;
	protected Address address; // From another class because it has constructers

	// No-argument constructor
	public Employee() {

	}

	// constructor with arguments that mentioned in UML
	public Employee(String employeeName, String employeeNumber, Date hireDate, Address address) {
		super();
		EmployeeName = employeeName;
		EmployeeNumber = employeeNumber;
		HireDate = hireDate;
		this.address = address;
	}

	// getters and setters

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getEmployeeNumber() {
		return EmployeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		EmployeeNumber = employeeNumber;
	}

	public Date getHireDate() {
		return HireDate;
	}

	public void setHireDate(Date hireDate) {
		HireDate = hireDate;
	}

	public Address getAddress() {
		return address;
	}

	// method for checking employee number if true or not
	public boolean isEmpNumperValid() {
		String S = getEmployeeNumber(); // String equal employee number

		if (S.length() != 5) { // employee number must be 5 digits XXX-L where each X: number from 0-10
								// and L : any Capital letter from A to M
			return false;
		} else if (S.length() == 5) {
			if ((S.charAt(0) >= '0') && (S.charAt(0) <= '9'))
				if ((S.charAt(1) >= '0') && (S.charAt(1) <= '9'))
					if ((S.charAt(2) >= '0') && (S.charAt(2) <= '9'))
						if (S.charAt(3) == '-')
							if ((S.charAt(4) >= 'A') && (S.charAt(4) <= 'M'))
								return true;
		}
		return false;
	}

	@Override
	public String toString() { // it should print in String
		return "Employee [Employee Name = " + getEmployeeName() + " Employee Number = " + getEmployeeNumber()
				+ " ,Hire Date = " + getHireDate() + ",  Address = " + getAddress() + ", is Employee Numper Valid = "
				+ isEmpNumperValid() + "]";
	}
}
