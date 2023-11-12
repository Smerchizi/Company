package telran.company.service;

import java.time.LocalDate;
import java.util.*;

import telran.company.dto.DepartmentAvgSalary;
import telran.company.dto.Employee;
import telran.company.dto.SalaryIntervalDistribution;

public class CompanyServiceImpl implements CompanyService {
	HashMap<Long, Employee> employeesMap = new HashMap<>();
	/***********************************************************/
	HashMap<String, Set<Employee>> employeesDepartment = new HashMap<>();
	//key - department, value- Set of employees working in the department
	/*************************************************************/
	TreeMap<Integer, Set<Employee>> employeesSalary = new TreeMap<>();
	//key - salary, value - set of employees having the salary value
	/****************************************************************/
	TreeMap<LocalDate, Set<Employee>> employeesAge = new TreeMap<>();
	//key birth date; value set of employees born at the date
	/*******************************************************************/
	@Override
	/**
	 * adds new Employee into a company
	 * In the case an employee with the given ID already exists,
	 *  the exception IllegalStateException must be thrown
	 *  returns reference to the being added Employee object
	 */
	public Employee hireEmployee(Employee empl) {
		long id = empl.id();
		if (employeesMap.containsKey(id)){
			throw new IllegalStateException("Employee already exists " + id);
		}
		employeesMap.put(id, empl);
		addEmployeeSalary(empl);
		addEmployeeAge(empl);
		addEmployeeDepartment(empl);
		return empl;
	}

	private void addEmployeeDepartment(Employee empl) {
		String department = empl.department();
		Set<Employee> set = employeesDepartment.computeIfAbsent(department,k -> new HashSet<>());
		set.add(empl);
	}

	private void addEmployeeAge(Employee empl) {
		LocalDate birtdate = empl.birthDate();
		Set<Employee> set = employeesAge.computeIfAbsent(birtdate, k -> new HashSet<>());
		set.add(empl);

	}

	private void addEmployeeSalary(Employee empl) {
		employeesSalary.computeIfAbsent(empl.salary(),k -> new HashSet<>()).add(empl);


	}

	@Override
	/**
	 * removes employee object from company according to a given ID
	 * In the case an employee with the given ID doesn't exist 
	 * the method must throw IllegalStateException
	 */
	public Employee fireEmployee(long id) {
		Employee empl = employeesMap.remove(id);
		if (empl == null){
			throw new IllegalStateException("Emlployee not found");
		}
		removeEmployeesDepartmnet(empl);
		removeEmployeesSalary(empl);
		removeEmployeesAge(empl);
		return empl;
	}

	private void removeEmployeesSalary(Employee empl) {
		int salary = empl.salary();
		Set<Employee> set = employeesSalary.get(salary);
		set.remove(empl);
		if (set.isEmpty()){
			employeesSalary.remove(salary);
		}
	}

	private void removeEmployeesAge(Employee empl) {
		LocalDate birthDate = empl.birthDate();
		Set<Employee> set = employeesAge.get(birthDate);
		set.remove(empl);

		if (set.isEmpty()){
			employeesAge.remove(birthDate);

		}
	}

	private void removeEmployeesDepartmnet(Employee empl) {
		String department = empl.department();
		Set<Employee> set = employeesDepartment.get(department);
		set.remove(empl);
		if (set.isEmpty()){
			employeesDepartment.remove(department);
		}
	}

	@Override
	/**
	 * returns reference to Employee object with a given ID value
	 * in the case employee with the ID doesn't exist
	 * the method returns null
	 */
	public Employee getEmployee(long id) {
		// TODO Auto-generated method stub O[1]
		return null;
	}

	@Override
	/**
	 * returns list of employee objects working in a given department
	 * in the case none employees in the department, the method returns empty list
	 */
	public List<Employee> getEmployeesByDepartment(String department) {
		// TODO Auto-generated method stub O[1]
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub O[N]
		return null;
	}

	@Override
	public List<Employee> getEmployeesBySalary(int salaryFrom, int salaryTo) {
		// TODO Auto-generated method stub O[LogN]
		return null;
	}

	@Override
	public List<Employee> getEmployeeByAge(int ageFrom, int ageTo) {
		// TODO Auto-generated method stub O[LogN]
		return null;
	}

	@Override
	public List<DepartmentAvgSalary> salaryDistributionByDepartments() {
		// TODO Auto-generated method stub O[N]
		return null;
	}

	@Override
	public List<SalaryIntervalDistribution> getSalaryDistribution(int interval) {
		// TODO Auto-generated method stub O[N]
		return null;
	}

	@Override
	public Employee updateDepartment(long id, String newDepartment) {
		// TODO Auto-generated method stub O[1]
		return null;
	}

	@Override
	public Employee updateSalary(long id, int newSalary) {
		// TODO Auto-generated method stub O[LogN]
		return null;
	}

	@Override
	public void save(String filePath) {
		// TODO Auto-generated method stub O[N]

	}

	@Override
	public void restore(String filePath) {
		// TODO Auto-generated method stub O[N]

	}

}
