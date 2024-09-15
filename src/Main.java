import java.util.Random;


public class Main {




    public static void main(String[] args) {
        EmloyeeBook a = new EmloyeeBook();

        EmloyeeBook.createEmployee();
        System.out.println("Сумма ЗП по сотрудникам: "+a.calculateSalary());
        a.printEmployees();
        System.out.println("Sotrudnik s minimalnoy zarplaroy - " + a.findEmployeeMinSalary());
        System.out.println("Sotrudnik s maximalnoy zarplaroy - " + a.findEmployeeMaxSalary());
        System.out.println("Srednyaya zarplata - "+a.findAverageSalary());
        a.printFIO();

        a.indexSalary(5);

        a.printEmloyeesInDept(3);
        System.out.println("Sotrudnik s minimalnoy zarplaroy v 3 otdele - " + a.findEmployeeMinSalaryInDept(3));
        System.out.println("Sotrudnik s maximalnoy zarplaroy v 3 otdele - " + a.findEmployeeMaxSalaryInDept(3));
        System.out.println("Srednyaa zarplata v 3 otdele - "+ a.findAverageSalaryInDept(3));
        a.indexSalaryInDept(3, 10);
        a.printEmloyeesInDept(3);
        a.printEmloyeesLowerSalary(70000);
        a.printEmloyeesHigherSalary(70000);
        System.out.println("Sotrudnik s id 5 - "+a.findEmployeeWithID(5));
    }


}


