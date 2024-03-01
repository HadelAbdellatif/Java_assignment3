import java.util.Date;

public class ShiftSupervisor extends Employee {// extends : it take all things in class Employee

	// defining fields
	private double MonthlySalary;
	private double MonthlyProductionBouns;
	private int NumberOfProductsPro; // produced by team
	private int mustProduce; // must produce

	// No-argument constructor
	ShiftSupervisor() {
		super();// super(): it can use the fields in Employee class and
		// make a method using them
	}

	public ShiftSupervisor(String employeeName, String employeeNumber, Date hireDate, Address address,
			double monthlySalary, double monthlyProductionBouns, int numberOfProductsPro, int mustproduce) {
		super(employeeName, employeeNumber, hireDate, address);// super(): it can use the fields in Employee class and
		// make a method using them
		MonthlySalary = monthlySalary;
		MonthlyProductionBouns = monthlyProductionBouns;
		NumberOfProductsPro = numberOfProductsPro;
		mustProduce = mustproduce;
	}

	// getters and setters
	public double getMonthlySalary() {
		return MonthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		MonthlySalary = monthlySalary;
	}

	public double getMonthlyProductionBouns() {
		return MonthlyProductionBouns;
	}

	public void setMonthlyProductionBouns(double monthlyProductionBouns) {
		MonthlyProductionBouns = monthlyProductionBouns;
	}

	public int getNumberOfProductsPro() {
		return NumberOfProductsPro;
	}

	public void setNumberOfProductsPro(int numberOfProductsPro) {
		NumberOfProductsPro = numberOfProductsPro;
	}

	public int getmustProduce() {
		return mustProduce;
	}

	public void setmustProduce(int mustproduce) {
		mustProduce = mustproduce;
	}

	// method to calculate the total salary
	public double getTotalSalary() {
		if (getmustProduce() >= 0 && getNumberOfProductsPro() >= 0 && getMonthlySalary() >= 0
				&& getMonthlyProductionBouns() >= 0) { // all of the numbers must be in positive
			if (getmustProduce() > getNumberOfProductsPro()) { // if less no bounas and discount{
				double x = getMonthlySalary() - Discount();
				return x;

			} else if (getmustProduce() == getNumberOfProductsPro()) {// if equal no bounas
				return getMonthlySalary();

			} else if (getmustProduce() < getNumberOfProductsPro()) { // if more than ---> bounas
				return (getMonthlySalary() + getMonthlyProductionBouns());

			}
		}
		return 0;
	}

	public double Discount() {
		double Salary;
		Salary = (((getmustProduce() - getNumberOfProductsPro()) / getMonthlySalary()) * getMonthlySalary());
		return Salary;
	}

	@Override
	public String toString() {// it should print in String
		if (getMonthlySalary() < 0) {
			return super.toString() + "ShiftSupervisor [Monthly Salary = " + getMonthlySalary()
					+ " Error !! monthle salary is negative, Monthly Production Bouns = " + getMonthlyProductionBouns()
					+ ", Number Of Products = " + getNumberOfProductsPro() + ", Produce = " + getmustProduce() + "]";
		} else if (getMonthlyProductionBouns() < 0) {
			return super.toString() + "ShiftSupervisor [Monthly Salary = " + getMonthlySalary()
					+ " , Monthly Production Bounds = " + getMonthlyProductionBouns()
					+ " Error !! monthle production bouns is negative, Number Of Products = " + getNumberOfProductsPro()
					+ ", Must Produce = " + getmustProduce() + "]";
		} else if (getNumberOfProductsPro() < 0) {
			return super.toString() + "ShiftSupervisor [Monthly Salary = " + getMonthlySalary()
					+ " , Monthly Production Bouns = " + getMonthlyProductionBouns() + " , Number Of Products = "
					+ getNumberOfProductsPro() + " Error !! production produce is negative , Must Produce = "
					+ getmustProduce() + "]";
		}

		else if (getmustProduce() < 0) {
			return super.toString() + "ShiftSupervisor [Monthly Salary = " + getMonthlySalary()
					+ " , Monthly Production Bouns = " + getMonthlyProductionBouns() + " , Number Of Products = "
					+ getNumberOfProductsPro() + " , Must Produce = " + getmustProduce()
					+ "Error !! production must produce is negative]";
		} else
			return super.toString() + "ShiftSupervisor [Monthly Salary = " + getMonthlySalary()
					+ " , Monthly Production Bouns = " + getMonthlyProductionBouns() + " , Number Of Products = "
					+ getNumberOfProductsPro() + " , Must Produce = " + getmustProduce() + " , Total Salary = "
					+ getTotalSalary() + "]";
	}
}
