import java.time.temporal.Temporal;

public class EmployeeBook {
    private Employee[] employeeBook;

    public EmployeeBook() {
        this.employeeBook = new Employee[10];
    }

    public void addEmployee(String lastName, String firstName, String middleName, int department, int salary) {
        for (int i = 0; i < this.employeeBook.length; i++) {
            if (this.employeeBook[i] == null) {
                Employee newEmployee = new Employee(lastName, firstName, middleName, department, salary);
                this.employeeBook[i] = newEmployee;
                break;
            } else if (this.employeeBook[i] != null) {
                continue;
            } else {
                System.out.println("not enough space");
            }
        }
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < this.employeeBook.length; i++) {
            if (this.employeeBook[i] == null) {
                continue;
            }
            if (this.employeeBook[i].getId() == id) {
                this.employeeBook[i] = null;
                break;
            }
        }
    }

    public Employee findEmployeeById(int id) {
        for (Employee employee : this.employeeBook) {
            if (employee == null) {
                continue;
            }
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void allEmployees() {
        for (Employee employee : this.employeeBook) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee);
        }
    }

    public int monthSalary() {
        int sum = 0;
        for (Employee employee : this.employeeBook) {
            if (employee == null) {
                continue;
            }
            sum += employee.getSalary();
        }
        return sum;
    }

    public Employee minSalary() {
        int minSalary = this.employeeBook[0].getSalary();
        int idOfMinSalary = 0;
        for (int i = 0; i < this.employeeBook.length; i++) {
            if (this.employeeBook[i] == null) {
                continue;
            }
            if (this.employeeBook[i].getSalary() < minSalary) {
                minSalary = this.employeeBook[i].getSalary();
                idOfMinSalary = i;
            }
        }
        return this.employeeBook[idOfMinSalary];
    }

    public Employee maxSalary() {
        int maxSalary = this.employeeBook[0].getSalary();
        int id = 0;
        for (int i = 0; i < this.employeeBook.length; i++) {
            if (this.employeeBook[i] == null) {
                continue;
            }
            if (this.employeeBook[i].getSalary() > maxSalary) {
                maxSalary = this.employeeBook[i].getSalary();
                id = i;
            }
        }
        return this.employeeBook[id];
    }

    public int averageSalary() {
        int amountOfEmployee = 0;
        for (Employee employee : this.employeeBook) {
            if (employee == null) {
                continue;
            } else {
                amountOfEmployee++;
            }
        }
        return monthSalary() / amountOfEmployee;
    }

    public void fullNameOfAllEmployees() {
        for (Employee employee : this.employeeBook) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee.getFullName());
        }
    }

    public void indexSalary(int index) {
        for (Employee employee : this.employeeBook) {
            if (employee == null) {
                continue;
            }
            employee.setSalary(employee.getSalary() + employee.getSalary() / 100 * index);
        }
    }

    public Employee minSalaryInDepartment(int department) {
        int minSalaryInDepartment = 0;
        int idOfMinSalaryInDepartment = 0;
        for (int i = 0; i < this.employeeBook.length; i++) {
            if (this.employeeBook[i] == null) {
                continue;
            }
            if (this.employeeBook[i].getDepartment() == department && minSalaryInDepartment == 0) {
                minSalaryInDepartment = this.employeeBook[i].getSalary();
            }
            if (this.employeeBook[i].getDepartment() == department && minSalaryInDepartment >= this.employeeBook[i].getSalary()) {
                minSalaryInDepartment = this.employeeBook[i].getSalary();
                idOfMinSalaryInDepartment = i;
            }
        }
        return this.employeeBook[idOfMinSalaryInDepartment];
    }

    public Employee maxSalaryInDepartment(int department) {
        int maxSalaryInDepartment = 0;
        int idOfMinSalaryInDepartment = 0;
        for (int i = 0; i < this.employeeBook.length; i++) {
            if (this.employeeBook[i] == null) {
                continue;
            }
            if (this.employeeBook[i].getDepartment() == department && maxSalaryInDepartment == 0) {
                maxSalaryInDepartment = this.employeeBook[i].getSalary();
            }
            if (this.employeeBook[i].getDepartment() == department && maxSalaryInDepartment <= this.employeeBook[i].getSalary()) {
                maxSalaryInDepartment = this.employeeBook[i].getSalary();
                idOfMinSalaryInDepartment = i;
            }
        }
        return this.employeeBook[idOfMinSalaryInDepartment];
    }

    public int monthSalaryInDepartment(int department) {
        int sum = 0;
        for (Employee employee : this.employeeBook) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public int averageSalaryInDepartment(int department) {
        int amountOfEmployeeInDepartment = 0;
        for (Employee employee : this.employeeBook) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == department) {
                amountOfEmployeeInDepartment++;
            }
        }
        return monthSalaryInDepartment(department) / amountOfEmployeeInDepartment;
    }

    public void indexSalaryInDepartment(int department, int index) {
        for (Employee employee : this.employeeBook) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() + employee.getSalary() / 100 * index);
            }
        }
    }

    public void employeesInDepartment(int department) {
        for (Employee employee : this.employeeBook) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == department) {
                System.out.println("ФИО: " + employee.getFullName() + ", ЗП: " + employee.getSalary());
            }
        }
    }

    public void salaryLessThan(int amount) {
        for (Employee employee : this.employeeBook) {
            if (employee == null) {
                continue;
            }
            if (amount > employee.getSalary()) {
                System.out.println("id: " + employee.getId() + ", ФИО: " + employee.getFullName() + ", ЗП: " + employee.getSalary());
            }
        }
    }

    public void salaryMoreThan(int amount) {
        for (Employee employee : this.employeeBook) {
            if (employee == null) {
                continue;
            }
            if (amount < employee.getSalary()) {
                System.out.println("id: " + employee.getId() + ", ФИО: " + employee.getFullName() + ", ЗП: " + employee.getSalary());
            }
        }
    }
}
