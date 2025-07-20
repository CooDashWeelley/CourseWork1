public class Main {
    public static void main(String[] args) {
        Employee[] employeeList = new Employee[10];
        Employee ivanov = new Employee("ivanov", "ivan", "ivanovich", 1, 10000);
        employeeList[0] = ivanov;
        Employee petrov = new Employee("petrov", "petr", "petrovich", 2, 15000);
        employeeList[2] = petrov;
        Employee sergeev = new Employee("sergeev", "sergey", "sergeevich", 3, 50000);
        employeeList[8] = sergeev;


        AllEmployees(employeeList);
        System.out.println(MonthSalary(employeeList));
        System.out.println(EmployeeWithMinSalary(employeeList));
        sergeev.setFirstName("sergei");
        System.out.println(EmployeeWithMaxSalary(employeeList));
        System.out.println(AverageSalary(employeeList));
        FullNameOfAllEmployees(employeeList);

    }

    // a
    public static void AllEmployees(Employee[] choseList) {
        for (int i = 0; i < choseList.length; i++) {
            if (choseList[i] == null) {
                continue;
            }
            System.out.println(choseList[i]);
        }
    }

    // b
    public static int MonthSalary(Employee[] choseList) {
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
    public static Employee EmployeeWithMinSalary(Employee[] choseList) {
        int minSalary = choseList[0].getSalary();
        int id = 0;
        for (int i = 0; i < choseList.length; i++) {
            if (choseList[i] == null) {
                continue;
            }
            if (choseList[i].getSalary() < minSalary) {
                minSalary = choseList[i].getSalary();
                id = i;
            }
        }
        return choseList[id];
    }

    // d
    public static Employee EmployeeWithMaxSalary(Employee[] choseList) {
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
    public static int AverageSalary(Employee[] choseList) {
        int a = 0;
        for (int i = 0; i < choseList.length; i++) {
            if (choseList[i] == null) {
                continue;
            } else {
                a++;
            }
        }
        return MonthSalary(choseList) / a;
    }

    // f
    public static void FullNameOfAllEmployees(Employee[] choseList) {
        for (int i = 0; i < choseList.length; i++) {
            if (choseList[i] == null) {
                continue;
            }
            System.out.println(choseList[i].getFullName());
        }
    }
}
