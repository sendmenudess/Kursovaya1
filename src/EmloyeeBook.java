import java.util.Random;

public class EmloyeeBook {
    static void createEmployee() {
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

    protected void printEmployees() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }
    protected int calculateSalary(){
        int summ = 0;
        for (Employee employee : EMPLOYEES) {
            summ = summ + employee.getSalary();
        }
        return summ;
    }
    protected Employee findEmployeeMinSalary(){
        Employee employeeMinSalary = null;
        for (Employee employee : EMPLOYEES){
            if (employeeMinSalary == null || employee.getSalary()<employeeMinSalary.getSalary()){
                employeeMinSalary = employee;
            }
        }
        return employeeMinSalary;
    }
    protected Employee findEmployeeMaxSalary(){
        Employee employeeMaxSalary = null;
        for (Employee employee : EMPLOYEES){
            if (employeeMaxSalary == null || employee.getSalary()>employeeMaxSalary.getSalary()){
                employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary;
    }
    protected double findAverageSalary(){
        return (double) calculateSalary() / EMPLOYEES.length;
    }

    protected void printFIO(){
        for (Employee employee : EMPLOYEES){
            System.out.println(employee.getName());
        }
    }
    protected void indexSalary(double kef){
        kef = kef/100;
        for (Employee employee : EMPLOYEES){
            employee.setSalary((int) (employee.getSalary() + employee.getSalary()*kef));
        }
    }
    protected Employee findEmployeeMinSalaryInDept(int department){
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
    protected Employee findEmployeeMaxSalaryInDept(int department){
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
    protected double findAverageSalaryInDept(int department) {
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
    protected void indexSalaryInDept(int department, double kef) {
        kef = kef / 100;

        Employee employeeMaxSalaryInDept = null;
        for (Employee employee : EMPLOYEES) {
            if (employee.getDepartment() == department) {
                employee.setSalary((int) (employee.getSalary() + employee.getSalary() * kef));
            }
        }
    }
    protected void printEmloyeesInDept(int department) {
        for (Employee employee : EMPLOYEES) {
            if (employee.getDepartment() == department) {
                System.out.println("Name - " + employee.getName() + ", Zarplata - " + employee.getSalary() + ", ID -  " + employee.getId());
            }
        }
    }
    protected void printEmloyeesLowerSalary(int a){
        for (Employee employee : EMPLOYEES){
            if (employee.getSalary()<a){
                System.out.println("ID "+employee.getId()+", Name "+employee.getName()+", zarplata "+employee.getSalary());
            }
        }
    }
    protected void printEmloyeesHigherSalary(int a){
        for (Employee employee : EMPLOYEES){
            if (employee.getSalary()>a){
                System.out.println("ID "+employee.getId()+", Name "+employee.getName()+", zarplata "+employee.getSalary());
            }
        }
    }
    protected void deleteEmloyee(int id){
        for (Employee employee : EMPLOYEES){
            if (employee.getId() == id){
                employee = null;
            }
        }
    }
    protected void addEmloyee(String name, byte dep, int salary){
        for (Employee employee : EMPLOYEES){
            if (employee == null){
                employee = new Employee(name, dep, salary);
            }
            else {
                System.out.println("Ошибка, нет свободных мест");
            }
        }
    }
    protected Employee findEmployeeWithID(int id){
        for (Employee employee : EMPLOYEES){
            if (employee.getId() == id){
                return employee;
            }
        }
        return null;
    }
}
