import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("John Doe", "Male", "Engineering", 30, 70000, 2016, 8));
        employees.add(new Employee("Jane Smith", "Female", "Marketing", 25, 65000, 2018, 6));
        employees.add(new Employee("Emily Davis", "Female", "Engineering", 28, 75000, 2017, 5));
        employees.add(new Employee("Michael Brown", "Male", "HR", 35, 68000, 2014, 12));
        employees.add(new Employee("Chris Johnson", "Male", "Marketing", 40, 72000, 2015, 15));
        employees.add(new Employee("Laura Wilson", "Female", "HR", 32, 69000, 2016, 10));
        employees.add(new Employee("Olivia Lee", "Female", "Engineering", 26, 77000, 2020, 3));
        employees.add(new Employee("James Clark", "Male", "Marketing", 27, 64000, 2022, 2));

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Call the methods with the employees list
        EmployeeAnalysis.countMaleAndFemaleEmployees(employees);
        EmployeeAnalysis.printDepartmentNames(employees);
        EmployeeAnalysis.averageAgeByGender(employees);
        EmployeeAnalysis.highestAndSecondHighestPaidEmployees(employees);
        EmployeeAnalysis.namesOfEmployeesJoinedAfter2015(employees);
        EmployeeAnalysis.countEmployeesInEachDepartment(employees);
        EmployeeAnalysis.averageSalaryByDepartment(employees);
        EmployeeAnalysis.mostExperiencedEmployee(employees);
        EmployeeAnalysis.youngestMaleEmployeeInEachDepartment(employees);
        EmployeeAnalysis.averageAndTotalSalary(employees);
    }
}
