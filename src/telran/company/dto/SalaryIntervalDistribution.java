package telran.company.dto;

import java.io.Serializable;

public record SalaryIntervalDistribution(int salaryFrom, int salaryTo, long amount)
implements Serializable{

}
