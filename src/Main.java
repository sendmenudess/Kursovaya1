import java.util.Random;

public class Main {
    public static void createEmployee() {
        EMPLOYEES[0] = new Employee("Ivanon Ivan Ivanich", (byte) RANDOM.nextInt(1,6), RANDOM.nextInt(25000,150000));
        EMPLOYEES[1] = new Employee("Petrov Petr Petrovich", (byte) RANDOM.nextInt(1,6), RANDOM.nextInt(25000,150000));
        EMPLOYEES[2] = new Employee("Mikhailov Ivan Ivanich", (byte) RANDOM.nextInt(1,6), RANDOM.nextInt(25000,150000));
        EMPLOYEES[3] = new Employee("Alexeev George Nikitich", (byte) RANDOM.nextInt(1,6), RANDOM.nextInt(25000,150000));
        EMPLOYEES[4] = new Employee("Semenov Oleg Vladimirivich", (byte) RANDOM.nextInt(1,6), RANDOM.nextInt(25000,150000));
        EMPLOYEES[5] = new Employee("Ivanon Ivan Olegovich", (byte) RANDOM.nextInt(1,6), RANDOM.nextInt(25000,150000));
        EMPLOYEES[6] = new Employee("Semenov Semen Semenovich", (byte) RANDOM.nextInt(1,6), RANDOM.nextInt(25000,150000));
        EMPLOYEES[7] = new Employee("Alexeev Alexey Alexeevich", (byte) RANDOM.nextInt(1,6), RANDOM.nextInt(25000,150000));
        EMPLOYEES[8] = new Employee("Kutuzov Ivan Ilich", (byte) RANDOM.nextInt(1,6), RANDOM.nextInt(25000,150000));
        EMPLOYEES[9] = new Employee("Novikov Danil Olegovich", (byte) RANDOM.nextInt(1,6), RANDOM.nextInt(25000,150000));

    }

    private final static Employee[] EMPLOYEES = new Employee[10];
    private final static Random RANDOM = new Random();


    public static void main(String[] args) {
        createEmployee();
        printEmployees();
        System.out.println("Сумма ЗП по сотрудникам: "+ calculateSalary());
        System.out.println("Sotrudnik s minimalnoy zarplaroy - " + findEmployeeMinSalary());
        System.out.println("Sotrudnik s maximalnoy zarplaroy - " + findEmployeeMaxSalary());
        System.out.println("Srednyaya zarplata - "+findAverageSalary());
        printFIO();
        System.out.println(EMPLOYEES[1].getSalary());
        indexSalary(5);
        System.out.println(EMPLOYEES[1].getSalary());
        printEmloyeesInDept(3);
        System.out.println("Sotrudnik s minimalnoy zarplaroy v 3 otdele - " + findEmployeeMinSalaryInDept(3));
        System.out.println("Sotrudnik s maximalnoy zarplaroy v 3 otdele - " + findEmployeeMaxSalaryInDept(3));
        System.out.println("Srednyaa zarplata v 3 otdele - "+ findAverageSalaryInDept(3));
        indexSalaryInDept(3, 10);
        printEmloyeesInDept(3);
        printEmloyeesLowerSalary(70000);
        printEmloyeesHigherSalary(70000);
    }

    public static void printEmployees() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }
    private static int calculateSalary(){
        int summ = 0;
        for (Employee employee : EMPLOYEES) {
            summ = summ + employee.getSalary();
        }
        return summ;
    }
    private static Employee findEmployeeMinSalary(){
        Employee employeeMinSalary = null;
        for (Employee employee : EMPLOYEES){
            if (employeeMinSalary == null || employee.getSalary()<employeeMinSalary.getSalary()){
                employeeMinSalary = employee;
            }
        }
        return employeeMinSalary;
    }
    private static Employee findEmployeeMaxSalary(){
        Employee employeeMaxSalary = null;
        for (Employee employee : EMPLOYEES){
            if (employeeMaxSalary == null || employee.getSalary()>employeeMaxSalary.getSalary()){
                employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary;
    }
    private static double findAverageSalary(){
        return (double) calculateSalary() / EMPLOYEES.length;
    }

    private static void printFIO(){
        for (Employee employee : EMPLOYEES){
            System.out.println(employee.getName());
        }
    }
    private static void indexSalary(double kef){
        kef = kef/100;
        for (Employee employee : EMPLOYEES){
            employee.setSalary((int) (employee.getSalary() + employee.getSalary()*kef));
        }
    }
    private static Employee findEmployeeMinSalaryInDept(int department){
        Employee employeeMinSalaryInDept = null;
        for (Employee employee : EMPLOYEES) {
            if (employee.getDepartment() == department) {
                if (employeeMinSalaryInDept == null || employee.getSalary() < employeeMinSalaryInDept.getSalary()) {
                    employeeMinSalaryInDept = employee;
                }
            }
        }
        return employeeMinSalaryInDept;
    }
    private static Employee findEmployeeMaxSalaryInDept(int department){
        Employee employeeMaxSalaryInDept = null;
        for (Employee employee : EMPLOYEES) {
            if (employee.getDepartment() == department) {
                if (employeeMaxSalaryInDept == null || employee.getSalary() > employeeMaxSalaryInDept.getSalary()) {
                    employeeMaxSalaryInDept = employee;
                }
            }
        }
        return employeeMaxSalaryInDept;
    }
    private static double findAverageSalaryInDept(int department) {
        int count = 0;
        int summ = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee.getDepartment() == department) {
                summ = summ + employee.getSalary();
                count++;
            }
        }
        return (double) summ / count;
    }
    private static void indexSalaryInDept(int department, double kef) {
        kef = kef / 100;

        Employee employeeMaxSalaryInDept = null;
        for (Employee employee : EMPLOYEES) {
            if (employee.getDepartment() == department) {
                employee.setSalary((int) (employee.getSalary() + employee.getSalary() * kef));
            }
        }
    }
    private static void printEmloyeesInDept(int department) {
        for (Employee employee : EMPLOYEES) {
            if (employee.getDepartment() == department) {
                System.out.println("Name - " + employee.getName() + ", Zarplata - " + employee.getSalary() + ", ID -  " + employee.getId());
            }
        }
    }
    private static void printEmloyeesLowerSalary(int a){
        for (Employee employee : EMPLOYEES){
            if (employee.getSalary()<a){
                System.out.println("ID "+employee.getId()+", Name "+employee.getName()+", zarplata "+employee.getSalary());
            }
        }
    }
    private static void printEmloyeesHigherSalary(int a){
        for (Employee employee : EMPLOYEES){
            if (employee.getSalary()>a){
                System.out.println("ID "+employee.getId()+", Name "+employee.getName()+", zarplata "+employee.getSalary());
            }
        }
    }
}
