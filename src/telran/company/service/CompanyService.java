package telran.company.service;

import java.util.List;

import telran.company.dto.DepartmentAvgSalary;
import telran.company.dto.Employee;
import telran.company.dto.SalaryIntervalDistribution;

public interface CompanyService {
	Employee hireEmployee (Employee empl);
	Employee fireEmployee(long id);
	Employee getEmployee(long id);
	List<Employee> getEmployeesByDepatment(String department);
	List<Employee> getAllEmployees();
	List<Employee> getEmployeesBySalary(int salaryFrom, int salaryTo);
	List<Employee> getEmployeeByAge(int ageFrom, int ageTo);
	List<DepartmentAvgSalary> salaryDistributionByDepartments();
	List<SalaryIntervalDistribution> getSalaryDistribution(int interval);
	Employee updateDepartment(long id, String newDepartment);
	Employee updateSalary(long id, int newSalary);
	void save(String filePath);
	void restore(String filePath);
}
