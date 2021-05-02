package chapter3.section3;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: TestEmployee.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/11 13:42
 */
public class TestEmployee {

    public static void main(String[] args) {
        Employee employee = new Employee("张三", "A0015", 10000, 0.05);
        String employeeName = employee.getEmployeeName();
        String employeeNumber = employee.getEmployeeNumber();
        double Salary = employee.getSalary();
        double salaryGrowthRate = employee.getSalaryGrowthRate();

        System.out.println(employee.salaryCalculate());
    }
}
