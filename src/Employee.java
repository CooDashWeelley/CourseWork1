public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private int department;
    private int salary;
    private int id;
    private static int idCounter = 0;

    public Employee(String lastName, String firstName, String middleName, int department, int salary) {
        id = idCounter++;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String setFirstName(String newFirstName ) {
        return this.firstName = newFirstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String setMiddleName(String newMiddleName) {
        return this.middleName = newMiddleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String setLastName(String newLastName) {
        return this.lastName = newLastName;
    }

    public String getFullName() {
        return this.lastName + " " + this.firstName + " " + this.middleName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int setDepartment(int newDepartment) {
        return this.department = newDepartment;
    }

    public int getSalary() {
        return this.salary;
    }

    public int setSalary(int newSalary) {
        return this.salary = newSalary;
    }

    public int getId() {
        return this.id;
    }

    public int setId(int newId) {
        return this.id = newId;
    }

    @Override
    public String toString() {
        return getFullName() + ", " + department + ", " + salary;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Employee diff = (Employee) other;
        return this.getFullName().equals(diff.getFullName()) && this.salary == diff.salary && this.department == diff.department;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }
}