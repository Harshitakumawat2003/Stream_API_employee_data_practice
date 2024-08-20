import java.util.*;
import java.util.stream.Collectors;

public class EmployeeAnalysis {

    // 1. How many male and female employees are there in the organization?
    public static void countMaleAndFemaleEmployees(List<Employee> employees) {
        Map<String, Long> genderCount = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("Gender Count: " + genderCount);
    }

    // 2. Print the name of all departments in the organization.
    public static void printDepartmentNames(List<Employee> employees) {
        List<String> departments = employees.stream()
                .map(Employee::getDepartment)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Departments: " + departments);
    }

    // 3. What is the average age of male and female employees?
    public static void averageAgeByGender(List<Employee> employees) {
        Map<String, Double> averageAgeByGender = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println("Average Age by Gender: " + averageAgeByGender);
    }

    // 4. Get the details of the highest-paid and second-highest-paid employees in the organization.
    public static void highestAndSecondHighestPaidEmployees(List<Employee> employees) {
        List<Employee> topTwoPaidEmployees = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(2)
                .collect(Collectors.toList());
        System.out.println("Top Two Paid Employees: " + topTwoPaidEmployees);
    }

    // 5. Get the names of all employees who have joined after 2015.
    public static void namesOfEmployeesJoinedAfter2015(List<Employee> employees) {
        List<String> names = employees.stream()
                .filter(e -> e.getYearOfJoining() > 2015)
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println("Employees Joined After 2015: " + names);
    }

    // 6. Count the number of employees in each department.
    public static void countEmployeesInEachDepartment(List<Employee> employees) {
        Map<String, Long> employeeCountByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println("Employee Count by Department: " + employeeCountByDepartment);
    }

    // 7. What is the average salary of each department?
    public static void averageSalaryByDepartment(List<Employee> employees) {
        Map<String, Double> averageSalaryByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Average Salary by Department: " + averageSalaryByDepartment);
    }

    // 8. Who has the most working experience in the organization?
    public static void mostExperiencedEmployee(List<Employee> employees) {
        Optional<Employee> mostExperiencedEmployee = employees.stream()
                .max(Comparator.comparingInt(Employee::getExperience));
        mostExperiencedEmployee.ifPresent(employee -> System.out.println("Most Experienced Employee: " + employee));
    }

    // 9. Get the details of the youngest male employee in each department.
    public static void youngestMaleEmployeeInEachDepartment(List<Employee> employees) {
        Map<String, Optional<Employee>> youngestMaleInDepartment = employees.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("Male"))
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.minBy(Comparator.comparingInt(Employee::getAge))));
        youngestMaleInDepartment.forEach((department, employee) ->
                System.out.println("Youngest Male in " + department + ": " + employee.orElse(null)));
    }

    // 10. What is the average salary and total salary of the whole organization?
    public static void averageAndTotalSalary(List<Employee> employees) {
        DoubleSummaryStatistics salaryStats = employees.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));
        double averageSalary = salaryStats.getAverage();
        double totalSalary = salaryStats.getSum();
        System.out.println("Average Salary: " + averageSalary);
        System.out.println("Total Salary: " + totalSalary);
    }
}
