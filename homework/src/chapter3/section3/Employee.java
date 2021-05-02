package chapter3.section3;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: Employee.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/11 13:28
 */
public class Employee {

    String employeeName;
    String employeeNumber;
    double Salary;
    double salaryGrowthRate;

    public Employee() {

    }

    public Employee(String employeeName, String employeeNumber, double minimumSalary, double salaryGrowthRate) {
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
        this.Salary = minimumSalary;
        this.salaryGrowthRate = salaryGrowthRate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public double getSalary() {
        return Salary;
    }

    public double getSalaryGrowthRate() {
        return salaryGrowthRate;
    }

    public double salaryCalculate() {
        return Salary * (1 + salaryGrowthRate);
    }
}
