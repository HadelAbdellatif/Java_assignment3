import java.util.Date;

public class TeamLeader extends ProductionWorker {// extends : it take all things in class ProductionWorker

	// defining fields
	private double MonthlyBonus;
	private double TrainingHoures;
	private double HouresAttended;

	// No-argument constructor
	TeamLeader() {
		super();// super(): it can use the feilds in Employee class and
		// make a method using them
	}

	public TeamLeader(String employeeName, String employeeNumber, Date hireDate, Address address, int shift,
			double hourlyPayRate, double houresPerMonth, double monthlyBonus, double trainingHoures,
			double houresAttended) {
		super(employeeName, employeeNumber, hireDate, address, shift, hourlyPayRate, houresPerMonth);// super(): it can
																										// use the
																										// fields in
																										// Employee
																										// class and
		// make a method using them
		MonthlyBonus = monthlyBonus;
		TrainingHoures = trainingHoures;
		HouresAttended = houresAttended;
	}

	// getters and setters

	public double getMonthlyBonus() {
		return MonthlyBonus;
	}

	public void setMonthlyBonus(double monthlyBonus) {
		MonthlyBonus = monthlyBonus;
	}

	public double getTrainingHoures() {
		return TrainingHoures;
	}

	public void setTrainingHoures(double trainingHoures) {
		TrainingHoures = trainingHoures;
	}

	public double getHouresAttended() {
		return HouresAttended;
	}

	public void setHouresAttended(double houresAttended) {
		HouresAttended = houresAttended;
	}

	@Override
	// method to calculate the total salary
	public double getTotalSalary() {
		if(super.getTotalSalary() == 0)
			return 0;
		double bonus_achived = ((getMonthlyBonus() * getHouresAttended()) / getTrainingHoures()); // bounas is =
		if (getMonthlyBonus() >= 0 && getTrainingHoures() >= 0 && getHouresAttended() >= 0) { // all of the numbers must
																								// be
																								// in positive
			if (getHouresAttended() < getTrainingHoures()) { // if less than ---> no bounas
				return (super.getTotalSalary());
			} else if (getHouresAttended() == getTrainingHoures()) { // is equal ---> no bounas
				return super.getTotalSalary();
			} else if (getHouresAttended() > getTrainingHoures()) { // if more than ---> bounas
				return (super.getTotalSalary() + bonus_achived);
			}
		}
		return 0;
	}

	@Override
	public String toString() {// it should print in String
		if (getMonthlyBonus() < 0) {
			return super.toString() + "TeamLeader [Monthly Bonus =" + getMonthlyBonus()
					+ " Error !! Monthly Bonus is negative, Training Houres = " + getTrainingHoures()
					+ ", Houres Attended =" + getHouresAttended() + "]";
		} else if (getTrainingHoures() < 0) {
			return super.toString() + "TeamLeader [Monthly Bonus =" + getMonthlyBonus() + " , Training Houres = "
					+ getTrainingHoures() + " Error !! Training Houres is negative, Houres Attended ="
					+ getHouresAttended() + "]";
		} else if (getHouresAttended() < 0) {
			return super.toString() + "TeamLeader [Monthly Bonus =" + getMonthlyBonus() + " , Training Houres = "
					+ getTrainingHoures() + " , Houres Attended =" + getHouresAttended()
					+ " Error !!  Houres Attended is negative]";
		} else
			return super.toString() + "TeamLeader [Monthly Bonus =" + getMonthlyBonus() + " , Training Houres = "
					+ getTrainingHoures() + " , Houres Attended =" + getHouresAttended() + " , Total Salary ="
					+ getTotalSalary() + "]";
	}

}
