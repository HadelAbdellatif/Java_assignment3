import java.util.Date;

public class ProductionWorker extends Employee { // extends : it take all things in class Employee
	// defining fields
	private int Shift;
	private double HourlyPayRate;
	private double HouresPerMonth;

	// No-argument constructor
	ProductionWorker() {
		super(); // super(): it can use the feilds in Employee class and
		// make a method using them
	}

	// constructor with arguments that mentioned in UML
	public ProductionWorker(String employeeName, String employeeNumber, Date hireDate, Address address, int shift,
			double hourlyPayRate, double houresPerMonth) {
		super(employeeName, employeeNumber, hireDate, address); // super(): it can use the feilds in Employee class and
																// make a method using them
		Shift = shift;
		HourlyPayRate = hourlyPayRate;
		HouresPerMonth = houresPerMonth;
	}

	// getters and setters

	public int getShift() {
		return Shift;
	}

	public void setShift(int shift) {
		Shift = shift;
	}

	public double getHourlyPayRate() {
		return HourlyPayRate;
	}

	public void setHourlyPayRate(double hourlyPayRate) {
		HourlyPayRate = hourlyPayRate;
	}

	public double getHouresPerMonth() {
		return HouresPerMonth;
	}

	public void setHouresPerMonth(double houresPerMonth) {
		HouresPerMonth = houresPerMonth;
	}

	// method to calculate the total salary
	public double getTotalSalary() {
		double Salary = 0.0; // had value 0.0
        // shift should be 1 for day or 2 for night

			if (getShift() == 1) {
              
				if (getHourlyPayRate() >= 0) { // hourly pay rate should be positive
					if (getHouresPerMonth() < 208) { // if he work less than 8 hours in day
						Salary = (getHourlyPayRate() * getHouresPerMonth());
						return Salary;
					} else if (getHouresPerMonth() >= 208) {// if he work 8 or more than 8 hours in day
						Salary = ((208 * getHourlyPayRate())
								+ ((getHouresPerMonth() - 208) * 1.25 * getHourlyPayRate()));
						return Salary;

					}
				}
			}

			else if (getShift() == 2) {
				if (getHourlyPayRate() >= 0) {
					if (getHouresPerMonth() < 182) {// if he work less than 7 hours in night
						Salary = (getHourlyPayRate() * getHouresPerMonth());
						return Salary;

					} else if (getHouresPerMonth() >= 182) {// if he work 7 or more than 7 hours in night
						Salary = ((182 * getHourlyPayRate())
								+ ((getHouresPerMonth() - 182) * 1.5 * getHourlyPayRate()));
						return Salary;
					}
				}
			}
		
		return 0;

	}

	@Override
	public String toString() {// it should print in String
		if (getShift() != 1 && getShift() != 2) {
			return super.toString() + " ProductionWorker [Shift = " + getShift()
					+ " There is an error in Shift , it must be 1 for day or 2 for night, Hourly Pay Rate = "
					+ getHourlyPayRate() + ", Houres Per Month = " + getHouresPerMonth() + "]";
		} else if (getHourlyPayRate() < 0) {
			return super.toString() + " ProductionWorker [Shift = " + getShift() + ", Hourly Pay Rate = "
					+ getHourlyPayRate() + " Error !! The number of Hourly Pey Rate is negative, Houres Per Month = "
					+ getHouresPerMonth() + "]";
		} else if (getHouresPerMonth() < 0) {
			return super.toString() + " ProductionWorker [Shift = " + getShift() + ", Hourly Pay Rate = "
					+ getHourlyPayRate() + ", Houres Per Month = " + getHouresPerMonth()
					+ " Error !! The number of Hours Per Month is negative ]";
		} else
			return super.toString() + " ProductionWorker [Shift = " + getShift() + ", Hourly Pay Rate = "
					+ getHourlyPayRate() + ", Houres Per Month = " + getHouresPerMonth() + " , Total Salary = "
					+ getTotalSalary() + "]";
	}
}
