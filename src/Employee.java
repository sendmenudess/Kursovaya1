import java.util.Objects;

public class Employee{
    private static int nextId = 1;
    private int id;
    private String name;
    private byte department;
    private int salary;

    public Employee (String name, byte department, int salary){
        this.department = department;
        this.name = name;
        this.salary = salary;
        this.id = nextId++;
    }

    public byte getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setDepartment(byte department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString(){
        return "ФИО " + name +" id "+ id+ " отдел - " + department + " зарплата "+ salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
