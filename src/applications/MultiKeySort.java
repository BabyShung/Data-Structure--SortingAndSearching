package applications;

import java.util.Arrays;
import java.util.Comparator;

public class MultiKeySort {

	public void Sort() {
		Employee[] tmp = { new Employee("Hao", "Zheng"),
				new Employee("Hao", "Chen"), new Employee("Sam", "Sun"),
				new Employee("Tim", "Sun"), new Employee("Hao", "Deng") };
		Arrays.sort(tmp, new EmployeeComparator());
		print(tmp);
	}

	private void print(Employee[] e) {
		for (int i = 0; i < e.length; i++)
			System.out.println(e[i].surName + "," + e[i].givenName);

	}

	/**
	 * self-defined comparator, not stable!
	 * if want it to be stable, sort twice. first sort by givenN, then sort by surN
	 * 
	 */
	private class EmployeeComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee e1, Employee e2) {
			int diff = e1.surName.compareToIgnoreCase(e2.surName);
			if (diff == 0)
				diff = e1.givenName.compareToIgnoreCase(e2.givenName);
			return diff;
		}
	}

	/**
	 * example class
	 * 
	 */
	private class Employee {
		private String givenName;
		private String surName;

		public Employee(String givenName, String surName) {
			this.givenName = givenName;
			this.surName = surName;
		}

	}

}
