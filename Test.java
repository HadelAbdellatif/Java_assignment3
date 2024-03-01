import java.util.*;

public class Test {
	public static void main(String[] args) {
		// fill the array list
		ArrayList<Employee> employees = new ArrayList<>();
		Employee emp1 = new ProductionWorker("Hadeel", "119-H", new Date(), new Address(), 1, 30, 350);
		Employee emp2 = new ProductionWorker("Nour", "120-A", new Date(), new Address(), 2, 40, 150);
		Employee emp3 = new ShiftSupervisor("Enas", "1240-B", new Date(), new Address(), 2500, 1000, 700, 750);
		Employee emp4 = new ShiftSupervisor("Asmaa", "130-C", new Date(), new Address(), 7500, 2000, 750, 700);
		Employee emp5 = new TeamLeader("Hanaa", "999-N", new Date(), new Address(), 1, 22, 350, 2500, 45, 60);
		Employee emp6 = new TeamLeader("Amani", "929-5", new Date(), new Address(), 6, 47, 250, 4510, 70, 80);
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		employees.add(emp6);
		for(int m=0 ; m<6 ; m++) {
			System.out.println(employees.get(m));
		}
		System.out.println("                              ");
		System.out.println("Employyes above the average : ");
		System.out.println("                              ");
		ListGreaterThanAverage(employees); // call the method
		
		
	}

	public static void ListGreaterThanAverage(ArrayList<Employee> List) {
		double sum = 0;
		double avr = 0;
		for (int i = 0; i < List.size(); i++) { // casting and calculate the sum

			if (List.get(i) instanceof ProductionWorker)
				sum += ((ProductionWorker) List.get(i)).getTotalSalary();

			else if (List.get(i) instanceof ShiftSupervisor)
				sum += ((ShiftSupervisor) List.get(i)).getTotalSalary();

			else if (List.get(i) instanceof TeamLeader)
				sum += ((TeamLeader) List.get(i)).getTotalSalary();
		}

		avr = sum / List.size(); // calculate the average

		for (int j = 0; j < List.size(); j++) { // casting and print data for employee how has salary more than average
			if (List.get(j) instanceof ProductionWorker)
				if (((ProductionWorker) List.get(j)).getTotalSalary() > avr)
					System.out.println(((ProductionWorker) List.get(j)).toString());

			if (List.get(j) instanceof ShiftSupervisor)
				if (((ShiftSupervisor) List.get(j)).getTotalSalary() > avr)
					System.out.println(((ShiftSupervisor) List.get(j)).toString());

			if (List.get(j) instanceof TeamLeader)
				if (((TeamLeader) List.get(j)).getTotalSalary() > avr)
					System.out.println(((TeamLeader) List.get(j)).toString());
		}
	}

}
