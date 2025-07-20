public class Main {
    public static void main(String[] args) {
        Employee[] employeeList = new Employee[10];
        Employee ivanov = new Employee("ivanov", "ivan", "ivanovich", 1, 40000);
        employeeList[0] = ivanov;
        Employee antonov = new Employee("antonov", "anton", "antonovich", 5, 20000);
        employeeList[1] = antonov;
        Employee petrov = new Employee("petrov", "petr", "petrovich", 2, 15000);
        employeeList[2] = petrov;
        Employee nikitin = new Employee("nikitin", "nikita", "nikitich", 2, 21000);
        employeeList[6] = nikitin;
        Employee sergeev = new Employee("sergeev", "sergey", "sergeevich", 2, 50000);
        employeeList[8] = sergeev;


        allEmployees(employeeList);
        System.out.println(monthSalary(employeeList));
        System.out.println(employeeWithMinSalary(employeeList));
        sergeev.setFirstName("sergei");
        System.out.println(employeeWithMaxSalary(employeeList));
        System.out.println(averageSalary(employeeList));
        fullNameOfAllEmployees(employeeList);
        indexSalary(employeeList, 5);
        allEmployees(employeeList);
        System.out.println(2);
        System.out.println(minSalaryInDepartment(employeeList, 2));
        System.out.println(maxSalaryInDepartment(employeeList, 2));
        System.out.println(monthSalaryInDepartment(employeeList, 2));
        System.out.println(averageSalaryInDepartment(employeeList, 2));
        employeesInDepartment(employeeList, 2);
        indexSalaryInDepartment(employeeList, 2, 5);
        employeesInDepartment(employeeList, 2);
        salaryLessThan(employeeList, 25000);
        salaryMoreThan(employeeList, 25000);


    }

    // a
    public static void allEmployees(Employee[] choseList) {
        for (int i = 0; i < choseList.length; i++) {
            if (choseList[i] == null) {
                continue;
            }
            System.out.println(choseList[i]);
        }
    }

    // b
    public static int monthSalary(Employee[] choseList) {
        int sum = 0;
        for (int i = 0; i < choseList.length; i++) {
            if (choseList[i] == null) {
                continue;
            }
            sum += choseList[i].getSalary();
        }
        return sum;
    }

    // c
    public static Employee employeeWithMinSalary(Employee[] choseList) {
        int minSalary = choseList[0].getSalary();
        int idOfMinSalary = 0;
        for (int i = 0; i < choseList.length; i++) {
            if (choseList[i] == null) {
                continue;
            }
            if (choseList[i].getSalary() < minSalary) {
                minSalary = choseList[i].getSalary();
                idOfMinSalary = i;
            }
        }
        return choseList[idOfMinSalary];
    }

    // d
    public static Employee employeeWithMaxSalary(Employee[] choseList) {
        int maxSalary = choseList[0].getSalary();
        int id = 0;
        for (int i = 0; i < choseList.length; i++) {
            if (choseList[i] == null) {
                continue;
            }
            if (choseList[i].getSalary() > maxSalary) {
                maxSalary = choseList[i].getSalary();
                id = i;
            }
        }
        return choseList[id];
    }

    // e
    public static int averageSalary(Employee[] choseList) {
        int amountOfEmployee = 0;
        for (int i = 0; i < choseList.length; i++) {
            if (choseList[i] == null) {
                continue;
            } else {
                amountOfEmployee++;
            }
        }
        return monthSalary(choseList) / amountOfEmployee;
    }

    // f
    public static void fullNameOfAllEmployees(Employee[] choseList) {
        for (int i = 0; i < choseList.length; i++) {
            if (choseList[i] == null) {
                continue;
            }
            System.out.println(choseList[i].getFullName());
        }
    }

    public static void indexSalary(Employee[] choseList, int index) {
        for (int i = 0; i < choseList.length; i++) {
            if (choseList[i] == null) {
                continue;
            }
            choseList[i].setSalary(choseList[i].getSalary() + choseList[i].getSalary() / 100 * index);
        }
    }

    public static Employee minSalaryInDepartment(Employee[] choseList, int department) {
        int minSalaryInDepartment = 0;
        int idOfMinSalaryInDepartment = 0;
        for (int i = 0; i < choseList.length; i++) {
            if (choseList[i] == null) {
                continue;
            }
            if (choseList[i].getDepartment() == department && minSalaryInDepartment == 0) {
                minSalaryInDepartment = choseList[i].getSalary();
            }
            if (choseList[i].getDepartment() == department && minSalaryInDepartment >= choseList[i].getSalary()) {
                minSalaryInDepartment = choseList[i].getSalary();
                idOfMinSalaryInDepartment = i;
            }
        }
        return choseList[idOfMinSalaryInDepartment];
    }

    public static Employee maxSalaryInDepartment(Employee[] choseList, int department) {
        int maxSalaryInDepartment = 0;
        int idOfMinSalaryInDepartment = 0;
        for (int i = 0; i < choseList.length; i++) {
            if (choseList[i] == null) {
                continue;
            }
            if (choseList[i].getDepartment() == department && maxSalaryInDepartment == 0) {
                maxSalaryInDepartment = choseList[i].getSalary();
            }
            if (choseList[i].getDepartment() == department && maxSalaryInDepartment <= choseList[i].getSalary()) {
                maxSalaryInDepartment = choseList[i].getSalary();
                idOfMinSalaryInDepartment = i;
            }
        }
        return choseList[idOfMinSalaryInDepartment];
    }

    public static int monthSalaryInDepartment(Employee[] choseList, int department) {
        int sum = 0;
        for (int i = 0; i < choseList.length; i++) {
            if (choseList[i] == null) {
                continue;
            }
            if (choseList[i].getDepartment() == department) {
                sum += choseList[i].getSalary();
            }
        }
        return sum;
    }

    public static int averageSalaryInDepartment(Employee[] choseList, int department) {
        int amountOfEmployeeInDepartment = 0;
        for (int i = 0; i < choseList.length; i++) {
            if (choseList[i] == null) {
                continue;
            }
            if (choseList[i].getDepartment() == department) {
                amountOfEmployeeInDepartment++;
            }
        }
        return monthSalaryInDepartment(choseList, department) / amountOfEmployeeInDepartment;
    }

    public static void indexSalaryInDepartment(Employee[] choseList, int department, int index) {
        for (int i = 0; i < choseList.length; i++) {
            if (choseList[i] == null) {
                continue;
            }
            if (choseList[i].getDepartment() == department) {
                choseList[i].setSalary(choseList[i].getSalary() + choseList[i].getSalary() / 100 * index);
            }
        }
    }

    public static void employeesInDepartment(Employee[] choseList, int department) {
        for (int i = 0; i < choseList.length; i++) {
            if (choseList[i] == null) {
                continue;
            }
            if (choseList[i].getDepartment() == department) {
                System.out.println(choseList[i].getFullName() + ", " + choseList[i].getSalary());
            }
        }
    }

    public static void salaryLessThan (Employee[] choseList, int amount) {
        for (int i = 0; i < choseList.length; i++) {
            if (choseList[i] == null) {
                continue;
            }
            if (amount > choseList[i].getSalary()) {
                System.out.println(choseList[i].getId() + ", " + choseList[i].getFullName() + ", " + choseList[i].getSalary());
            }
        }
    }

    public static void salaryMoreThan (Employee[] choseList, int amount) {
        for (int i = 0; i < choseList.length; i++) {
            if (choseList[i] == null) {
                continue;
            }
            if (amount < choseList[i].getSalary()) {
                System.out.println(choseList[i].getId() + ", " + choseList[i].getFullName() + ", " + choseList[i].getSalary());
            }
        }
    }
}
