public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook1 = new EmployeeBook();

        employeeBook1.addEmployee("ivanov", "ivan", "ivanovich", 1, 40000);
        employeeBook1.addEmployee("antonov", "anton", "antonovich", 5, 20000);
        employeeBook1.addEmployee("petrov", "petr", "petrovich", 2, 15000);
        employeeBook1.addEmployee("nikitin", "nikita", "nikitich", 2, 21000);
        employeeBook1.addEmployee("sergeev", "sergey", "sergeevich", 2, 50000);
        employeeBook1.addEmployee("a", "v", "s", 3, 50000);

        employeeBook1.allEmployees();
        employeeBook1.removeEmployee(5);
        employeeBook1.allEmployees();
        employeeBook1.employeesInDepartment(2);
        employeeBook1.indexSalary(10);
        employeeBook1.allEmployees();
        employeeBook1.addEmployee("a", "v", "s", 3, 45000);
        employeeBook1.addEmployee("z", "x", "c", 4, 35000);
        employeeBook1.addEmployee("q", "w", "e", 1, 27000);
        employeeBook1.salaryLessThan(30000);
        System.out.println(employeeBook1.maxSalaryInDepartment(1));
        employeeBook1.findEmployeeById(6).setFirstName("Valera");
        employeeBook1.findEmployeeById(6).setSalary(36000);
        System.out.println(employeeBook1.findEmployeeById(6));

    }
}
