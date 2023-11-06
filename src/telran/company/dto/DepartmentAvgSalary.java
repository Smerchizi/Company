package telran.company.dto;

import java.io.Serializable;

public record DepartmentAvgSalary(String department, int salary) 
implements Serializable {

}
