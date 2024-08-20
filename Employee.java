import java.util.Objects;

public class Employee {
    private String name;
    private String gender;
    private String department;
    private int age;
    private double salary;
    private int yearOfJoining;
    private int experience;

    public Employee(String name, String gender, String department, int age, double salary, int yearOfJoining, int experience) {
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.yearOfJoining = yearOfJoining;
        this.experience = experience;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", yearOfJoining=" + yearOfJoining +
                ", experience=" + experience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Double.compare(employee.salary, salary) == 0 &&
                yearOfJoining == employee.yearOfJoining &&
                experience == employee.experience &&
                Objects.equals(name, employee.name) &&
                Objects.equals(gender, employee.gender) &&
                Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, department, age, salary, yearOfJoining, experience);
    }
}
