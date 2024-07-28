import java.util.ArrayList;
import java.util.List;

// Component
interface Employee {
    void showEmployeeDetails();
}

// Leaf
class Developer implements Employee {
    private String name;
    private long empId;
    private String position;

    public Developer(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name + " " + position);
    }
}

// Leaf
class Manager implements Employee {
    private String name;
    private long empId;
    private String position;

    public Manager(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name + " " + position);
    }
}

// Composite
class Directory implements Employee {
    private List<Employee> employeeList = new ArrayList<Employee>();

    @Override
    public void showEmployeeDetails() {
        for (Employee emp : employeeList) {
            emp.showEmployeeDetails();
        }
    }

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp) {
        employeeList.remove(emp);
    }
}

// Client
public class Company {
    public static void main(String[] args) {
        Developer dev1 = new Developer(100, "John", "Senior Developer");
        Developer dev2 = new Developer(101, "Jane", "Junior Developer");

        Manager man1 = new Manager(200, "Alice", "Project Manager");
        Manager man2 = new Manager(201, "Bob", "Product Manager");

        Directory engineeringDirectory = new Directory();
        engineeringDirectory.addEmployee(dev1);
        engineeringDirectory.addEmployee(dev2);

        Directory managementDirectory = new Directory();
        managementDirectory.addEmployee(man1);
        managementDirectory.addEmployee(man2);

        Directory companyDirectory = new Directory();
        companyDirectory.addEmployee(engineeringDirectory);
        companyDirectory.addEmployee(managementDirectory);

        companyDirectory.showEmployeeDetails();
    }
}
