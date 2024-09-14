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
}
